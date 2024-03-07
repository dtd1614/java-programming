/*
public 
default
private

protected
 */

import kr.or.kosa.Pclass;

class Dclass{
	public int i;
	private int p;
	int d;
	protected int k; // 상속이 아니면 쓸 일이 없다.
}

class Child2 extends Pclass{
	void method() {
		this.k = 100; // 상속관계에서 protected 자원에 접근 가능
		System.out.println(this.k);
	}
	
	// Pclass >> protected void m()
	// *** Point
	// protected method의 진정한 의미는 상속관계 재정의를 강제하는 방법
	
	@Override
	protected void m() {
		//super.m();
		System.out.println("부모 함수 재정의");
	}
}

public class Ex08_Inherit_Protected {
	public static void main(String[] args) {
		Child2 ch2 = new Child2();
		//ch2.k >> protected int k; 안보여요 default 성질 때문에
		ch2.m(); 

	}
}