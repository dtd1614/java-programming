/*
프로그램(워드, 게임)을 실행하면 프로세스가 된다.
프로세스는 최소 하나의 스레드를 가지고 있다.(하나의 스택 메모리를 가지고 있다.)
main도 하나의 스레드이다.
프로그램을 실행하면 jvm이 스레드(스택)를 하나 생성한다.
그리고 main 함수를 실행한다.

지금까지 배운 것은 싱글 프로세스의 싱글 스레드이다. main 함수만 실행했다. 그 다음에 실행되는 함수는 하나의 스택을 사용해 실행했다.
싱글스레드는 순서를 보장한다.
 */

public class Ex01_Signle_Thread {
	public static void main(String[] args) {
		System.out.println("나 main 일꾼이야");
		worker();
		worker2();
		System.out.println("main 일꾼 종료");
	}
	
	static void worker() {
		System.out.println("나 worker 일꾼이야");
	}
	static void worker2() {
		System.out.println("나 worker2 일꾼이야");
	}
}
