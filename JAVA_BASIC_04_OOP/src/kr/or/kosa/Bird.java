package kr.or.kosa;

public class Bird {
	public void fly() {
		System.out.println("flying");
	}
	
	protected void moveFast() {
		fly();
	}
}
