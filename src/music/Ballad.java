package music;

import java.util.Scanner;

public class Ballad extends SpecificMusic{
	public Ballad(MusicCategory category) {
		this.category = category;
	}
	
	public void getUserInput(Scanner input) {
		setNationedTitle(input);
		setSinger(input);
		setComposer(input);
		setDates(input);
		
		System.out.println();
	}
}