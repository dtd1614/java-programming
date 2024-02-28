import kr.or.kosa.Emp;

public class Ex01 {

	public static void main(String[] args) {
//		int value;
//		
//		value = 10;
//		int result = value + 100;
//		System.out.println(result);
		
		Emp emp; // emp 변수 + 타입 (Emp 타입)
		emp = new Emp();
		System.out.println(emp);
		
		Emp emp2 = emp;
		System.out.println(emp == emp2);
		
		Emp emp3 = new Emp();
		// Emp라는 타입을 갖는 emp3이라는 지역변수 생성
		// new라는 연산자를 통해서 메모리(heap)에 올리고 그 주소를 할당받는다.
		// emp3 주소값으로 초기화된다.
		
		emp3.empno = 1000;
		// .주소를 찾는 연산자를 통해서 주소에 접근하고 empno 값을 1000으로 할당
		System.out.println(emp3.empno);
		
		int a, b, c; // 같은 타입의 변수를 나열 >> 개발자 >> 배열(Array) >> int[]
		// 초기화가 안되어 있다.
		a = 100;
		b = 200;
		c = 300;
		// 사용 가능
		
		// int a = 200; 같은 지역 안에 같은 변수명 안되요.
		
		int result = a + b + c; // 초기화
		
		int k = 100;
		int y = k;
		y = 200;
		
	}

}

/*
클래스 == 설계도 == 데이터 타입
클래스의 종류 
1. class Car {} > main 함수를 가지고 있지 않아요 > 독자 실행이 불가능 > 다른 클래스를 도와주는 클래스 (lib)
2. class Car {public static void main(String[] args){}} > main > 독자적인 실행이 가능
2.1. static은 new 없이 메모리에...  약속된 이름 main

변수의 scope (선언되는 위치 : scope : 유효범위)
1. instance variable : 객체변수 (클래스 안에) >> class Car { private String color; }
2. local variable    : 지역변수 (함수 안에) >> class Car { public void run(){ int data = 0; } }
3. static variable 	 : 객체 간 공유자원  >> class Car { private static String int num; }
4. 함수 안에 있는 제어블럭 안에 있는 변수 (if, for, while) >> class Car {void run(){ for(int i = 0...) } }

변수 : variable
데이터(자료)를 담을 수 있는 공간의 이름(메모리)
공간 > 크기 > 데이터 타입 (자료형) > 메모리의 크기 한정
int data = 100; 초기화
*/
