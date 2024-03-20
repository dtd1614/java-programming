package abstract_factory2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){ 
		Application app = new Application(new Scanner(System.in).nextLine());
		app.createUI();
		app.paint();
	}
}