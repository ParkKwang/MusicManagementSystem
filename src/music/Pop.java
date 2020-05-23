package music;

import java.util.Scanner;

import log.EventLogger;

public class Pop extends Music{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4999041843045282675L;
	
	static EventLogger logger = new EventLogger("log.txt");
	
	public Pop(MusicCategory category) {
		this.category = category;
	}
	
	public void printInfo() { 
		String genre = setGenre();
		System.out.println("Genre: " + genre + ", Title: " + title + ", Singer: " + singer + ", Composer: " + composer
				+ ", Relesed in " + date2 + "." + date1 + "." + date3);
	}
	
	public void getUserInput(Scanner input) {
		String buf = input.nextLine();
		setTitle(input);
		logger.log("entered a POP music title");
		setSinger(input);
		logger.log("entered a singer");
		setComposer(input);
		logger.log("entered a composer");
		setDates(input);
		logger.log("entered a date of music released");
		
		System.out.println();
	}
}
