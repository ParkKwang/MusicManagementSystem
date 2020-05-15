import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import music.Ballad;
import music.Dance;
import music.Music;
import music.MusicCategory;
import music.MusicInput;
import music.Pop;
import music.Rock;

public class MusicManager {
	ArrayList<MusicInput> musics = new ArrayList<MusicInput>(); //Music이라는 class를 다루는 배열 musics
	Scanner input;

	public MusicManager(Scanner input) {
		this.input = input;
	}

	public void addmusic() {
		MusicInput musicInput = null;

		int num = 0;
		while (num != 1 && num != 2 && num != 3 && num != 4) {
			try {
				showAddMenu();
				num = input.nextInt();
				switch (num) {
				case 1:
					addPOP(musicInput, input);
					break;
				case 2:
					addBallad(musicInput, input);
					break;
				case 3:
					addDance(musicInput, input);
					break;
				case 4:
					addRock(musicInput, input);
					break;
				default:
					System.out.println("Select a number between 1 and 4");
					continue;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Select a number between 1 and 4");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
				System.out.println();
			}
		}
	}

	public void showAddMenu() {
		System.out.println("*Add Music*");
		System.out.println("1. POP");
		System.out.println("2. Ballad");
		System.out.println("3. Dance");
		System.out.println("4. Rock");
		System.out.print("Select Category: ");
	}

	public void addPOP(MusicInput musicInput, Scanner input) {
		musicInput = new Pop(MusicCategory.POP);
		musicInput.getUserInput(input);
		musics.add(musicInput);
	}

	public void addBallad(MusicInput musicInput, Scanner input) {
		musicInput = new Ballad(MusicCategory.Ballad);
		musicInput.getUserInput(input);
		musics.add(musicInput);
	}

	public void addDance(MusicInput musicInput, Scanner input) {
		musicInput = new Dance(MusicCategory.Dance);
		musicInput.getUserInput(input);
		musics.add(musicInput);
	}

	public void addRock(MusicInput musicInput, Scanner input) {
		musicInput = new Rock(MusicCategory.Rock);
		musicInput.getUserInput(input);
		musics.add(musicInput);
	}

	public void deletemusic() {
		String musictitle = title(input, "delete");
		int index = findIndex(musictitle);

		deleting(index);
	}

	public int findIndex(String musictitle) {
		int index = -1;
		for (int i = 0; i < musics.size(); i++) {	//그런 음악이 있는가 확인하기
			if (musics.get(i).getTitle().equals(musictitle)) {
				index = i;
				break;
			}
		}

		return index;
	}

	public int deleting(int index) {
		if (index >= 0) {	//음악 삭제
			int x = 5;
			x = comfirmDecision("delete", 3);
			switch(x) {
			case 1:
				System.out.println("The music has been deleted!\n");
				musics.remove(index);
				return 1;
			case 2:
				System.out.println("Execution canceled..");
				System.out.println("Exit delete menu..\n");
				return 1;
			default:
				System.out.println("Error: Invalid Input\n");
				return -1;
			}
		}
		else {	//그런 음악 없음
			System.out.println("There's no music with the title.");
			System.out.println("Exit delete menu..\n");
			return -1;
		}
	}

	public void editmusic() {
		String musictitle = title(input, "edit");
		for (int i = 0; i < musics.size(); i++) {
			MusicInput musicInput = musics.get(i);

			if (musicInput.getTitle().equals(musictitle)) {
				int select = 0;
				while (select != 5) { //가사 입력 배너, 재생목록
					try { 
						showEditMenu();
						select = input.nextInt();
						switch (select) {
						case 1:
							String buf = input.nextLine();
							musicInput.setTitle(input);
							break;
						case 2:
							String buf2 = input.nextLine();
							musicInput.setSinger(input);
							break;
						case 3:
							String buf3 = input.nextLine();
							musicInput.setComposer(input);
							break;
						case 4:
							musicInput.setDates(input);
							break;
						default:
							System.out.println("Error: Invalid Input\n");
							continue;
						}
						System.out.println();
					}
					catch (InputMismatchException e) {
						System.out.println("Select a number between 1 and 4");
						if (input.hasNext()) {
							input.next();
						}
						select = -1;
						System.out.println();
					}
				}

				break;
			}
		}
	}

	public void showEditMenu() {
		System.out.println("** Edit Tool **");
		System.out.println("  1. Edit Title");
		System.out.println("  2. Edit Singer");
		System.out.println("  3. Edit Composer");
		System.out.println("  4. Edit Date");
		System.out.println("  5. Exit");
		System.out.print("-Select a menu: ");
	}

	public void viewmusiclist() {
		int number = 0;
		while (number != 1 && number != 2 && number != 3 && number != 4 && number != 5) {
			try {
				showViewMenu();
				number = input.nextInt(); 
				switch (number) {
				case 1:
					showAllMusic();
					break;
				case 2:
					showPopMusic();
					break;
				case 3:
					showBalladMusic();
					break;
				case 4:
					showDanceMusic();
					break;
				case 5:
					showRockMusic();
					break;
				default:
					System.out.println("Select a number between 1 and 5");
					continue;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Select a number between 1 and 4");
				if (input.hasNext()) {
					input.next();
				}
				number = -1;
				System.out.println();
			}
		}
	}

	public void showViewMenu() {
		System.out.println("1: View All Musics");
		System.out.println("2: View POP Musics");
		System.out.println("3: View Ballad Musics");
		System.out.println("4: View Dance Musics");
		System.out.println("5: View Rock Musics");
		System.out.print("-Select a number: ");
	}

	public void showAllMusic() {
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

	public void showPopMusic() {
		System.out.println();
		for (int i = 0; i < musics.size(); i++) {
			if (musics.get(i).getCategory() == MusicCategory.POP) {
				musics.get(i).printInfo();
			}
			else { //POP music이 없음 출력 -> 하나도 없음을 검사하는 방법
			}
		}
		System.out.println();
	}

	public void showBalladMusic() {
		System.out.println();
		for (int i = 0; i < musics.size(); i++) {
			if (musics.get(i).getCategory() == MusicCategory.Ballad) {
				musics.get(i).printInfo();
			}
			else {
			}
		}
		System.out.println();
	}

	public void showDanceMusic() {
		System.out.println();
		for (int i = 0; i < musics.size(); i++) {
			if (musics.get(i).getCategory() == MusicCategory.Dance) {
				musics.get(i).printInfo();
			}
			else {
			}
		}
		System.out.println();
	}

	public void showRockMusic() {
		System.out.println();
		for (int i = 0; i < musics.size(); i++) {
			if (musics.get(i).getCategory() == MusicCategory.Rock) {
				musics.get(i).printInfo();
			}
			else {
			}
		}
		System.out.println();
	}

	public String title(Scanner input, String menu) {
		String buf = input.nextLine();
		System.out.print("Enter a title of the music to " + menu + ": ");
		String musictitle = input.nextLine();
		return musictitle;
	}

	public int comfirmDecision(String menu, int i) {
		while (i != 1 || i != 2) {
			try {
			System.out.println("Are you sure you want to " + menu + " this music? - 1: Yes, 2: No");
			i = input.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Select a number between 1 and 4");
				if (input.hasNext()) {
					input.next();
				}
				i = -1;
				System.out.println();
			}
		}
		return i;
	}
}