import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex09_Date {
	
	static boolean checkDate(String checkDate) {
		
		try {
			  SimpleDateFormat dateformatparser = new SimpleDateFormat("yyyy/MM/dd");
			  //검증할 날짜 포맷 적용
			  dateformatparser.setLenient(false); //false 일 경우 입력한 값이 형식에 맞지 않으면 예외 발생시켜라
			  dateformatparser.parse(checkDate); //대상 값이 포맷이 적용되는지 확인
			  return true;
		} catch (Exception e) {
			  return false;
		}
	}
	
	public static void main(String[] args) throws Exception {

		String exdate1 = "2024/03/03";
		String exdate2 = "20240303";
		
		System.out.println(checkDate(exdate1));
		System.out.println(checkDate(exdate2));
		
		
		Date now = new Date();
		String strnow = now.toString();
		System.out.println(strnow);
		
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String strnow2 = sdf.format(now);
		System.out.println("********************************************");
		System.out.println(strnow2);

		//Date 구버전
		//Calendar 신버전
		
		Calendar cal = Calendar.getInstance();
		//1 . new Calendar();  >> getInstance() >> 날짜 형식을 알아서 제공 >> 테국 과 아닌나라 ...
		/*
		Calendar : 추상클래스, 직접 객체를 생성할 수 없고, 메서드를 통해서 완전히 구현된 클래스의 인스턴스를 얻어야 함
		Calendar cal = new Calendar(); // 에러 - 추상클래스는 인스턴스 생성 불가
		Calendar cal = Calendar.getInstance(); // OK - getInstance()메서드는 Calendar 클래스를 구현한 클래스의 인스턴스를 반환
		Caledar를 상속받아 완전히 구현한 클래스
		GregorianCalendar : Calendar를 상속받아 오늘날 전세계 공통으로 사용하고 있는 그레오리력에 맞게 구현한 것, 태국을 제외한 나머지 국가에서 사용
		BuddhistCalendar
		
		*/
		System.out.println(cal); //문자열
		System.out.println(cal.getTime()); //return type Date
		// Tue Mar 19 09:19:02 KST 2024
		
		//Project 고민
		//날짜 (어떤 타입) > Date or String > DB (varchar()) > Date
		String date1 = "2024/01/04"; //날짜형 문자 
		String date2 = "2024/01/01";
		
		//두 날짜의 차를 구하세요 
		//Date 형식
		
		//Project 날짜 domain 어찌 관리 (타입)
		
		Date format1 = new SimpleDateFormat("yyyy/MM/dd").parse(date1);
		Date format2 = new SimpleDateFormat("yyyy/MM/dd").parse(date2);
		System.out.println("format1 : " + format1);
		System.out.println("format2 : " + format2);
		
		//날짜 차 , 연산 작업
		long diffsec = (format1.getTime() - format2.getTime()) / 1000;  //초 차이
		long diffmin = (format1.getTime() - format2.getTime()) / 60000;  //초 차이
		long diffHor = (format1.getTime() - format2.getTime()) / 3600000;  //초 차이
	
		System.out.println(diffsec + "초 차이");
		System.out.println(diffmin + "분 차이");
		System.out.println(diffHor + "시 차이");
		
		long diffdays = diffsec / (24*60*60); //일자수 차이
		
		System.out.println(diffdays + "일 차이");
	}

}
