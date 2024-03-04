package kr.or.kosa;

public class Tv {
	public int channel;
	public String brand;
	
	public Tv(String brand) {
		this.brand = brand;
	}
	
	public void plusChannel() {
		if(channel < 200) channel++;
	}
	
	public void minusChannel() {
		if(channel > 0) channel--;
	}
	
	public void printInfo() {
		System.out.printf("channel : %d, brand : %s \n", channel, brand);
	}
	
	public static void main(String[] args) {
		Tv tv = new Tv("LG");
		tv.printInfo();
		for(int i = 0; i < 5; i++) tv.plusChannel();
		tv.minusChannel();
		tv.printInfo();

		
	}

}
