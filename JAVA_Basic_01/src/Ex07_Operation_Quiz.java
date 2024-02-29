import java.util.Scanner;

public class Ex07_Operation_Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">입력값(숫자):");
		int firstNum = Integer.parseInt(sc.nextLine());

		System.out.print(">입력값(기호):");
		char operator = sc.nextLine().charAt(0);
		
		System.out.print(">입력값(기호):");
		int secondNum = Integer.parseInt(sc.nextLine());

		int result = 0;
		
		switch(operator) {
			case '+' : result = firstNum + secondNum; break;
			case '-' : result = firstNum - secondNum; break;
			case '*' : result = firstNum * secondNum; break;
			case '/' : result = firstNum / secondNum; break;
			case '%' : result = firstNum % secondNum; break;
		}
		System.out.printf("결과 : %d", result);
		
		/*
		 
		 */
	}
}
