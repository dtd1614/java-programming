import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int comInput;
		int userInput;
		boolean isUserWinner;
			
		while(true) {
			
			comInput = (int)(3*(Math.random())+1);
			isUserWinner = false;
			
			System.out.println("\n이기면 종료합니다.");
			System.out.println("*********************************");
			System.out.println("1. 가위 | 2. 바위 | 3. 보 | 4. 종료");
			System.out.println("*********************************");
			System.out.print("사용자 입력 : ");
			userInput = Integer.parseInt(sc.nextLine());
			
			System.out.println("컴퓨터 입력 : " + comInput);
			
			if(userInput == 4) return;
			
			if(userInput == comInput) {
				System.out.println("비겼습니다.");
				continue;
			}
						
			switch(userInput) {
				case 1 : 
					if(comInput == 3) isUserWinner = true;
					break;
				case 2 :
					if(comInput == 1) isUserWinner = true;
					break;
				case 3 :
					if(comInput == 2) isUserWinner = true;
					break;
				default : 
					System.out.println("잘못 입력했습니다."); continue;
			}
			
			if(isUserWinner) {
				System.out.println("이겼습니다. 종료합니다.");
				return;
			}
			System.out.println("패배했습니다.");
		}	
	}
}
