import kr.or.kosa.utils.Week;

public class Ex12_Enum {

	public static void main(String[] args) {
		Week today; //열거타입 today 변수는 열거형중에 하나를 가질 수 있다
		
		today = Week.FRIDAY;
		System.out.println(today);
		
		Week nextday = null;
		nextday = Week.SUNDAY;
		System.out.println(nextday == Week.SATURDAY);
	}
}