/*
람다식 
1. 함수 또는 메서드 를 간단하게 표현하는 방법 (식:expression)
class Car {
     int max(int a , int b){
         return  a > b ? a : b;
     }
}


참고)
앞에서 ... 익명객체 (익명타입) >> class  이름 없이 >>  new 
Thread th3 = new Thread(new Runnable() { 
			@Override
			public void run() {
				
			}
		}) ;



람다식
(a , b) -> a > b ? a : b
이름없는 함수 (익명함수) :  anonymous function

함수 : 모든 언어에서 통용되는 일반적인 표현  >> 클래스 독립적 
메서드 : 객체지향언어 용어 (클래스 안에 들어있는 기능) >> 클래스에 종속적  

문법)
  int max(int a , int b){
         return  a > b ? a : b;
     }
     
1. 메서드 이름 과 return 타입 제거     
(int a , int b)-> { a > b ? a : b; }

2. return 타입이 있는 경우 (식이나 값은 나누고 return 생략가능(생략) point ; (생략)
(int a , int b)->  a > b ? a : b   
 
3. 매개변수의 타입이 추론가능하면 생략해도 된다
(a , b) ->  a > b ? a : b     


정상적인 유형 
() -> {}
() -> 1
() -> { return 1; }

(int x) -> x+1
(x) -> x+1
 x -> x+1

(int x) -> { return x+1; }
x -> { return x+1; }

(int x, int y) -> x+y
(x, y) -> x+y
(x, y) -> { return x+y; }

문제)
(x , int y) -> x+y >> 선언되지 않은 타입과 선언된 타입은 같이 안되요
(x , final y) -> x + y  >> 안되요 

new Thread(new Runnable(){
        @Override
		public void run() {
			System.out.println("Hello");
		}
		}).start();

}

람다식으로 
new Thread(()-> {
					System.out.println("Hello");
				}).start();


익명함수란 말그대로 함수의 이름이 없는 함수입니다. 
익명함수들은 공통으로 일급객체(First Class citizen)라는 특징을 가지고 있습니다.
이 일급 객체란 일반적으로 다른 객체들에 적용 가능한 연산을 모두 지원하는 개체를 가르킵니다. 
**함수를 [값으로 사용] 할 수도 있으며 [파라메터로 전달] 및 변수에 [대입 하기와 같은 연산]들이 가능합니다.

장점
1. 코드의 간결성 - 람다를 사용하면 불필요한 반복문의 삭제가 가능하며 복잡한 식을 단순하게 표현할 수 있습니다.
2. 지연연산 수행 - 람다는 지연연상을 수행 함으로써 불필요한 연산을 최소화 할 수 있습니다.
3. 병렬처리 가능 - 멀티쓰레디를 활용하여 병렬처리를 사용 할 수 있습니다.
 
단점
1. 람다식의 호출이 까다롭습니다
2. 람다 stream 사용 시 단순 for문 혹은 while문 사용 시 성능이 떨어집니다.
3. 불필요하게 너무 사용하게 되면 오히려 가독성을 떨어 뜨릴 수 있습니다.

 
람다의 표현식
1. 람다는 매개변수 화살표(->) 함수몸체로 이용하여 사용 할 수 있습니다.
2. 함수몸체가 단일 실행문이면 괄호{}를 생략 할 수 있습니다. 
3. 함수몸체가 return문으로만 구성되어 있는 경우 괄호{}를 생략 할 수 없습니다.
****************************************************************************
자바의 [람다 함수]의 [일급 객체]
이러한 관점에서 자바의 람다식 혹은 [익명 클래스]는 변수나 매개변수에 할당할 수 있고, 리턴값으로도 사용할 수있기 때문에 일급 객체의 요건을 충족한다.

https://s-y-130.tistory.com/169  칭찬해요 ^^
****************************************************************************

*/
public class Ex01_Lamda {
	public static void main(String[] args) {
		/*
		 (a) -> a + a(0)  :  a -> a + a(0)
		 매개변수가 한개 ...  
		 (int a) -> a + a (0) : int a -> a + (x)
		    
		 1)
		 int min(int a , int b){
		    return a > b ? a : b;
		 } 
		 
		>>>>>>>>>>> (a,b) -> a > b ? a : b
		 
		 2)
		 int year(String name , int i){
		 	System.out.println(name +"는" + i);
		 }
		 
		>>>>>>>>>>> (name,i) -> System.out.println(name +"는" + i)   >> ;있으면 안되요
		 
		 3)
		 String add(String x){
		 	return x+x;
		 }
		
		 >>>>>>>>>>>> (x)-> x+x
		  
		 4)
		 int random(){
		    return (int)(Math.random()*10);
		 } 
		 
		 >>>>>>>>>>>> () -> (int)(Math.random()*10)  
		  
		 */
		
		/*
		 **************************************************************
		 * 람다식은 익명함수 이지만(아니고) 사실 익명객체이다 
		 **************************************************************
		  
		 (a,b) -> a > b ? a : b  객체(람다식은)
		 
		 new Object(){  //익명 클래스 (익명타입)
		     int max(int a , int b){
		       return a > b ? a : b;
		     }
		 } 
		 
		 람다(익명객체) 사용하기 위해서는 객체는 담는 참조변수가 필요하다 
		 Object obj = new Object(){  //익명 클래스 (익명타입)
								     int max(int a , int b){
								       return a > b ? a : b;
								     }
								  } 
								  
		int v = obj.max(3,10);	
		Object 가 내부에 max 를 가지고 있지 않아요 
						  
		Object obj = (a,b) -> a > b ? a : b ....
		  
		 */
		
		
		Object obj = new Object() {
			int max(int a , int b) {
				return a > b ? a : b;
			}
		};
	   //int v =obj.max(3,5);
	   //Object obj = (a,b) -> a > b ? a : b;
	   //생성된 익명객체(람다) 받을 타입이 없으니 Object 최상위 타입으로
		
	   //고민 고민
	   //함수형 인터페이스 
	  /*
		 조건 : 추상 메서드 하나만 가져 
		 하나의 추상 메서드만 강제하는 인터페이스 
		 
		 @FunctionalInterface 어노테이션 
		 
		 @FunctionalInterface
		 interface helloFunction{
		    public abstract int max(int a, int b);
		 }
		 
		 helloFunction hello = new helloFunction(){
		 	  int max(int a , int b) {
		 	     return a > b ? a : b;
		 	  }
		 }
		 
		 int value = hello.max(3,5);
		 
		 함수형 인터페이스 타입의 참조변수 람다식 표현이 가능
		 helloFunction h = (a,b) -> a > b ? a : b;
		 int value = h.max(3.5)// 람다식이 호출 
		 
	  */	
		MyFunc f = new MyFunc() {  //익명객체 (이름없는)
			@Override
			  public int max(int a, int b) { //max 는 접근자는 재정의시 public
				return a > b ? a : b; 
			}
		};
		
		int value = f.max(3, 5);
		System.out.println("value :  " + value);
		
	}

}

@FunctionalInterface  //함수형 인터페이스는 단 하나의 추상 메서드만 가져야 합니다
interface MyFunc{
	//public abstract int max(int a, int b);
	int max(int a , int b);
}
//타입을 하나 생성 .....











