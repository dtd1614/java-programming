package kr.or.kosa.utils;
/*
디자인 패턴 (생성에 관련된 이야기) new
싱글톤 : 객체 하나를 만들어서 공유 .....
의도 : 하나의 객체를 공유하는 보장성 코드를 만들어서 사용해라

공유 Print(IP) >> 모든 사원의 컴퓨터가 사용
 */
public class Singleton {
	
	private static Singleton instance;
	
	// 객체 생성을 ..... 못하게
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) instance = new Singleton(); 
		return instance;
	}
}
