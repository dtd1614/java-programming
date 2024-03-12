/*
인터페이스 : 약속, 규칙, 규약, 표준을 만드는 것
소프트웨어 설계 최상위 단계
초급자 : 만들어진 인터페이스를 사용
 */

interface Ia {
	int AGE = 100;
	String GENDER = "남";
	String print();
	void message(String str);
}

interface Ib {
	int AGE = 10;
	void intfo();
	String val(String s);
}

class Test2 extends Object implements Ia{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void message(String str) {
		// TODO Auto-generated method stub
		
	}
	
}

class Test3 implements Ia, Ib{ // 다중 구현 가능

	@Override
	public void intfo() {
		
	}

	@Override
	public String val(String s) {
		return null;
	}

	@Override
	public String print() {
		return null;
	}

	@Override
	public void message(String str) {
		
	}
	
}

public class Ex03_Interface {
	
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		
		Ia ia = t2; // 부모 인터페이스는 자식 객체의 주소를 가질 수 있다
		ia.message("재정의"); // ia는 Ia 내용만 접근 하지만 재정의가 되었다면 재정의 접근
		System.out.println("ia.GENDER");
	
		Test3 t3 = new Test3();
		Ia ia2 = t3;
		Ib ib2 = t3;
		
		System.out.println(ia2.AGE);
		System.out.println(ib2.AGE);
		
		//다형성 사용할 수 있다...
	}
	
}