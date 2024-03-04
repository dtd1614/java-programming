package kr.or.kosa;

public class Person {
	public String name; // 멤버 필드는 default 값을 갖고 있다. (null)
	public int age; // default 0
	public boolean power; // default false
	
	public void personPrint() {
		System.out.printf("이름은 %s 나이는 %d 파워는 %s 입니다 \n", name, age, power);
	}
	/*
	1. instance variable은 초기화하지 않아도 사용 가능하다. (default 값을 가지고 있어서)
       local variable은 초기화하지 않으면 사용불가
    
    2. public int age; default 0을 가지고 있다.
       생성되는 객체마다 다른 값을 가지기 때문에 보통은 초기화 하지 않아요
       point) instance variable 일반적으로 초기화를 하지 않는다.
	 */
	
	
	
}
