class Unit2{
	int hitpoint; //기본 에너지
	final int MAX_HP; //최대 에너지
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}

//인터페이스 
//~ 할 수 있는 ( 하나의 부모를 가지게 할 수 있다 ) 관련이 없는 자원을 같은 부모를 .... 관련성이 있게 ...
interface Irepairable{}

//지상 유닛 , 공유 유닛 , 건물

//지상
class GroundUnit extends Unit2{
	GroundUnit(int hp) {
		super(hp);
	}
}

//공중
class AirUnit extends Unit2{
	AirUnit(int hp) {
		super(hp);
	}
}

//건물
class CommandCenter implements Irepairable{}

//탱크
class Tank2 extends GroundUnit implements Irepairable{
	Tank2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank2";
	}
	
}

//병사
class Marine2 extends GroundUnit {

	Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Marine2";
	}
	
}

//광물캐는 로봇
class Scv extends GroundUnit implements Irepairable {

	Scv() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Scv";
	}

	//Scv 구체화 , 특수화  : 고유한 기능
	//수리하다 (repair)
	//Tank2 , Scv , CommandCenter , Marine (x)
	
	/*
	void repair(Tank2 tank) {}
	void repair(Scv scv) {}
	void repair(CommandCenter cc) {}
    
    
    1. GroundUnit  부모 > Tank2 , Marine2  ,Scv
    1.1 void repair(Unit2 unit) >> 안되요 >> parameter Marine2 (죽어요) 대상이 아니예요
    1.2 void repair(GroundUnit unit)  >> 안되요 >> parameter Marine2 (죽어요) 대상이 아니예요
    1.3 수리하는 대상이 : CommandCenter
    정리 : 수리대상 : Tank2 , Scv , CommandCenter 서로의 공통점 (연결고리) : 다형성 >> 같은 부모
    //연관성이 없는 자원을  interface 통해서 같은 부모를 .....  
    
    implements Irepairable  부모
    class CommandCenter implements Irepairable
    class Tank2 extends GroundUnit implements Irepairable
    class Scv extends GroundUnit implements Irepairable
    
    다형성 적용
    */
	void repair(Irepairable repairunit) { //부모타입 ... 자식객체의 주소를 받을 수 있다
		//Tank2, Scv,  CommandCenter 다 받아서 ....
		
		/*
		 1. 수리하는 방법이 달라서
		 Tank2  , Scv >> HP 가지고 올리면 되요 
		  
		 1.2 CommandCenter  다른 방법으로 ..
		 
		 답) repairunit >> Tank2 , Scv 오면 >> Unit2
		 Unit2 unit = (Unit2)repairunit;
		 unit.hitpoint += 5
		 
		 1.3 commandCenter >> Unit2 연관성이 없다
		  Unit2 unit = (Unit2)repairunit; 예외 발생 
		  
		  무기) 타입 .... instanceof  >>타입 질문
		 */
		
		if(repairunit instanceof Unit2) {
			//Tank2, Scv
			//충전방식
			Unit2 unit2 = (Unit2)repairunit;
			if(unit2.hitpoint != unit2.MAX_HP) {
				unit2.hitpoint = unit2.MAX_HP; //한번에 완충
			}
			
		}else {
			//건물
			System.out.println("건물이 다른 방시으로   repair를 합니다");
		}
	}
}



public class Ex04_Interface_Poly {
	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine2 = new Marine2();
		Scv scv = new Scv();
		CommandCenter center = new CommandCenter();
		
		tank.hitpoint -= 20;
		System.out.println("탱크 : " + tank.hitpoint);
		System.out.println("scv 수리 요청하기");
		scv.repair(tank);
		System.out.println("탱크 수리 완료 " + tank.hitpoint);
		
		scv.hitpoint = -30;
		System.out.println("scv : " + scv.hitpoint);
	}
}

