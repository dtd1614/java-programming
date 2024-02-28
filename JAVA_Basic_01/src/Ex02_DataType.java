/*
1. 자바 기본 타입(8가지) + 1(String)
2. 8가지 값을 저장
3. 값(숫자, 문자, 진리)
4. 정수, 실수
정수 : 음의 정수, 0, 양의 정수 : byte -128 ~ 127, 
							char(한문자): 2byte (한글 1자 : 2byte, 영문자, 특수문자, 공백 1byte) 
							유니코드 >> 표준화 >> 아스키코드표 >> 결국 char는 정수다.
							Tip) char(10), varchar(10), nvarchar(10) : 10글자 : 20byte
							ex) char c = 'A' 
							int (4byte) (-21~21억) **정수 리터럴의 기본 타입
							long(8)
							
실수 (부동소수점)
							float(4) 대략 7자리 정도의 소수 표현
							double(8) 대략 15자리 정도의 소수를 표현 (정밀도가 높다) **실수 리터럴의 기본 타입
							
논리값						boolean (true, false)

+ 1 (String)
문자열
String str = "안녕";
별도의 이야기 전까지 String 값 타입처럼

--------------------------------------------------------------------

참조타입 : array, class, collection, interface

정수값 표현
100 10진수
0x2 16진수
0123 8진수
0b110011 2진수

long
123L or 123l

실수값 표현
3.14
123.4
1.4F or 1.4f

문자값
'A', '가'

'u\0065'

 */
public class Ex02_DataType {
	
	public static void main(String[] args) {
		int num = 100000000;
		System.out.println("num : " + num);
		//int num2 = 10000000000;
		// 개발자가 입력한 리터럴 10000000000 정수(int) 범위를 벗어남.
		long num3 = 10000000000L;
		
		long num4 = 100;
		// 컴파일러 : long long4 = (long)num4; : 암시적 형변환 (작은 것을 큰 것에 넣는 것은 고민하지 않아요)
		
		// 손실 발생 감수 ....
		// 명시적 형변환 (주의)
		int num5 = (int)1000000000000L;
		int num6 = (int)1000L;
		System.out.println("num5 : " + num5);
		System.out.println("num6 : " + num6);
		
		char ch = '가';
		System.out.println("한 문자 : " + ch);
		
		// char ch2 = 'ab'; 컴파일 안되요 무조건 한 문자
		char ch2 = 'a';
		char ch3 = 'A';

		// char 정수 타입 (문자를 저장하지만 내부적으로 정수 값을 가지고 있다.)
		int chint = ch3;
		System.out.println(ch2);
		
		// int chint = ch3 >> int chint = (int)ch3;
		
		char chint2 = 'a'; // 97
		System.out.println(chint2);
		System.out.println((int)chint2);
		
		int intch3 = 65;
//		char chint3 = intch3;
		
		/*
		 * 1. 할당에 있어서 값을 보지말고 값이 가지는 타입을 보자.
		 * 1.1. 리터럴(개발자가 입력하는 값)
		 * 1.1.1. 정수 리터럴의 기본 타입은 int >> int보다 큰 리터럴 접미사 L or l
		 * 1.1.2. 실수 리터럴의 기본 타입은 double >> 3.14 리터럴 >> double >> float >> F or f
		 * 
		 * 2. 형변환 (casting) : 명시적, 암시적
		 * 2.1. 작은 것을 큰 것에 넣는 것은 문제가 되지 않는다. 하지만 컴파일러는 암시적 형변환을 통해서 타입을 맞춘다.
		 * 2.2. 큰 것을 작은 곳에 넣고자 하면 강제적 형변환 (명시적) : (int), (float) : 손실값 발생 고민
		 * KEY POINT
		 * char c = (char)int 범위값에 따라서 손실도 발생할 수 있다.
		 */
		
		String name = "홍길동";
		// 문자열은 문자의 집합이다 >> String은 문자 배열이다.
		
		name += " 바보"; // name = name + " 바보";
		System.out.println(name);
		
		// 자바는 + (산술 연산, 결합 연산)
		/*
		 Tip)
		 연산자는 언어마다 표현이 달라요
		 자바: + (산술, 결합)
		 오라클: + 산술, || 결합 ('홍길동' || '바보')
		 */
		
		String s = "가";
		s+= "나";
		s+= "다";
		s+= "라";
		// 메모리에 '가', '가나', '가나다' ..... 할당되서 비효율적 >> 스트링빌더나 스트링버퍼 쓸 것
		
		char sing = '\''; // '를 데이터로 표현
		// 이스케이프 문자 : 특정 문자열 앞에 \ 역슬래시 붙임
		String username = "홍\"길\"동";
		System.out.println("username: " + username);
		
		String str1 = "1000";
		String str2 = "10";
		String result = str1 + str2;
		
		String path = "C:\\Temp";
		System.out.println(path);
		
		path = "C:\\T\t\nt";
		System.out.println(path);
		
		// byte 배열할 때....
		// 네트워크 상에서 데이터 교환, 파일 처리
		
		// 실수
		// float f = 3.14; 리터럴 실수 3.14는 double 타입 (기본)
		
		// float f = 3.14f;
		// float f = (float)3.14;		
		// double f = 3.14;
		
		float f = (float)3.14; // 이런 경우 손실을 가져올 수도 있다
		// 처음부터 받는 타입을 크게 잡아서 사용
		
		float data = 1.123456789f;
		System.out.println(data);
		// 결과 : 1.1234568
		
		double data2 = 1.123456789123456789;
		System.out.println(data2);
		// 결과 : 1.1234567891234568
		
		// 정수 큰수 : long
		// BigDecimal 사용 ...
		
		double data3 = 100;
		System.out.println(data3); // 100.0
		
		double data4 = 100;
		int number = 100;
		
		// int result2 = data4 + number;
		
		// 해결1 : 큰 것을 작은 것으로 바꿀 때는 데이터 손실을 고민하자.
		   int result2 = (int)data4 + number;
		   System.out.println(result2);
		   
		// 해결2
		   double result3 = data4 + number;
		   System.out.println(result3);
		   
	   int number2 = 100;
	   byte b2 = (byte)number2;
	   
	   /*
	    * 1. 큰 타입 + 작은 타입 연산 결과 >> 큰 타입
	    * 2. 타입 간 변환 >> 변수가 가지는 값을 보지말고 변수의 타입을 보자 
	    * 3. 명시적(강제적) 형변환 데이터 타입변환 (손실 고려) 큰 타입 > 작은 타입으로 가기 때문
	    */
	   
	   int data5 = 100;
	   byte b3 = (byte)data5; // 명시적 강제 형변환
	   
	   byte b4 = 20;
	   int data6 = b4; //컴파일러 암시적 (int)b4...
	   
	   byte b5 = 127;
	   byte b6 = (byte)(b5 + 1); // 값을 순회
	   System.out.println(b6);
	   
	   //KEY POINT
	   //문자열 >> 숫자(정수, 실수)
	   int value1 = Integer.parseInt("100");
	   System.out.println(value1);
	   
	   //Integer.parseInt("A100") (x)
	   
	   String str = String.valueOf(10);
	   
	    
	}
}
