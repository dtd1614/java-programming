
public class Ex01 {

	public static void main(String[] args) {
//		int value;
//		
//		value = 10;
//		int result = value + 100;
//		System.out.println(result);
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
