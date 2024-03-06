import kr.or.kosa.DoWhileMenu;

public class Ex17_Menu_Exception {
	public static void main(String[] args) {
		DoWhileMenu menu = new DoWhileMenu();
		while(true) {
			switch(menu.displayMenu()) {
				case 1 : menu.inputRecord();
					break;
				case 2 : menu.deleteRecord();
					break;
				case 3 : menu.sortRecord();
					break;
				case 4 : System.out.println("프로그램 종료");
					//return;
					System.exit(0); // kill
			}
		}
	}
}
