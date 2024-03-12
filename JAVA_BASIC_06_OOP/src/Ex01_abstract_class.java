/*
추상 클래스
>> 설계도 (미완성 설계도)
1. 완성된 코드 + 미완성 코드
2. 미완성 함수 >> 실행블럭이 없는 함수 {} (x) -> public void run();
3. 미완성 클래스

설계자 입장에서 믿음이 없는 것 : 강제
미완성 설계도(미완성 함수) >> 의도 >> 믿지 못하니까 >> 강제로 구현해

조건 : 상속기본 
 */

class Car{
	void run() { // 상속해서 생산되는 자동차마다 ...
				 // 스포츠카 ... run() 재정의 (강제성 x)
	};
}

class Hcar extends Car{

	@Override
	void run() {
		super.run();
	}
	
}

// 강제성 (의무) : 재정의
abstract class Abclass{
	
	int position;
	
	void run() {
		position++;
	}
	//재정의가 필요한 함수를 추상함수 구현
	abstract void stop(); // 강제적 재정의
}

class Child extends Abclass{
	@Override
	void stop() {
		// 구현하는 사람 마음
		this.position = 0;
		System.out.println("stop : " + this.position);
	}
}

class Child2 extends Abclass{
	@Override
	void stop() {
		// 구현하는 사람 마음
		this.position = -1;
		System.out.println("stop : " + this.position);
	}
}

public class Ex01_abstract_class {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.run();
		ch.run();
		ch.stop();
		
		Child2 ch2 = new Child2();
		ch2.run();
		ch2.run();
		ch2.stop();
		
		/////////////////////////////////////
		// 다형성
		// 상속관계에서 부모 타입의 참조 변수가 여러 자식 객체의 주소를 가질 수 있다.
		Abclass ab = ch;
		// *******************************
		// 단 부모는 자신의 것만 볼 수 있다
		// 단 재정의가 되었다면 자식의 자원을 바라본다.
		ab.run();
	}
}

