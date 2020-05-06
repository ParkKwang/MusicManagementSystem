package music;
import java.util.Scanner;

public abstract class Music implements MusicInput{
	Scanner input;
	
	public Music(Scanner input) {
		this.input = input;
	}
	
	protected MusicCategory category;
	protected String title;
	protected String singer;
	protected String composer;
	protected int date1;
	protected int date2;
	protected int date3;

	public Music() {
	}
	
	public Music(MusicCategory category) {
		this.category = category;
	}
	
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	public Music(String title, String singer, String composer, int date1, int date2, int date3) {
		this.title = title;
		this.singer = singer;
		this.composer = composer;
		this.date1 = date1;
		this.date2 = date2;
		this.date3 = date3;
	}
	
	public Music(MusicCategory category, String title, String singer, String composer, int date1, int date2, int date3) {
		this.category = category;
		this.title = title;
		this.singer = singer;
		this.composer = composer;
		this.date1 = date1;
		this.date2 = date2;
		this.date3 = date3;
	}
	
	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}

	public MusicCategory getCategory() {
		return category;
	}

	public void setCategory(MusicCategory category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getDate1() {
		return date1;
	}

	public void setDate1(int date1) {
		this.date1 = date1;
	}

	public int getDate2() {
		return date2;
	}

	public void setDate2(int date2) {
		this.date2 = date2;
	}

	public int getDate3() {
		return date3;
	}

	public void setDate3(int date3) {
		this.date3 = date3;
	}
	
	public abstract void printInfo();
	
	public void setTitle(Scanner input) {
		System.out.print("Enter the title of the music: ");
		String title = input.nextLine();
		this.setTitle(title);
	}
	
	public void setSinger(Scanner input) {
		System.out.print("Name of the singer: ");
		String singer = input.nextLine();
		this.setSinger(singer);
	}
	
	public void setComposer(Scanner input) {
		System.out.print("Composer: ");
		String composer = input.nextLine();
		this.setComposer(composer);
	}
	
	public void setDates(Scanner input) {
		System.out.print("The day released: ");
		int date1 = input.nextInt();
		this.setDate1(date1);
		System.out.print("Month: ");
		int date2 = input.nextInt();
		this.setDate2(date2);
		System.out.print("Year: ");
		int date3 = input.nextInt();
		this.setDate3(date3);
	}
	
	public String setGenre() {
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
		
		return genre;
	}
}