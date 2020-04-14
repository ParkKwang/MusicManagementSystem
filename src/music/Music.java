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
		this.title = title; //this: 나의 객체의 라는 의미로, class객체의 title을 취급하게 되며,
		this.singer = singer; // field의 title과 parameter title을 구분하기 위해 사용함
		//this가 없으면 parameter로 처리됨. 내가 원하는건 생성자의 값에 title 이라는 값을 넣고 싶은거기 때문에 this를 꼭 넣어야 함
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
	
	public void printInfo() {//static의 유무는 메모리에 바로 올리냐 아니냐 -> 바로 사용할 수 있는 이라는 의미 / print기능은 항시 필요하나, 메모리에서 필요할 때만 올리면 되므로 여기서는 static이 필요 없음 
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
