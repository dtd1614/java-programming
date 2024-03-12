/*
user 사용자 <> provider 제공자
class A {}
class B {}

관계 : A는 B를 사용합니다

1. 상속 : A extends B
2. 포함 : A라는 클래스가 B를 자신의 멤버 필드로 사용 : class A {B b;}
2.1. 부분
2.2. 전체

class B {}
class A {
	int i;
	B b; // A는 B를 사용합니다. (포함)
	A(){
		b = new B();
	}
}

포함 관계
>> B는 독자생성 불가능 >> A라는 객체가 생성되면 B도 생성
>> 전체 집합
>> 자동차와 엔진, 노트북과 cpu

class B{}
class A{
	int i;
	B b;
	A(){}
	void m(B b){
		this.b = b;
	}
}

>> main(){
	A a = new A();
	B b = new B(); // 필요에 따라서 (노트북 사용하다가 불편해... 마우스 사용해야지...)
	a.m(b);
}
같은 운명이 아니다
부분집합
>> 노트북과 마우스, 학교와 학생

A는 B를 사용합니다 (참조) >> 포함 >> A가 B를 멤버 필드로 갖는다 >> 부분과 전체 동일 >> 구분하자 ...
 */

interface Icall{
	void m();
}

class D implements Icall{

	@Override
	public void m() {
		System.out.println("D Icall 인터페이스의 m() 재정의");
		
	}	
}

class F implements Icall{

	@Override
	public void m() {
		System.out.println("F Icall 인터페이스의 m() 재정의");
		
	}	
}

class C{
	void method(Icall ic) {
		ic.m(); // 부모타입(추상함수 재정의)
	}
}
public class Ex05_User_Provider {

	public static void main(String[] args) {
		D d = new D();
		F f = new F();
		
		C c = new C();
		c.method(d);
		c.method(f);
	}
}