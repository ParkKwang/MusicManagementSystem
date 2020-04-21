package music;

import java.util.Scanner;

public class Dance extends Music{
	protected String nation;

	public Dance(MusicCategory category) {
		this.category = category;
	}

	public void printInfo() { 
		String genre = "music";
		switch (this.category) {
		case POP:
			genre = "POP";
			break;
		case Ballad:
			genre = "Ballad";
			break;
		case Dance:
			genre = "Dance";
			break;
		case Rock:
			genre = "Rock";
			break;
		default:
		}
		if (this.nation.equals("Domestic") || this.nation.equals("domestic")) {
			System.out.println("Genre: " + genre + "(국내), Title: " + title + ", Singer: " + singer + ", Composer: " + composer
					+ ", Relesed in " + date2 + "." + date1 + "." + date3);
		}
		else if (this.nation.equals("Foreign") || this.nation.equals("foreign")) {
			System.out.println("Genre: " + genre + "(국외), Title: " + title + ", Singer: " + singer + ", Composer: " + composer
					+ ", Relesed in " + date2 + "." + date1 + "." + date3);
		}
	}

	public void getUserInput(Scanner input) {
		String buf = input.nextLine();

		String answer = "hello";
		while (answer != "domestic" && answer != "Domestic" && answer != "Foreign" && answer != "foreign") {
			System.out.print("Is this a domestic or a foreign dance music? ");		
			answer = input.nextLine();
			if (answer.equals("Domestic") || answer.equals("domestic")) {
				this.nation = answer;
				System.out.print("Enter the title of the music: ");
				String title = input.nextLine();
				this.setTitle(title);
				break;
			}
			else if (answer.equals("Foreign") || answer.equals("foreign")) {
				this.nation = answer;
				System.out.print("Enter the title of the music: ");
				String title = input.nextLine();
				this.setTitle(title);
				break;
			}
			else {
			}
		}

		char answer2 = 'a';
		while (answer2 != 'Y' && answer2 != 'y' && answer2 != 'N' && answer2 != 'n') {
			System.out.print("Is an artist a group? - Y/N ");
			answer2 = input.next().charAt(0);
			if (answer2 == 'Y' || answer2 == 'y') {
				String buf2 = input.nextLine();
				System.out.print("Enter the name of the group: ");
				String singer = input.nextLine();
				this.setSinger(singer);
				break;
			}
			else if (answer2 == 'N' || answer2 == 'n') {
				String buf2 = input.nextLine();
				System.out.print("Enter the name of the singer: ");
				String singer = input.nextLine();
				this.setSinger(singer);
				break;
			}
			else {
			}
		}
		
		System.out.print("Composer: ");
		String composer = input.nextLine();
		this.setComposer(composer);

		System.out.print("The day released: ");
		int date1 = input.nextInt();
		this.setDate1(date1);

		System.out.print("Month: ");
		int date2 = input.nextInt();
		this.setDate2(date2);

		System.out.print("Year: ");
		int date3 = input.nextInt();
		this.setDate3(date3);

		System.out.println();
	}
}
