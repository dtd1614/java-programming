/*
게임 : unit
unit(추상화, 일반화) : 공통기능 (이동좌표, 이동, 멈춘다)
unit 이동방법은 다르다 (이동방법 unit마다 다르게 구현)
 */

// 믿음이 없어서
abstract class Unit{
	int x, y;
	void stop() {
		System.out.println("unit stop");
	}
	// 이동 (unit)마다 다르다... 강제 구현 다른 방식
	abstract void move(int x, int y); // 실행 블럭을 만들지 않는다.
}

class Tank extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank 소리 내면서 이동 : " + this.x + " " + this.y);
	}
	
	//Tank 구체화, 특수화 (고유한 기능)
	void changeMode() {
		System.out.println("탱크 모드 변환");
	}
}

class Marine extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("마린 이동 : " + this.x + " " + this.y);
	}
	
	// 특수화, 구체화
	void stimpack() {
		System.out.println("스팀팩 기능");
	}
	
}

class DropShip extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("DropShip 하늘로 이동 : " + this.x + " " + this.y);
	}
	
	//특수화, 구체화
	void load() {
		System.out.println("Unit load");
	}
	void unload() {
		System.out.println("Unit unload");
	}
	
}

public class Ex02_abstract {

	public static void main(String[] args) {
//		Tank tank = new Tank();
//		tank.move(500, 200);
//		tank.stop();
//		tank.changeMode();
//		
//		Marine marine = new Marine();
//		marine.move(200, 300);
//		marine.stop();
//		marine.stimpack();
//		
//		///////////////////////////////////////////////////////////
//		// Today Point
//		/*
//		다형성에서 사용하는 방법 (타입 비교)
//		JAVA : instanceof (객체 간 타입 비교 true, false)
//		 */
//		if(tank instanceof Unit) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
//		
//		if(tank instanceof Tank) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		
		// 1. 탱크 3대 만들고 같은 좌표로 이동 (600 800)
		Tank[] tanks = {new Tank(), new Tank(), new Tank()};
		for(Tank tank : tanks) tank.move(600, 800);

		// 2. 탱크 1대, 마린 1명, 드랍십 1대 생성하고 같은 좌표로 이동 (666, 888)
		Unit[] units = {new Tank(), new Marine(), new DropShip()};
		for(Unit unit : units) unit.move(666, 888);
	}
}
