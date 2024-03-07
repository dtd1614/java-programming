/*
객체 한개만 ....
this : 객체 자신을 가르키는 this (this.empno ...)
this : 생성자를 호출하는 this(this(100, "홍길동))

상속관계
부모, 자식

super(상속관계에서 자식이 부모의 자원 접근 주소 제공) : 상속관계에서 부모에 접근(super)
부모의 주소를 담고 있는 녀석

1. super : 상속관계에서 부모자원에 접근
2. super : 상속관계에서 부모 생성자를 호출

C# : base
java : super
*/
class Base{
	String basename;
	
	Base() {
		System.out.println("부모 클래스 기본 생성자");
	}
	
	Base(String basename){
		this.basename = basename;
		System.out.println("this.basename : " + this.basename);
	}
	
	void method() {
		System.out.println("부모 method");
	}
}

class Derived extends Base{
	String dname;
	Derived(){
		System.out.println("자식 클래스 기본 생성자");
	}
	Derived(String dname){
		// 부모 생성자 (overloading)
		super(dname);
		this.dname = dname;
		System.out.println("dname : " + this.dname);
	}
	
	@Override
	void method() {
		System.out.println("부모함수 재정의");
	}
	
	void parentMethod() {
		super.method();
	}
}
public class Ex06_Inherit_super {
	public static void main(String[] args) {
		//Derived d = new Derived();
		Derived d = new Derived("홍길동");
		d.method();
		
		d.parentMethod();
		d.parentMethod();
		
		
	}
}
