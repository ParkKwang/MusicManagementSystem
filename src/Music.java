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
		this.title = title; //this: ���� ��ü�� ��� �ǹ̷�, class��ü�� title�� ����ϰ� �Ǹ�,
		this.singer = singer; // field�� title�� parameter title�� �����ϱ� ���� �����
		this.genre = genre; //this�� ������ parameter�� ó����. ���� ���ϴ°� �������� ���� title �̶�� ���� �ְ� �����ű� ������ this�� �� �־�� ��
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
	
	public void printInfo() {//static�� ������ �޸𸮿� �ٷ� �ø��� �ƴϳ� -> �ٷ� ����� �� �ִ� �̶�� �ǹ� / print����� �׽� �ʿ��ϳ�, �޸𸮿��� �ʿ��� ���� �ø��� �ǹǷ� ���⼭�� static�� �ʿ� ���� 
		System.out.print("Title: " + title + ", Singer: " + singer + ", Genre: " + genre + ", Composer: " + composer);
		System.out.println(", Relesed in " + date2 + "." + date1 + "." + date3);
	}
	
	public int comfirmDecision(String menu, int i) {
		System.out.println("Are you sure you want to " + menu + " this music? - 1: Yes, 2: No");
		i = input.nextInt();
		return i;
		}
	
}
	
