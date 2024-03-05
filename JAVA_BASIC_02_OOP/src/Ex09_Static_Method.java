
public class Ex09_Static_Method {
	
	void method() {
		System.out.println("일반 함수야");
	}
	
	static void smethod() {
		System.out.println("나 static 함수야");
	}
	
	public static void main(String[] args) {
		new Ex09_Static_Method().method();
		Ex09_Static_Method.smethod();
	}
}
