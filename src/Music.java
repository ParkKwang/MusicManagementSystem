import java.util.Scanner;

public class Music {
	Scanner input;
	
	Music(Scanner input) {
		this.input = input;
	}
	
	String title;
	String singer;
	String genre;
	String composer;
	int date1;
	int date2;
	int date3;
	
	public Music() {
	}
	
	public Music(String title, String singer, String genre) {
		this.title = title; //this: 나의 객체의 라는 의미로, class객체의 title을 취급하게 되며,
		this.singer = singer; // field의 title과 parameter title을 구분하기 위해 사용함
		this.genre = genre; //this가 없으면 parameter로 처리됨. 내가 원하는건 생성자의 값에 title 이라는 값을 넣고 싶은거기 때문에 this를 꼭 넣어야 함
	}
	
	public Music(String title, String singer, String genre, String composer, int date1, int date2, int date3) {
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.composer = composer;
		this.date1 = date1;
		this.date2 = date2;
		this.date3 = date3;
	}
	
	public void printInfo() {//static의 유무는 메모리에 바로 올리냐 아니냐 -> 바로 사용할 수 있는 이라는 의미 / print기능은 항시 필요하나, 메모리에서 필요할 때만 올리면 되므로 여기서는 static이 필요 없음 
		System.out.print("Title: " + title + ", Singer: " + singer + ", Genre: " + genre + ", Composer: " + composer);
		System.out.println(", Relesed in " + date2 + "." + date1 + "." + date3);
	}
	
	public int comfirmDecision(String menu, int i) {
		System.out.println("Are you sure you want to " + menu + " this music? - 1: Yes, 2: No");
		i = input.nextInt();
		return i;
		}
	
}
	
