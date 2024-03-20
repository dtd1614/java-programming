/*
단어 게임
구구단 게임

문제가 나오고 .. 시간이 주어지고 .. 일정 시간이 지나면 종료
*/

import javax.swing.JOptionPane;

public class Ex03_Signle_Word_Game {

	public static void main(String[] args) {
		// 문제
		String inputdata = JOptionPane.showInputDialog("값을 입력하세요");
		System.out.println("입력값 : " + inputdata);
		
		// 시간
		timer();
	}
	
	static void timer() {
		for(int i = 10; i > 0; i--) {
			try {
				System.out.println("남은 시간 : " + i);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}