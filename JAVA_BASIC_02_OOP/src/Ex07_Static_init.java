/*
static 초기화
1. static variable : 객체 공유자원 : 객체마다 같은 값을 공유할거야
2. instance variable : 생성되는 객체마다 다른 값을 가짐

두 자원의 공통점은 default
그래서 초기화라는 작업을 하지 않고도 사용 가능
 */
class Test2{
	static int cv = 10;
	static int cv2; // default 0
	int iv = 9; // default 0
	
	// 1. static 초기화 블럭
	// static 자원들의 초기값 할당 목적
	static {
		cv2 = 100;
		//1. static 초기자 실행되는 시점 : static member field memory 올라간 직후 바로 호출
		//2. 조작된 값 .... (제어문)
		cv2 = cv + 2222;
		System.out.println("static 블럭 실행");
	}
	//2. 일반 초기화 블럭
	{
		System.out.println("초기화 블럭 실행");
		if(iv < 10) iv = 10000;
	}
}

public class Ex07_Static_init {
	public static void main(String[] args) {
		System.out.println(Test2.cv);
		
		Test2 test2 = new Test2();
		System.out.println(test2.iv);
	}
}
