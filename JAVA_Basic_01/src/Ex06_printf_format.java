import java.util.Scanner;

public class Ex06_printf_format {

	public static void main(String[] args) {
		
		System.out.println("A"); // 출력하고 줄바꿈
		System.out.println();
		System.out.println("B");
		
		int num = 1000;
		System.out.println("");
		
		System.out.printf("num 값은 : %d 입니다.\n", num);
		System.out.printf("num 값은 [%d] 입니다 또는 [%d] 도 있어요\n", num, 1234);
		
		/*
		 %d 10진수 형식의 정수
		 %f 실수
		 %s 문자열
		 %c 문자
		 \t tab  \n 줄바꿈
		 */
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f라는 변수 값은 %f 입니다\n", f);
		
		// console (cmd)
		// 자바는 read 할 수 있는 객체
		Scanner sc = new Scanner(System.in);
//		String value = sc.nextLine();
//		System.out.println("value : " + value);
//		int value = sc.nextInt(); // 사용자가 입력한 값을 정수로 변환 후 리턴
//		System.out.println(value);
		
//		float fnumber = sc.nextFloat();
//		System.out.println(fnumber);
		
		/*
		 되도록이면 
		 nextInt, nextFloat 보다 데이터를 nextLine으로 받아서 필요한 타입으로 형변환 
		 Today Point 
		 문자를 -> 숫자로 
		 
		 String data = sc.nextLine();
		 int data = Integer.parseInt(data);
		 */
		
		System.out.print("숫자 입력하세요 : ");
		int number = Integer.parseInt(sc.nextLine());
		System.out.printf("입력한 숫자는 : %d", number);
	}
	
	
}
