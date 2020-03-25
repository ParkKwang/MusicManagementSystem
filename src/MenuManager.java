import java.util.Scanner;

public class MenuManager { //idea note: 재생횟수 체크, 선호하는 노래 보여주는거
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int select = 0;
		
		while (select != 6) { //가사 입력 배너, 재생목록
			System.out.print("| Music PlayList |\n");
			System.out.println("** Manage Tool **");
			System.out.println("  1. Add Music");
			System.out.println("  2. Delete Music");
			System.out.println("  3. Edit Music");
			System.out.println("  4. View Music List"); //장르별로
			System.out.println("  5. Show a menu");
			System.out.println("  6. Exit\n");
			System.out.print("Select a menu: ");
			
			select = input.nextInt();
			if (select == 1) {
				System.out.println();
				addmusic();
			}
			else if (select == 2) {
				System.out.println();
				deletemusic();
			}
			else if (select == 3) {
				System.out.println();
				editmusic();
			}
			else if (select == 4) {
				System.out.println();
				viewmusiclist();
			}
			
			System.out.println();
		}
	}
	
	public static void addmusic() {
		Scanner input = new Scanner(System.in);
		
		String title, singer, genre, composer;
		int date1, date2, date3;
		
		System.out.print("Enter a title of the music: ");
		title = input.nextLine();
		System.out.print("Name of the singer: ");
		singer = input.nextLine();
		System.out.print("Genre of the music: ");
		genre = input.nextLine();
		System.out.print("Composer: ");
		composer = input.nextLine();
		System.out.print("The day released: ");
		date1 = input.nextInt();
		System.out.print("Month: ");
		date2 = input.nextInt();
		System.out.print("Year: ");
		date3 = input.nextInt();
	}
	
	public static void deletemusic() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a title of the music: ");
		String title = input.nextLine();
	}
	
	public static void editmusic() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a title of the music: ");
		String title = input.nextLine();
	}
	
	public static void viewmusiclist() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a title of the music: ");
		String title = input.nextLine();
	}
}