/*
설계도 == 클래스 == 데이터 타입

연습
하나의 물리적인 java 파일은 여러개의 클래스를 가질 수 있다 (실무 x  , 연습 0)
원칙적인 방법은
>> kr.or.kosa.Apt
>> kr.or.kosa.Program (main) 
*/

class Apt{
	// 설계도를 하나 생성 >> 아파트 설계도 >> 객체지향 >> class Apt >> 설계도 안에 자원 
	// 자원 (코드 구현) >> 속성 + 기능 >> 재사용성 
	// 설계도 의미없는 종이 >> 의미 >> 구체화 >> 메모리에 올리는 것 >> heap (집) >> new >> GC 
	// 여러개의 동일한 아파트 생산가능
	
	String doorColor;
}

public class Ex04_Object_Variable {
	public static void main(String[] args) {
		Apt apt; //apt 변수는 Apt라는 객체의 [주소 : 참조값]만을 담을 수 있다
		//System.out.println(apt); //지역변수 (main 함수)
		apt = new Apt(); //생성자 함수를 호출 ...
		System.out.println(apt); //Apt@2f92e0f4
		//Apt (클래스이름 ) + "@"  + 16진수값 (주소)
		
		Apt apt2 = new Apt();
		System.out.println(apt == apt2); 
		
		Apt apt3 = apt2; //주소 할당
		System.out.println(apt3);
		System.out.println(apt2);
		
		System.out.println(apt3 == apt2);  //증명
		
		int day = 10;
		int day2 = day; //값 할당
		day2 = 100;
		
		////////////////////////////////////////////
		apt2.doorColor = "red";
		
		System.out.println(apt3.doorColor);
		
	}

}