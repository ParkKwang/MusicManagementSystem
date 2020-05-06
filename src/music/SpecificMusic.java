package music;

import java.util.Scanner;

public abstract class SpecificMusic extends Music {
	protected String nation;
	
	public abstract void getUserInput(Scanner input);

	public void printInfo() { 
		String genre = setGenre();
		if (this.nation.equals("Domestic") || this.nation.equals("domestic")) {
			System.out.println("Genre: " + genre + "(국내), Title: " + title + ", Singer: " + singer + ", Composer: " + composer
					+ ", Relesed in " + date2 + "." + date1 + "." + date3);
		}
		else if (this.nation.equals("Foreign") || this.nation.equals("foreign")) {
			System.out.println("Genre: " + genre + "(국외), Title: " + title + ", Singer: " + singer + ", Composer: " + composer
					+ ", Relesed in " + date2 + "." + date1 + "." + date3);
		}
	}

	public void setNationedTitle(Scanner input) {
		String buf = input.nextLine();
		String answer = "hello";
		while (answer != "domestic" && answer != "Domestic" && answer != "Foreign" && answer != "foreign") {
			System.out.print("Is this a domestic ballad or a foreign ballad? ");		
			answer = input.nextLine();
			if (answer.equals("Domestic") || answer.equals("domestic")) {
				this.nation = answer;
				setTitle(input);
				break;
			}
			else if (answer.equals("Foreign") || answer.equals("foreign")) {
				this.nation = answer;
				setTitle(input);
				break;
			}
			else {
			}
		}
	}
	
	public void setGroupSinger(Scanner input) {
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
	}
	
	public void setDatesifUnknown(Scanner input) {
		char answer2 = 'a';
		while (answer2 != 'Y' && answer2 != 'y' && answer2 != 'N' && answer2 != 'n') {
			System.out.print("Do you know the release date? - Y/N ");
			answer2 = input.next().charAt(0);
			if (answer2 == 'Y' || answer2 == 'y') {
				System.out.print("The day released: ");
				int date1 = input.nextInt();
				this.setDate1(date1);

				System.out.print("Month: ");
				int date2 = input.nextInt();
				this.setDate2(date2);

				System.out.print("Year: ");
				int date3 = input.nextInt();
				this.setDate3(date3);
				break;
			}
			else if (answer2 == 'N' || answer2 == 'n') {
				this.setDate1(1);
				this.setDate2(1);
				this.setDate3(1);
				break;
			}
		}
	}
	
	public void printInfoifUnknownDates(String genre) {
		if (this.nation.equals("Domestic") || this.nation.equals("domestic")) {
			System.out.print("Genre: " + genre + "(국내), Title: " + title + ", Singer: " + singer + ", Composer: " + composer);
			if (this.date1 == 1 && this.date2 == 1 && this.date3 == 1) {
				System.out.println(", Released date: N/A");
			}
			else if (this.date1 != 1 && this.date2 != 1 && this.date3 != 1) {
				System.out.println(", Relesed in " + date2 + "." + date1 + "." + date3);
			}
		}
		else if (this.nation.equals("Foreign") || this.nation.equals("foreign")) {
			System.out.print("Genre: " + genre + "(국내), Title: " + title + ", Singer: " + singer + ", Composer: " + composer);
			if (this.date1 == 1 && this.date2 == 1 && this.date3 == 1) {
				System.out.println(", Released date: N/A");
			}
			else if (this.date1 != 1 && this.date2 != 1 && this.date3 != 1) {
				System.out.println(", Relesed in " + date2 + "." + date1 + "." + date3);
			}
		}
	}
}
