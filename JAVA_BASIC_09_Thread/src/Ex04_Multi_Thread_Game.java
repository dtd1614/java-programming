import javax.swing.JOptionPane;

class WordTime extends Thread{
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			if(Ex04_Multi_Thread_Game.inputcheck) return;
			try {
				System.out.println("남은 시간 : " + i);
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class WordInputThread extends Thread{
	@Override
	public void run() {
		String dan = "2";
		String inputdata = JOptionPane.showInputDialog(dan + " 값을 입력하세요");
		if(inputdata != null && !inputdata.equals("")) {
			Ex04_Multi_Thread_Game.inputcheck = true;
		}
		System.out.println("입력 값 : " + inputdata);
	}
}

public class Ex04_Multi_Thread_Game {
	
	static boolean inputcheck = false;
	
	public static void main(String[] args) {
			
		WordTime timer = new WordTime();
		timer.start();
		
		WordInputThread word = new WordInputThread();
		word.start();
		
		try {
			timer.join(); // main이 timer 스레드를 기다림 
			word.join(); // main이 timer 스레드를 기다림 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("main end");
	}
}
