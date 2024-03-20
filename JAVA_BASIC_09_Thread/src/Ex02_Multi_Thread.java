/*
Thread : 프로세스에서 하나의 최소 실행단위(흐름) >> method >> 실행되는 공간 stack

멀티 스레드는 스택을 여러 개 만드는 것 >> 동시에 함수를 실행가능하게 하는 것 >> cpu를 점유할 수 있는 상태로 만든다.

스레드 생성 방법
1. 스레드 클래스 상속 >> run 함수 구현
2. runnable 인터페이스 구현 >> run 추상 함수 구현
2.1 runnable 인터페이스는 스레드가 아님 > 사용하려면 스레드 객체를 만들어서 runnable 구현체를 생성자 파라미터로 넣어줘야함
 */

class Task_1 extends Thread{
	
	@Override
	public void run() { // 새로운 Stack 메모리에 최초로 올라가는 함수
		for (int i = 0; i < 1000; i++) {
			System.out.println("Task_1 : " + i + " " + this.getName());
		}
		System.out.println("Task_1 run() 함수 END");
	}
}

class Task_2 implements Runnable{

	@Override
	public void run() { // 새로운 Stack 메모리에 최초로 올라가는 함수
		for (int i = 0; i < 1000; i++) {
			System.out.println("Task_2 : " + i);
		}
		System.out.println("Task_2 run() 함수 END");
	}
}

public class Ex02_Multi_Thread {
	public static void main(String[] args) {
		
		Task_1 th = new Task_1(); // 스레드 하나를 생성
		th.start(); // 시작
		
		Thread th2 = new Thread(new Task_2());
		th2.start();
				
		// 익명 객체
		Thread th3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("Task_3 : " + i);
				}
				System.out.println("Task_3 run() 함수 END");
			}
		});
		
		th3.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Main : " + i);
		}
		System.out.println("Main run() 함수 END");
	}
}
