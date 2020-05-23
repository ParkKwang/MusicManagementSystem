import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {//idea note: 선호하는 노래 보여주는거 -> 즐겨찾기
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MusicManager mm = getObject("musicmanager.ser");
		if (mm == null) {
			mm = new MusicManager(input);
			System.out.println("bad" + input);
		}
		else if (mm != null) {
			mm.setScanner(input);
			System.out.println("good" + input);
		}
		
		selectMenu(input, mm);
		putObject(mm, "musicmanager.ser");
	}
	
	public static void selectMenu(Scanner input, MusicManager mm) {
		int select = 0;

		while (select != 5) { //가사 입력 배너, 재생목록(장르별)
			try {
				showMenu();
				select = input.nextInt();
				if (select == 1) {
					System.out.println();
					mm.addmusic();
					logger.log("add a music");
				}
				else if (select == 2) {
					System.out.println();
					mm.deletemusic();
					logger.log("delete a music");
				}
				else if (select == 3) {
					System.out.println();
					mm.editmusic();
					logger.log("edit a music");
				}
				else if (select == 4) {
					System.out.println();
					mm.viewmusiclist();
					logger.log("view music list");
				}
				else if (select == 5) {
					break;
				}
				else {
					System.out.println("Select a number between 1 and 5");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Select a number between 1 and 5");
				if (input.hasNext()) {
					input.next();
				}
				select = -1;
				System.out.println();
			}
		}

		System.out.println("Thank you for using!");
	}
	
	public static void showMenu() {
		System.out.print("| Music PlayList |\n");
		System.out.println("** Manage Tool **");
		System.out.println("  1. Add Music");
		System.out.println("  2. Delete Music");
		System.out.println("  3. Edit Music");
		System.out.println("  4. View Music Lists");
		System.out.println("  5. Exit");
		System.out.print("-Select a menu: ");
	}
	
	public static MusicManager getObject(String filename) {
		MusicManager mm = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			mm = (MusicManager)in.readObject();
			
			in.close();
			file.close();
		}
		catch (FileNotFoundException e) {
			return mm;
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return mm;
	}
	
	public static void putObject(MusicManager mm, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(mm);
			
			out.close();
			file.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}