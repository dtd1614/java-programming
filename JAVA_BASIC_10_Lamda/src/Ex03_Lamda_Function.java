/*
[함수적 프로그래밍 기법]
y=f(x) 형태의 함수로 구성된 프로그래밍 기법
1. 데이터를 매개값으로 전달하고 결과를 받는 코드들로 구성
1.1 객체 지향 프로그래밍 보다는 효율적인 경우
1.1.1 대용량 데이터의 처리시 
1.2.1 이벤트 지향 프로그래밍(이벤트가 발생하면 핸들러 함수 실행) 적합

현대적 프로그래밍 기법
1. 객체 지향 프로그래밍 + 함수적 프로그래밍

[자바 8부터 함수적 프로그래밍 지원]
람다식(Lamda expressions)을 언어 차원에서 제공
1. 람다 계산법에서 사용된 식을 프로그래밍 언어에 접목
2. 익명 함수(anonymous function)을 생성하기 위한식
(타입 매개 변수) -> {실행문;}
     x             y
자바에서 람다식을 수용한 이유
1. 코드가 매우 간결해 진다
2. 컬렉션요소(대용량 데이터)를 필터링 또는 매핑해서 쉽게 집계할 수 있다

[자바는 람다식을 [함수적 인터페이스]의 [익명구현 객체]로 취급]
람다식 -> 매개변수를 가진 코드 블럭 -> 익명 구현 객체


*/

@FunctionalInterface
interface MyFunction{
	void method();
	//void m(); (x)
}

public class Ex03_Lamda_Function {

	public static void main(String[] args) {
		
		MyFunction myfun = new MyFunction() {
			@Override
			public void method() {
				System.out.println("일회성 익명 객체 .. 함수 호출");
				
			}
		};
		myfun.method();
		/////////////////////람다 배우기 전 ///////////////////////
		
		
		MyFunction my = ()-> System.out.println("익명함수 구현");
		my.method();
		
		MyFunction my2 = ()-> {
			System.out.println("A");
			System.out.println("B");
		};
		
		my2.method();
		
		//익명객체 (1회성) >> class 이름이 없어요
		//class T implements Runnable ...
		//함수적 인터페이스의 가장 대표 : Runnable
		Runnable rannable = new Runnable() { 
			@Override
			public void run() {
				//구현코드
			}
		};
		
		Runnable rundata = ()-> {System.out.println("구현코드 ");};
		rundata.run();
		
		/*
		 (타입 매개변수, ...) -> {실행문;...}
		 (int a) -> {System.out.println(a);}

		1. 매개타입은 런타임시에 대입값에 따라 자동으로 인식하기 때문에 생략가능  (int a) , (String a)
   			(a) -> { System.out.println(a);}

		2. 하나의 매개변수만 있을 경우에는 괄호() 생략 가능
    		a -> {System.out.println(a);}   
   
		3. 하나의 실행문만 있다면 중괄호 { } 생략 가능
    		a -> System.out.println(a);

		4. 매개변수가 없다면 괄호()를 생략할 수 없음
    		() -> {실행문;...};
    
		5. 리턴값이 있는 경우, return 문을 사용 
    		(x,y) -> {return x + y;};   

		6. 중괄호 {} 에 return문만 있을 경우 , 중괄호를 생략가능
   			(x,y) -> x + y; 
		
		*/

		
	}

}








