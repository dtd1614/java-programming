
public class Ex02_Exception {

	public static void main(String[] args) {
		System.out.println("main");
		int num = 0;
		int result = 0;
		
		try {
			for(int i = 0; i < 10; i++) {
				result = num / (int)(Math.random()*10); //0 ~ 9
				System.out.println("result : " + result + " i : " + i);
			}
		} catch (ArithmeticException e) {
			System.out.println("문제가 발생했어요");
		}
	}

}
