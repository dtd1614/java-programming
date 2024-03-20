/*
멀티 스레드 환경 (공유자원)

동기화 synchronized

Vector : 멀티 스레드 환경에서 동기화 보장 
ArrayList : 멀티 스레드 환경에서 동기화 보장하지 않는다 > 성능이 향상

병렬화 : cpu 여러개 쓰는거

한강 화장실 1개 : 공유자원
여러 명 (사람) : 스레드
*/

/*

*/

class Wroom{
	synchronized void openDoor(String name) { // synchronized 동기화
		System.out.println(name + "님 화장실 입장 ^^");
		for(int i = 0; i < 100; i++) {
			System.out.println(name + " 사용 중 " + i);
			if(i == 10) {
				System.out.println(name + "님 끙 @@");
			}
		}
		System.out.println("시원하시죠 ^^");
	}
}

class User extends Thread{
	Wroom wr;
	String who;
	
	User(String name, Wroom wr){
		this.who = name;
		this.wr = wr;
	}
	
	@Override
	public void run() {
		wr.openDoor(this.who);
	}
}

public class Ex05_Sync_Thread {
	public static void main(String[] args) {
		// 여기는 한강 둔치
		Wroom w = new Wroom();
		
		// 사람들이 즐겁게 놀고 있어요
		User kim = new User("김씨", w);
		User lee = new User("이씨", w);
		User park = new User("박씨", w);

		// 배가 아파요
		// 3사람 화장실 달려갑니다
		kim.start(); // run() 실행
		lee.start(); // run() 실행
		park.start(); // run() 실행
	}
}