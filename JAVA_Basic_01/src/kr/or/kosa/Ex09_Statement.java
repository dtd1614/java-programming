package kr.or.kosa;

public class Ex09_Statement {

	public static void main(String[] args) {
		//반복문
//		int i = 10;
//		while(i >= 10) {
//			// 반드시
//			// 증가감을 통해서 (true, false) 판단
//			System.out.println(i);
//			
//		}
		
		//while 통해서 1~100까지의 합
		int sum = 0;
		int num = 1;
		while(num <= 100) {
			sum += num;
			num++;		
		}
		System.out.println("result : " + sum);
	}
}
