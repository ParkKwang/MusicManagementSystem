package music;

import java.util.Scanner;

public class Rock extends SpecificMusic{
	public Rock(MusicCategory category) {
		this.category = category;
	}

	public void printInfo() { 
		String genre = setGenre();
		printInfoifUnknownDates(genre);
	}
	
	public void getUserInput(Scanner input) {
		setNationedTitle(input);
		setGroupSinger(input);
		setComposer(input);
		setDatesifUnknown(input);

		System.out.println();
	}
}
