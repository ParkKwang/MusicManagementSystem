import java.util.ArrayList;
import java.util.Scanner;

import music.Ballad;
import music.Music;

public class MusicManager {
	ArrayList<Music> musics = new ArrayList<Music>(); //Music�̶�� class�� �ٷ�� �迭 musics
	Scanner input;
	
	public MusicManager(Scanner input) {
		this.input = input;
	}
	
	public void addmusic() {
		Music music;
		
		int num = 0;
		while (num != 1 && num != 2) {
			System.out.println("*Add Music*");
			System.out.println("1. POP");
			System.out.println("2. Ballad");
			System.out.print("Select Category: ");
			num = input.nextInt();
			if (num == 1) {
				music = new Music();
				music.getUserInput(input);
				musics.add(music);
				break;
			}
			else if (num == 2) {
				music = new Ballad();
				music.getUserInput(input);
				musics.add(music);
				break;
			}
			else {
				System.out.println("Select a number between 1 or 2");
			}
		}
	}
	
	public void deletemusic() {
		String buf = input.nextLine();	//� ���� ������ ���ΰ�
		System.out.print("Enter a title of the music to delete: ");
		String musictitle = input.nextLine();
		
		int index = -1; //-1 �� index�� NULL�̶�� ��
		for (int i = 0; i < musics.size(); i++) {	//�׷� ������ �ִ°� Ȯ���ϱ�
			if (musics.get(i).getTitle().equals(musictitle)) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {	//���� ����
			Music music = new Music(input);
			
			int x = 5;
			x = music.comfirmDecision("delete", 3);
			if (x == 1) {
				System.out.println("The music has been deleted!\n");
				musics.remove(index);
			}
			else if (x == 2) {
				System.out.println("Execution canceled..");
				System.out.println("Exit delete menu..\n");
				return;
			}
		}
		else {	//�׷� ���� ����
			System.out.println("There's no music with the title.");
			System.out.println("Exit delete menu..\n");
			return;
		}
	}
	
	public void editmusic() {
		String buf = input.nextLine();
		System.out.print("Enter a title of the music to edit: ");
		String musictitle = input.nextLine();
		for (int i = 0; i < musics.size(); i++) {
			Music music = musics.get(i);
			
			if (music.getTitle().equals(musictitle)) {
				int select = 0;
				
				while (select != 5) { //���� �Է� ���, ������
					System.out.println("** Edit Tool **");
					System.out.println("  1. Edit Title");
					System.out.println("  2. Edit Singer");
					System.out.println("  3. Edit Composer");
					System.out.println("  4. Edit Date");
					System.out.println("  5. Exit");
					System.out.print("-Select a menu: ");
					
					select = input.nextInt();
					if (select == 1) {
						buf = input.nextLine();
						System.out.print("Enter the title of the music: ");
						String title = input.nextLine();
						music.setTitle(title);
					}
					else if (select == 2) {
						buf = input.nextLine();
						System.out.print("Name of the singer: ");
						String singer = input.nextLine();
						music.setSinger(singer);
					}
					else if (select == 3) {
						buf = input.nextLine();
						System.out.print("Composer: ");
						String composer = input.nextLine();
						music.setComposer(composer);
					}
					else if (select == 4) {
						System.out.print("The day released: ");
						int date1 = input.nextInt();
						music.setDate1(date1);
						System.out.print("Month: ");
						int date2 = input.nextInt();
						music.setDate2(date2);
						System.out.print("Year: ");
						int date3 = input.nextInt();
						music.setDate3(date3);
					}
					System.out.println();
					
				}
				break;
			}
		}
	}
	
	public void viewmusiclist() {
		int number = 0;
		while (number != 1 && number != 2 && number != 3 && number != 4 && number != 5 && number != 6) {
			System.out.println("1: View All Musics");
			System.out.println("2: View POP Musics");
			System.out.println("3: View Balad(����) Musics");
			System.out.println("4: View Balad(����) Musics");
			System.out.println("5: View Dance Musics");
			System.out.println("6: View Rock Musics");
			System.out.print("-Select a number: ");
			number = input.nextInt(); 
			if (number == 1) {
				if (musics.get(0).equals(null)) {
					System.out.println("\nThere's no music in the list!");
				}
				else {
					System.out.println();
					for (int i = 0; i < musics.size(); i++) {
						musics.get(i).printInfo();
					}
					System.out.println();
				}
			}
			else if (number == 2) {
				for (int i = 0; i < musics.size(); i++) {
					if (musics.get(i).getGenre().equals("POP")) {
						musics.get(i).printInfo();
					}
					else { //POP music�� ���� ��� -> �ϳ��� ������ �˻��ϴ� ���
					}
				}
				System.out.println();
			}
			else if (number == 3) {
				for (int i = 0; i < musics.size(); i++) {
					if (musics.get(i).getGenre().equals("Balad(����)")) {
						musics.get(i).printInfo();
					}
					else {
					}
				}
				System.out.println();
			}
			else if (number == 4) {
				for (int i = 0; i < musics.size(); i++) {
					if (musics.get(i).getGenre().equals("Balad(����)")) {
						musics.get(i).printInfo();
					}
					else {
					}
				}
				System.out.println();
			}
			else if (number == 5) {
				for (int i = 0; i < musics.size(); i++) {
					if (musics.get(i).getGenre().equals("Dance")) {
						musics.get(i).printInfo();
					}
					else {
					}
				}
				System.out.println();
			}
			else if (number == 6) {
				for (int i = 0; i < musics.size(); i++) {
					if (musics.get(i).getGenre().equals("Rock")) {
						musics.get(i).printInfo();
					}
					else {
					}
				}
				System.out.println();
			}
			else {
				System.out.println("Select a number between 1 and 6");
			}
		}
	}
	
}
