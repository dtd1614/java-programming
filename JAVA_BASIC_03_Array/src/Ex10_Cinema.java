import java.util.Scanner;

import kr.or.kosa.Cinema;

public class Ex10_Cinema {

	public static void main(String[] args) {
//		Cinema cinema = new Cinema("CGV", "서울시 중랑구 상봉동");
//		cinema.printMainMenu();
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		s = s.replace("\n", "\\n");
		System.out.println(s+" zz");
		System.out.println("hi");
		
	}
}
