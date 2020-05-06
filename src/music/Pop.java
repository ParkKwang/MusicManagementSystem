package music;

import java.util.Scanner;

public class Pop extends Music{
	public Pop(MusicCategory category) {
		this.category = category;
	}
	
	public void printInfo() { 
		String genre = setGenre();
		System.out.println("Genre: " + genre + ", Title: " + title + ", Singer: " + singer + ", Composer: " + composer
				+ ", Relesed in " + date2 + "." + date1 + "." + date3);
	}
	
	public void getUserInput(Scanner input) {
		setTitle(input);
		setSinger(input);
		setComposer(input);
		setDates(input);
		
		System.out.println();
	}
}
