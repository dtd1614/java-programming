/*
OOP 객체 지향 프로그래밍
: 여러 개의 작은 조각(설계도) 모아서 큰 설계도를 만드는 것
: 재사용성

1. 상속 : 재사용성
2. 캡슐화 : 자원을 보호
3. 다형성 : 확장(하나의 부모 타입으로 여러 개의 자식 객체를 가질 수 있다)

안에 개념
>> method >> overloading
1. 하나의 이름으로 여러가지 기능을 하는 함수
>> System.out.println() 10개 > 다 같은 이름 > parameter 개수와 타입으로 판단
1. method overloading은 성능과 상관없음
2. 편하게 사용하려고

문법)
1. 함수 이름 같고 파라미터 개수와 타입을 달리한다
1.1. 함수 이름 동일
1.2. 파라미터 개수, 타입을 달리한다
1.3. return type 오버로딩의 판단 기준이 아니다
1.4. 파라미터 순서가 다름을 인정
ex) method(int i, String s) method(Sring s, int i) 다른 것으로
 */

class Human{
	String name;
	int age;
}

class OverT{
	
	int add(int i) {
		return 100 + i;
	}
	
	// void add(int data) {}
	
	int add(int i, int j) {
		return i + j;
	}
	
	String add(String str) {
		return str;
	}
	
	String add(String s, int i) {
		return "hello" + s + i;
	}
	
	void add(Human human) {
		human.age = 100;
		human.name = "홍길동";
	}
}

public class Ex11_Method_Overloading {
	public static void main(String[] args) {
		OverT overt = new OverT();
		overt.add(10, 10);
		
		// Point
		Human h = new Human();
		overt.add(h);
		
		// Point
		overt.add(new Human());
		
	}
}
