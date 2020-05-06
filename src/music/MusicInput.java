package music;

import java.util.Scanner;

public interface MusicInput {
	public MusicCategory getCategory();
	public String getTitle();
	public void setTitle(String title);
	public void setSinger(String singer);
	public void setComposer(String composer);
	public void setDate1(int date1);
	public void setDate2(int date2);
	public void setDate3(int date3);
	public void printInfo();
	public void getUserInput(Scanner input);
	public void setTitle(Scanner input);
	public void setSinger(Scanner input);
	public void setComposer(Scanner input);
	public void setDates(Scanner input);
}
