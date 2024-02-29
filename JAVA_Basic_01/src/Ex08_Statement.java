import java.util.Scanner;

public class Ex08_Statement {

	public static void main(String[] args) {
		/*
		 제어문
		 1. 조건문
		 if(4가지), switch(){case: break;}
		 2. 반복문
		 for(반복횟수 명확), while(진위여부), do while(메뉴처리, 강제)
		 3. 분기문
		 break (블럭 탈출), continue(skip 아래구문)
		 
		 암기 ...
		 */
		int count = 0;
		if(count < 1) System.out.println("true");
		if(count < 1) {
			System.out.println("true");
		}
		
		char data = 'A';
		
		switch(data) { // int, char, String, enum
			case 'A' : System.out.println("문자 비교 되요");
				break;
			case 'B' : System.out.println(".....");;
				break;
			default : System.out.println("나머지 처리");
		}
		
		//for
		//1~100
		int result = 0;
		for(int i = 1; i <= 100; i++) result += i;
//		System.out.printf("result : %d", result);
		
		// 1~5까지 합
		result = 0;
		result = 5 * (1+5)/2; // 안하려고 for문
		
		// 1~10까지의 홀수 합
		//단 for문, for문 안에 if문 쓰지 마세요
		result = 0;
		for(int i = 1; i<=10; i+=2) {
			result += i;
		}
		
		// 1~1000까지 짝수의 합
		result = 0;
		for(int i = 1; i<=100; i++) {
			if(i%2 == 0) result += i;
		}
		
		// for문 + 분기문 (continue, break)
		// 초급자 Today point
//		for(int i = 2; i < 10; i++) {
//			for(int j = 1; j < 10; j++) {
//				if(i==j) {
//					break; // 아래 구문 스킵
//				}
//				System.out.printf("%s", "*");
//			}
//			System.out.println();
//		}
		
		//--------------------------------------------------------------------
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if(i < j) break;
				System.out.printf("%s", "*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 10; i >= 0; i--) {
			for(int j = 1; j <= 10; j++) {
				if(i <= j) System.out.printf("%s", "*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();

		for(int i = 10; i >= 0; i--) {
			for(int j = 1; j <= 10; j++) {
				if(i < j) break;
			    System.out.printf("%s", "*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if(i <= j) System.out.printf("%s", "*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		for(int i = 100; i>=0; i--) System.out.printf("%d ", i);
//		
//		int a = 0, b = 1, c = 0;
//		for(int i = 0; i < 10; i++) {
//			a = b;
//			b = c;
//			c = a + b;
//			System.out.printf("[%d]*[%d]=[%d]\t",a,b,c);
//		}
		
		Scanner sc = new Scanner(System.in);
		
		int inputData = 0;
		
		do {
			System.out.println("숫자 입력해: (0-9)");
			inputData = Integer.parseInt(sc.nextLine());
		}while(inputData >= 10);
		
		// 탈출
		System.out.println("당신이 입력한 숫자는 : " + inputData);
				
	}	
	
}
