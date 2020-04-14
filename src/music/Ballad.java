package music;

import java.util.Scanner;

public class Ballad extends Music {
	public void getUserInput(Scanner input) {
		String buf = input.nextLine();
		
		String answer = "hello";
		while (answer != "domestic" && answer != "Domestic" && answer != "Foreign" && answer != "foreign") {
			System.out.print("Is this a domestic ballad or a foreign ballad? ");		
			answer = input.nextLine();
			if (answer.equals("Domestic") || answer.equals("domestic")) {
				System.out.print("Enter the title of the music: ");
				String title = input.nextLine();
				this.setTitle(title);
				this.setGenre("Balad(국내)");
				break;
			}
			else if (answer.equals("Foreign") || answer.equals("foreign")) {
				System.out.print("Enter the title of the music: ");
				String title = input.nextLine();
				this.setTitle(title);
				this.setGenre("Balad(국외)");
				break;
			}
			else {
			}
		}
		
		System.out.print("Name of the singer: ");
		String singer = input.nextLine();
		this.setSinger(singer);
		
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
