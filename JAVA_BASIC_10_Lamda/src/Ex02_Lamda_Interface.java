
@FunctionalInterface  //함수형 인터페이스는 단 하나의 추상 메서드만 가져야 합니다
interface MyFunc2{
	int max(int a , int b);
}
@FunctionalInterface
interface MyLamdaFunction{
	int max(int a, int b);
}

public class Ex02_Lamda_Interface {

	public static void main(String[] args) {
		/*
		 MyFunc f = new MyFunc() {  //익명객체 (이름없는)
			@Override
			  public int max(int a, int b) { //max 는 접근자는 재정의시 public
				return a > b ? a : b; 
			}
		};
		
		int value = f.max(3, 5);
		System.out.println("value :  " + value); 

		*/
		//람다식(익명객체) 를 다루기 위한 참조변수(타입)은 함수형 인터페이스로 한다.
		
		MyFunc2 f = (a,b)-> a > b ? a : b; //MyFunc2 가는 max 구현
		
		int max = f.max(100,200);
		System.out.println("max : " + max);
		
		//////////////////////////////////////////////////////////////
		//기존 방식 익명객체 ... 익명함수
		System.out.println(new MyLamdaFunction() {
					@Override
					public int max(int a, int b) {
						return a > b ? a : b;  //구현 
					}
		}.max(3, 5));
				
			
		//람다식
		MyLamdaFunction lamdaFunction = (int a , int b) -> a > b ? a : b;
		System.out.println(lamdaFunction.max(3, 5));
		//////////////////////////////////////////////////////////////
		
	}

}





