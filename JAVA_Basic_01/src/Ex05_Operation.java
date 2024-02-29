import java.io.BufferedReader;

public class Ex05_Operation {
	public static void main(String[] args) {
		int sum = 10;
		sum += 1;
		sum -= 1;
		System.out.println(sum);
		
		int score = 95;
		
		// ------------------------------------------
		
		String grade = "F";
		char plusChar = '+';
		char minusChar = '-';
		
		if(score >= 90) {
			grade = "A";	
			grade += (score >= 95) ? plusChar : minusChar;
		}else if (score >= 80) {
			grade = "B";
			grade += (score >= 85) ? plusChar : minusChar;
		}else if (score >= 70) {
			grade = "C";
			grade += (score >= 75) ? plusChar : minusChar;
		}else if (score >= 60) {
			grade = "D";
			grade += (score >= 65) ? plusChar : minusChar;
		}
		
		System.out.println("점수 : " + score + ", 등급 : " + grade);
		
		System.out.println();
		for(int i = 1; i <= 100; i++) {
			System.out.print(i + " "); // 엔터없이 한 줄
			if(i % 10 == 0) {
				System.out.println();
			}
		}
		
		// 입사 시험 (가장 많이)
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				int result = i * j;
				System.out.printf("%d*%d=%d\t",i,j,i*j);
			}
			System.out.println();
		}
	}

}
