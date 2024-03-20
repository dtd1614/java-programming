import java.util.Calendar;

import kr.or.kosa.utils.DateUtils;

public class Ex10_Calendar {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // 0월
		int day = now.get(Calendar.DATE);
		
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("day : " + day);
		
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		
		int ampm = now.get(Calendar.AM_PM);
		String strampm = null;
		if(ampm == Calendar.AM) {
			strampm ="오전";
		}else {
			strampm ="오후";
		}
		System.out.println(strampm);
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println("hour : " + hour);
		System.out.println("minute : " + minute);
		System.out.println("second : " + second);
		
		//웹 페이지 개발 (200본) : 날짜 200페이지 날짜 ...추가 (2024/12/12)
		//별도의 사용 작업 ... DateUtils 클래스 >> 함수 만들거나 .. 수정
		
		System.out.println(DateUtils.dateString(Calendar.getInstance()));
		System.out.println(DateUtils.dateString(Calendar.getInstance(),"*"));
		System.out.println(DateUtils.monthForamat_DateString(Calendar.getInstance()));
		
		
	}

}
