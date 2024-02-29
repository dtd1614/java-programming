import java.util.Random;

public class Ex03_Operator {

	public static void main(String[] args) {
		// 연산자 (산술, 논리, 관계)
		int result = 100 / 100;
		System.out.println("result : " + result);
		
		result = 13 / 2;
		System.out.println("result : " + result);
		
		// 나머지를 구하는 연산자 %
		result = 13 % 2;
		System.out.println("result : " + result);
		
		// 증가감 연산자 (++ 1씩 증가, -- 1씩 감소)
		int i = 10;
		++i; // 전치증가
		i++; // 후치증가
		// 다른 연산자와 결합되지 않으면 전치와 후치는 의미없다.
		
		//POINT (다른 연산자와 결합)
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2; 
		System.out.println("result2 : " + result2 + ", j2 : " + j2); // 10
		
		result2 = i2 + j2++; 
		System.out.println("result2 : " + result2 + ", j2 : " + j2); // 10
		
		byte b = 100;
		byte b2 = 1;
		
		// byte b3 = b + b2;
		// 자바의 정수 연산은 기본적으로 4바이트를 사용 (결국에는 int + int) 결과 int
		byte b3 = (byte)(b + b2);
		
		/*
		 Today Point
		 1. 정수 연산은 [int] 타입으로 변환 후 실행
		 ex) byte + short >> 컴파일러가 내부적으로 int 방에 값을 넣고 연산 처리 >> int + int
		 ex) char + char >> int + int
		 정수의 연산에서 int보다 작은 타입들은 내부적으로 int 변환 후 연산 .....
		 정수 long 예외 .......... 나머지 byte, char, short >> int로 전환 후 연산
		 
		 char + int >> int
		 int + int >> int
		 int + long >> long
		 
		 2. 정수와 실수의 연산은 >> 타입의 크기와 상관없이 실수가 된다
		 */
		
		long lo = 10000000000L;
		float fo = 1.2f;
		
		//long result3 = (long)(lo + fo);
		
		float result3 = lo + fo;
		
		char c2 = '!';
		char c3 = '!';
		int result4 = c2 + c3; // int 33 + int 33
		
		System.out.println("result4 : " + result4 + "-" + (char)result4);
		
		// 제어문
		int sum = 0; // local variable 초기화
		for(int j = 0; j <= 100; j++) {
			//sum += j;
			if(j % 2 ==0) {
				sum += j;
			}
		}
		System.out.println("sum : " + sum);
		
		// == 연산자 (값을 비교하는 연산자) true, false
		if(10 == 10.0f) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		// !=
		if('A' != 65) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		// ? <- 삼항연산자
		int p = 10;
		int k = -10;
		int result5 = (p == k) ? p : k;
		System.out.println("result5 : " + result5);
		
		if(p == k) {
			result5 = p;
		}else {
			result5 = k;
		}
		
		/*
		 * 진리표 (논리연산)
		 * 0 거짓 (false)
		 * 1 참 (true)
		 * 
		 * OR, AND (비트연산)
		 * 
		 * SQL문 자연어 ...
		 * select * from emp where job = 'IT' and sal > 3000 그리고 (True and True)
		 * select * from emp where job = 'IT' or sal > 3000 또는 (둘 중에 하나라도 참이라면)
		 *      and,   or
		 * 0 0   0     0
		 * 0 1   0     1
		 * 1 0   0     1
		 * 1 1   1     1
		 */
		
	    int x = 3;
	    int y = 5;
	    System.out.println("x | y or 비트연산 : " + (x | y));
	    System.out.println("x & y and 비트연산 : " + (x & y));
	    // 비트 (영상 처리, 판독)
	    
	    // Today Point
	    /*
	     &&
	     ||
	     if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1) {} else {}
	     */
	    
	    int data = 90;
	    switch(data) {
		    case 100 : System.out.println("100"); 
		    case 90 : System.out.println("90"); 
		    case 80 : System.out.println("80"); 
		    default : System.out.println("일치하는 값이 없어요"); 
	    }
	    
	    data = 90;
	    switch(data) {
		    case 100 : System.out.println("100"); break;
		    case 90 : System.out.println("90"); break;
		    case 80 : System.out.println("80"); break;
		    default : System.out.println("일치하는 값이 없어요"); 
	    }
	    
	    // 90
	    
	    int month = 3;
	    String res = "";
	    switch(month) {
		    case 1:
		    case 3:
		    case 5:
		    case 7:
		    case 8:
		    case 10:	   
		    case 12: res = "31일";
		    		break;
		    case 4:	   
		    case 6:
		    case 9:
		    case 11: res = "30일";
		    		break;
		    case 2: res = "29일";
		    		break;
		    default: res = "월 데이터가 아닙니다.";
	    }
	    System.out.println(month + "월은 :" + res + "까지 입니다.");
	    
	    // 난수 (랜덤 값, 임의의 추출값)
	    // 구글 검색, 자바의 자습서 (API)
	    // https://docs.oracle.com/javase/8/docs/api/
	    
	    // java.lang.Math 클래스를 활용하면 수학 관련 함수를 사용
	    
	    // 결과 : 0.0 <= random < 1.0 double 타입 값
	    
	    System.out.println("" + Math.random());
	    System.out.println("" + Math.random() * 10);
	    System.out.println("" + (int)(Math.random() * 10));
	}
}

