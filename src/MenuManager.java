import java.util.Scanner;//view menu ����,�޴� ����, �� �� �̻��� �ʵ�, ������, �޼ҵ� 

public class MenuManager { //idea note: ���Ƚ�� üũ, ��ȣ�ϴ� �뷡 �����ִ°�
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MusicManager mm = new MusicManager(input);
		
		int select = 0;
		
		while (select != 5) { //���� �Է� ���, ������
			System.out.print("| Music PlayList |\n");
			System.out.println("** Manage Tool **");
			System.out.println("  1. Add Music");
			System.out.println("  2. Delete Music");
			System.out.println("  3. Edit Music");
			System.out.println("  4. View Music Info"); //��ü ����Ʈ, �帣��?
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