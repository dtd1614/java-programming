/*
inner class 
클래스 안에 클래스 가 존재할 수 있다

outter class
{
    inner class{
    
    }
}

코드의 간소화 .....

기술 : awt(OS 그림판 , 계산기)  , swing(그림판 , 계산기)  , 안드로이드 (java)
java > web > servlet > spring > 

************************************
익명클래스
클래스를 정의하지 않고 객체를 만드는 방법 >> 재사용이 불가능 >> 1회용 클래스에 사용 

익명클래스 사용  (이름 없는 클래스)
1. 이벤트 처리 (사건 : 정의해 놓았다) >> 웹 (클릭, 더블클릭 , 마우스 오버) >> 사건이 터지면 >> 수습 (함수) : eventhandler
2. 스레드(Thread) : runnable 인터페이스 구현 ....
3. 람다식 (줄임 표현식)
4. 스트림 (대량의 데이터를 표준화된 방법으로 가공)

*/
class OuterClass{
	public int pdata=10;
	private int data=30;
	
	//inner class (자원에 대한 접근: OuterClass 자원 사용가능)
	//outer calss  의 member field 선언된 곳에 만들면 되요 
	class InnerClass{
		void msg() {
			System.out.println("outer class data  : " + data);
			System.out.println("outer class pdata : " + pdata);
		}
	}
}
/////////////////////////////////////////////////////////////////////////
abstract class Person{ //목적: 강제적 구현 (상속)
	//완성된 함수
	//,,,,
	//미완성된 함수
	abstract void eat();
}

class Man extends Person{

	@Override
	void eat() {
		System.out.println("Person  의 eat 함수 재정의");
	}
}

interface Eatable{
	void eat();
}

class User{
	void method(Eatable e) {
		e.eat();
	}
}

public class Ex15_InnerClass {
	public static void main(String[] args) {
		OuterClass outobj = new OuterClass();
		System.out.println("public field : " + outobj.pdata);
		
		OuterClass.InnerClass innerobj = outobj.new InnerClass();
		innerobj.msg();
		
		////////////////////////////////////////////////////////
		
		Man m = new Man();
		m.eat();
		Person p = m;
		p.eat();
		
		Person p2 = new Man();
		p2.eat();
		
		/*
		 1. 추상클래스 강제 구현
		 2. 추상클래스 미완성 (스스로 객체 생성 불가능)
		 3. 추상 클래스를 상속하는 클래스를 만들고 사용 : class Man extends Person
		 4. 고민) abstract class Person
		 5. Person 상속하는 클래스 없이 사용가능할까  Man extends Person 없이 .....
		 5.1 단 클래스 없이 .... Man 이름 없어도 .... 
		 5.2 1회성으로 사용되고 버려져요 
		 6. 익명클래스 
		 */
		Person person = new Person() { //이름이 >> class 명  ,,,,, Person 추상 클래스 
			
			@Override
			void eat() {
				System.out.println("익명 객체 타입으로 구현");
				
			}
		};
		person.eat();
		
		//Today Point
		User user = new User();
		//user.method(null); //method(Eatable e) parameter  Eatable 구현하는 있는 객체의 주소
		//지금 한번 사용하되며 되는데 ... 굳이 재사용 안하는 데
		user.method(new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("일회성 자원으로 인터페이스의 추상 자원 직접 구현");
				
			}
		});
		// 원칙 : class ManEat implements Eatable { }
        // user.method(new ManEat) 	
		// 원칙을 무시하고 인터페이스나 추상클래스의 추상자원의 직접 구현 (일회성 자원으로) >> 클래스 이름 없이 
		
		//Thread  new Runnable 인터페이스 ...
		//CS awt , swing  이벤트 처리 ....
		
	}

}
