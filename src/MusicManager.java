import java.util.ArrayList;
import java.util.Scanner;

public class MusicManager {
	ArrayList<Music> musics = new ArrayList<Music>(); //Music이라는 class를 다루는 배열 musics
//	Music music; //일종의 타입 선언, 앞으로 music은 요런 메모리형태를 가진다는 의미로 해석하지만 아직 아무런 주소 참조 x
				 //new를 통해 새로운 객체 Music()이 만들어지면 그제서야 만들어진 객체의 주소를 저장함(참조함)
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
		String buf = input.nextLine();	//어떤 음악 삭제할 것인가
		System.out.print("Enter a title of the music to delete: ");
		String title = input.nextLine();
		
		int index = -1; //-1 은 index가 NULL이라는 뜻
		for (int i = 0; i < musics.size(); i++) {	//그런 음악이 있는가 확인하기
			if (musics.get(i).title.equals(title)) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {	//음악 삭제
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
		else {	//그런 음악 없음
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
				
				while (select != 6) { //가사 입력 배너, 재생목록
					System.out.println("** Edit Tool **");
					System.out.println("  1. Edit Title");
					System.out.println("  2. Edit Singer");
					System.out.println("  3. Edit Genre");
					System.out.println("  4. Edit Composer"); //전체 리스트, 장르별?
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
