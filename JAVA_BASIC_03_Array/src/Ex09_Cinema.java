import java.util.Random;

public class Ex09_Cinema {
	
	public static void main(String[] args) {
		// 롯데 시네마
		String[][] seats = new String[3][5];
		Random random = new Random();
		
//		String ran = Integer.toString(random.nextInt(8) + 1); 
//		for(int i = 0; i < 7; i++) {
//			ran += Integer.toString(9);
//		}
//		System.out.println(" 예메번호 : " + ran);
		
		// 좌석 초기화
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				seats[i][j] = "__"; // 빈 의자로
			}
		}
		
		//좌석 예메
		seats[2][1] = "홍길동";
		seats[0][0] = "김유신";
		
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				System.out.printf("[%s]", seats[i][j].equals("__") ? "좌석" : seats[i][j]);
				seats[i][j] = "__"; // 빈 의자로
			}
			System.out.println();
		}
		// 예매 진행 (좌석) : 행과 열로 예매 가능 여부 판단
		int row, col;
		row = 1;
		col = 0;
		
		if(seats[1][0].equals("__")) {
			System.out.println("예매 가능");
		}else {
			System.out.println("예약된 좌석");
		}
		
		// 예매 End
		// 영화 시작
		// 다음 예매
		
		// 좌석 초기화
		
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				seats[i][j] = "__"; // 빈 의자로
			}
		}
		
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				System.out.printf("[%s]", seats[i][j].equals("__") ? "좌석" : seats[i][j]);
				seats[i][j] = "__"; // 빈 의자로
			}
			System.out.println();
		}
	}
}
