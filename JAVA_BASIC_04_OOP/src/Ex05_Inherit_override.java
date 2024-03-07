import kr.or.kosa.Emp;

class Test2{
	int x = 100;
	void print() {
		System.out.println("부모함수 Test2");
	}
}
class Test3 extends Test2{
	int x = 300;  //C# 부모 무시하기 (쓰지 마세요)
	
	@Override
	void print() {
		System.out.println("자식이 부모 함수를 재정의");
	}
	
	void print(String str) {  //overloading
		System.out.println("나 오버로딩 함수야" + str);
	}
}
public class Ex05_Inherit_override {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		System.out.println(t3.x);
		t3.print();
		
		Emp emp = new Emp(1000, "홍길동");
		System.out.println(emp);
		// emp를 출력하면 .toString은 자동으로 호출됨
		System.out.println(emp.toString());
	}
}
