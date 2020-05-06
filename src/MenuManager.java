import java.util.Scanner;

public class MenuManager { //idea note: 선호하는 노래 보여주는거 -> 즐겨찾기
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MusicManager mm = new MusicManager(input);
		
		int select = 0;
		
		while (select != 5) { //가사 입력 배너, 재생목록(장르별)
			showMenu();
			select = input.nextInt();
			switch(select) {
			case 1:
				System.out.println();
				mm.addmusic();
				break;
			case 2:
				System.out.println();
				mm.deletemusic();
				break;
			case 3:
				System.out.println();
				mm.editmusic();
				break;
			case 4:
				System.out.println();
				mm.viewmusiclist();
				break;
			default:
					continue;
			}
		System.out.println("Thank you for using!");
		}
	}
	
	public static void showMenu() {
		System.out.print("| Music PlayList |\n");
		System.out.println("** Manage Tool **");
		System.out.println("  1. Add Music");
		System.out.println("  2. Delete Music");
		System.out.println("  3. Edit Music");
		System.out.println("  4. View Music Lists");
		System.out.println("  5. Exit");
		System.out.print("-Select a menu: ");
	}
}