package kr.or.kosa;

public class Fclass {
	
	public int getNum(int num1, int num2) {
		return num1 > num2 ? num1 : num2;	
	}
	
	public static void main(String[] args) {
		System.out.println(new Fclass().getNum(12, 20));
	}
}
