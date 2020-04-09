import java.util.ArrayList;
import java.util.Scanner;

public class MusicManager {
	ArrayList<Music> musics = new ArrayList<Music>(); //Music�̶�� class�� �ٷ�� �迭 musics
//	Music music; //������ Ÿ�� ����, ������ music�� �䷱ �޸����¸� �����ٴ� �ǹ̷� �ؼ������� ���� �ƹ��� �ּ� ���� x
				 //new�� ���� ���ο� ��ü Music()�� ��������� �������� ������� ��ü�� �ּҸ� ������(������)
	Scanner input;
	
	public MusicManager(Scanner input) {
		this.input = input;
	}
	
	public void addmusic() {
		Music music = new Music();
		
		String buf = input.nextLine();
		System.out.println("*Add Music*");
		System.out.print("Enter the title of the music: ");
		music.title = input.nextLine();
		System.out.print("Name of the singer: ");
		music.singer = input.nextLine();
		System.out.print("Genre of the music: ");
		music.genre = input.nextLine();
		System.out.print("Composer: ");
		music.composer = input.nextLine();
		System.out.print("The day released: ");
		music.date1 = input.nextInt();
		System.out.print("Month: ");
		music.date2 = input.nextInt();
		System.out.print("Year: ");
		music.date3 = input.nextInt();
		System.out.println();
		musics.add(music);
	}
	
	public void deletemusic() {
		String buf = input.nextLine();	//� ���� ������ ���ΰ�
		System.out.print("Enter a title of the music to delete: ");
		String title = input.nextLine();
		
		int index = -1; //-1 �� index�� NULL�̶�� ��
		for (int i = 0; i < musics.size(); i++) {	//�׷� ������ �ִ°� Ȯ���ϱ�
			if (musics.get(i).title.equals(title)) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {	//���� ����
			Music music = new Music(input);
			
			int x = 5;
			x = music.comfirmDecision("delete", 3);
			if (x == 1) {
				System.out.println("The music has been deleted!\n");
				musics.remove(index);
			}
			else if (x == 2) {
				System.out.println("Execution canceled..");
				System.out.println("Exit delete menu..\n");
				return;
			}
		}
		else {	//�׷� ���� ����
			System.out.println("There's no music with the title.");
			System.out.println("Exit delete menu..\n");
			return;
		}
	}
	
	public void editmusic() {
		String buf = input.nextLine();
		System.out.print("Enter a title of the music to edit: ");
		String title = input.nextLine();
		for (int i = 0; i < musics.size(); i++) {
			Music music = musics.get(i);
			
			if (music.title.equals(title)) {
				int select = 0;
				
				while (select != 6) { //���� �Է� ���, ������
					System.out.println("** Edit Tool **");
					System.out.println("  1. Edit Title");
					System.out.println("  2. Edit Singer");
					System.out.println("  3. Edit Genre");
					System.out.println("  4. Edit Composer"); //��ü ����Ʈ, �帣��?
					System.out.println("  5. Edit Date");
					System.out.println("  6. Exit");
					System.out.print("-Select a menu: ");
					
					select = input.nextInt();
					if (select == 1) {
						buf = input.nextLine();
						System.out.print("Enter the title of the music: ");
						music.title = input.nextLine();
					}
					else if (select == 2) {
						buf = input.nextLine();
						System.out.print("Name of the singer: ");
						music.singer = input.nextLine();
					}
					else if (select == 3) {
						buf = input.nextLine();
						System.out.print("Genre of the music: ");
						music.genre = input.nextLine();
					}
					else if (select == 4) {
						buf = input.nextLine();
						System.out.print("Composer: ");
						music.composer = input.nextLine();
					}
					else if (select == 5) {
						System.out.print("The day released: ");
						music.date1 = input.nextInt();
						System.out.print("Month: ");
						music.date2 = input.nextInt();
						System.out.print("Year: ");
						music.date3 = input.nextInt();
					}
					System.out.println();
					
				}
				break;
			}
		}
	}
	
	public void viewmusiclist() {
		for (int i = 0; i < musics.size(); i++) {
			musics.get(i).printInfo();
			System.out.println();
		}
	}
	
}
