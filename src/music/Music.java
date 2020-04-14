package music;
import java.util.Scanner;

public class Music {
	Scanner input;
	
	public Music(Scanner input) {
		this.input = input;
	}
	
	protected MusicCategory category = MusicCategory.POP;
	protected String title;
	protected String singer;
	protected String composer;
	protected int date1;
	protected int date2;
	protected int date3;
	protected String genre = "POP";

	public Music() {
	}
	
	public Music(String title, String singer) {
		this.title = title; //this: ���� ��ü�� ��� �ǹ̷�, class��ü�� title�� ����ϰ� �Ǹ�,
		this.singer = singer; // field�� title�� parameter title�� �����ϱ� ���� �����
		//this�� ������ parameter�� ó����. ���� ���ϴ°� �������� ���� title �̶�� ���� �ְ� �����ű� ������ this�� �� �־�� ��
	}
	
	public Music(String title, String singer, String composer, int date1, int date2, int date3) {
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void printInfo() {//static�� ������ �޸𸮿� �ٷ� �ø��� �ƴϳ� -> �ٷ� ����� �� �ִ� �̶�� �ǹ� / print����� �׽� �ʿ��ϳ�, �޸𸮿��� �ʿ��� ���� �ø��� �ǹǷ� ���⼭�� static�� �ʿ� ���� 
		System.out.print("Genre: " + genre + ", Title: " + title + ", Singer: " + singer + ", Composer: " + composer);
		System.out.println(", Relesed in " + date2 + "." + date1 + "." + date3);
	}
	
	public int comfirmDecision(String menu, int i) {
		System.out.println("Are you sure you want to " + menu + " this music? - 1: Yes, 2: No");
		i = input.nextInt();
		return i;
		}
	
	public void getUserInput(Scanner input) {
		String buf = input.nextLine();
		System.out.print("Enter the title of the music: ");
		String title = input.nextLine();
		this.setTitle(title);
		
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
