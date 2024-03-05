/*
이 문제를 푸시면 생성자 활용을 이해 ^^
 
자동차 영업소 입니다.
영업사원은 고객에게 자동차를 팔려고 합니다.
고객은 자동차의 기본 사양을 살 수 도 있고 ....  여러가지 선택 옵션을 선택 할 수 있습니다.
자동차의 기본은
문의 개수 4개 , 자동차의 색상 기본은 red  4개가 기본 입니다
그런데 고객은
문의 개수만 변경 가능하고  자동차의 색상 기본은 red  으로 할 수 있고
문의 개수는 기본으로 하고 자동차의 색상 변경 가능하고
문의 개수와 자동차의 색상 모든 변경 하여 차를 구매할 수 있습니다

자동차 구매
1. 기본 사양  
2. 옵션 : 문 변경 , 자동차의 색상 기본
3. 옵션 : 자동차의 색상 변경 , 문 기본
4. 옵션 : 자동차의 색상 변경 , 문 변경
*/
class Car{
	private int doorCount;
	private String color;
	
	public Car() {
		doorCount = 4;
		color = "red";
	}
	
	public Car(int doorCount) {
		this.doorCount = doorCount;
		this.color = "red";
	}
	
	public Car(String color) {
		this.doorCount = 4;
		this.color = color;
	}
	
	public Car(int doorCount, String color) {
		this.doorCount = doorCount;
		this.color = color;
	}
	
	public void prinfInfo() {
		System.out.printf("doorCount : %d, color : %s \n", doorCount, color);
	}
	
}
public class Ex14_Constructor_Quiz {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.prinfInfo();
		
		Car car2 = new Car(2);
		car2.prinfInfo();

		Car car3 = new Car("blue");
		car3.prinfInfo();

		Car car4 = new Car(8, "green");
		car4.prinfInfo();


	}

}
