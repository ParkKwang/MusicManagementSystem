package music;

import java.util.Scanner;

public class Dance extends SpecificMusic{
	public Dance(MusicCategory category) {
		this.category = category;
	}
	
	public void getUserInput(Scanner input) {
		setNationedTitle(input);
		setGroupSinger(input);		
		setComposer(input);
		setDates(input);
		
		System.out.println();
	}
}
