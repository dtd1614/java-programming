/*
WORD 작업 ( 글쓰기 ....) >> 
...3초 간격으로 글 저장 (자동저장)

언제 : 동시에 ... Thread (runnable) ...  >> 글을 쓰면서(작업)  ... 자동저장(작업)


글쓰기 다쓰고 저장 .... 자동저장 ...
(주)               (보)
*/

class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("작업 내용을 자동 저장 합니다");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				  Thread.sleep(2000);
			} catch (Exception e) {
				break;
			}
			save();
		}
	}
}
public class Ex07_DaemonThread {
	public static void main(String[] args) {
		AutoSaveThread auto = new AutoSaveThread();
		auto.setDaemon(true); //AutoSaveThread 이 데몬(보조) >> main(주업무)
		auto.start();
		
		//main 함수가 종료 되면 ... 데몬도 종료
		
		try {
			  Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("메인 스레드 종료");


	}

}
