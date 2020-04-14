import java.util.Scanner;

public class MenuManager { //idea note: 선호하는 노래 보여주는거 -> 즐겨찾기
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MusicManager mm = new MusicManager(input);
		
		int select = 0;
		
		while (select != 5) { //가사 입력 배너, 재생목록(장르별)
			System.out.print("| Music PlayList |\n");
			System.out.println("** Manage Tool **");
			System.out.println("  1. Add Music");
			System.out.println("  2. Delete Music");
			System.out.println("  3. Edit Music");
			System.out.println("  4. View Music Lists");
			System.out.println("  5. Exit");
			System.out.print("-Select a menu: ");
			
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
			
		}
		System.out.println("Thank you for using!");
		
	}
}