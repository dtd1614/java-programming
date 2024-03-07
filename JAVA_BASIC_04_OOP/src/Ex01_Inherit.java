/*
설계도 : 메인 설계도 > 하위 설계도 > 부분 설계도 > 독립적인 설계도

여러 개의 설계도를 관계를 가지게 하는 것 (상속)
is ~ a 삼각형은 도형이다
has ~ a 경찰은 권총을 가지고 있다.

1. 상속 (재사용성)
2. 캡슐화 (private)
3. 다형성 (상속관계에서 부모타입의 변수가 자식 타입의 주소를 가질 수 있다)

상속
JAVA : child extends Base
c# : child : Base

특징
1. 다중 상속 불가 (단일 상속 원칙 >> 계층적 상속)
2. 다중 상속 지원 (interface (약속, 규칙, 규약))

상속
1. 진정한 의미 : 재사용성
2. 단점 : 비용 (초기설계비용) ... 부모 자식관계 (커플링) >> 느슨한 관계 
3. 재사용성이 높은 클래스 설계 ...

사용자가 만드는 모든 클래스는 Object라는 root를 상속받는다. > 계층 상속

질문) 
class > new > 객체 > 가장 먼저 호출 (생성자 함수)
 */
class GrandFather{ // extends Object
	public int gmoney = 5000;
	private int pmoeny = 10000; 
	// 상속관계 접근 불가
	// pmoney >> public method 만들어 간접
	
	// 객체 생성과 동시에 호출되는 함수(생성자 함수)
	
	public GrandFather() {
		System.out.println("GrandFather 생성자 호출");
	}

}

class Father extends GrandFather{
	public int fmoney = 3000;
	
	public Father() {
		System.out.println("Father 생성자 호출");
	}
}

class Child extends Father{
	public int cmoney = 1000;
	
	public Child() {
		System.out.println("Child 생성자 호출");
	}
}

public class Ex01_Inherit {
	public static void main(String[] args) {
		Child child = new Child();
		// child.pmoney = 100; // 상속관게 private 접근 불가
	}
}
