import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager { //idea note: 선호하는 노래 보여주는거 -> 즐겨찾기
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MusicManager mm = new MusicManager(input);
		
		selectMenu(input, mm);
	}
	
	public static void selectMenu(Scanner input, MusicManager mm) {
		int select = 0;

		while (select != 5) { //가사 입력 배너, 재생목록(장르별)
			try {
				showMenu();
				select = input.nextInt();
				if (select == 1) {
					System.out.println();
					mm.addmusic();
				}
				else if (select == 2) {
					System.out.println();
					mm.deletemusic();
				}
				else if (select == 3) {
					System.out.println();
					mm.editmusic();
				}
				else if (select == 4) {
					System.out.println();
					mm.viewmusiclist();
				}
				else {
					System.out.println("Select a number between 1 and 5");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Select a number between 1 and 5");
				if (input.hasNext()) {
					input.next();
				}
				select = -1;
				System.out.println();
			}
		}

		System.out.println("Thank you for using!");
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