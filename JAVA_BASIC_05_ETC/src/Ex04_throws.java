import java.io.IOException;

import kr.or.kosa.utils.ExClass;

public class Ex04_throws {

	public static void main(String[] args) {		
		try {
			ExClass ex = new ExClass("C:\\Temp");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}