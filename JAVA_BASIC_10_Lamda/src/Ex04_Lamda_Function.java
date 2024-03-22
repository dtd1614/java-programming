
@FunctionalInterface
interface Ifunc{
	int method(int x , int y);
}

public class Ex04_Lamda_Function {

	public static void main(String[] args) {
		
		//1. 익명객체
		Ifunc my = new Ifunc() {
			@Override
			public int method(int x, int y) {
				int result = x + y;
				return result;
			}
		};
	
		//2. 익명함수(람다식)
		Ifunc my2 = (x,y) -> {int result = x*y; return result;};
		Ifunc my3 = (x,y) -> x + y;
		
		System.out.println(my2.method(10, 10));
		System.out.println(my3.method(10, 10));
	}

}






