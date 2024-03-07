/*
설계도 2장

class Tv{}
class Vcr{}
 */
class Tv{
	boolean power;
	int ch;
	
	void power() {
		this.power = !this.power;
	}
	
	void chUp(){
		this.ch++;
	}
	
	void chDown() {
		this.ch--;
	}
}

class Vcr{
	boolean power;
	
	void power() {
		this.power = !this.power;
	}
	
	void play() {
		System.out.println("재생....");
	}
	
	void stop() {
		System.out.println("정지....");
	}
	
	void rew() {
		
	}
	
	void ff() {
		
	}
}

//Tv와 Vcr이 합쳐진 설계도

/*
TvVcr 설계도
class TvVcr extends Tv, Vcr (x) : 다중상속 ...금지

class Tv extends Vcr ..... TvVcr extends Tv 계층적 자원 (중복되는 자원 이름 문제)

1. class TvVcr{Tv tv; Vcr vcr; ... new (생성자 안에서)}
2. 클래스의 중요도 (비중이 높으냐)
Tv 비중 .... 가끔 Vcr
 */

class TvVcr{
	Tv tv;
	Vcr vcr;
	
	TvVcr(){
		this.tv = new Tv();
		this.vcr = new Vcr();
	}
}

class TvVcr2 extends Tv{
	Vcr vcr;
	TvVcr2() {
		this.vcr = new Vcr();
	}
}

public class Ex03_Inherit {
	public static void main(String[] args) {
		TvVcr2 mytv = new TvVcr2();
		mytv.power();
		System.out.println(mytv.power);
		mytv.vcr.power();
		System.out.println(mytv.vcr.power);
	}
}
