import java.util.Scanner;//view menu 삭제,메뉴 수정, 두 개 이상의 필드, 생성자, 메소드 

public class MenuManager { //idea note: 재생횟수 체크, 선호하는 노래 보여주는거
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MusicManager mm = new MusicManager(input);
		
		int select = 0;
		
		while (select != 5) { //가사 입력 배너, 재생목록
			System.out.print("| Music PlayList |\n");
			System.out.println("** Manage Tool **");
			System.out.println("  1. Add Music");
			System.out.println("  2. Delete Music");
			System.out.println("  3. Edit Music");
			System.out.println("  4. View Music Info"); //전체 리스트, 장르별?
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
				mm.viewmusicinfo();
			}
			
		}
		System.out.println("Thank you for using!");
		
	}
}