package kr.or.kosa.utils;

import java.util.Calendar;

//전체 프로젝트에서 사용하는 [날짜 관련 함수]를 모아서 [편하게 쓰고 싶어요] ..[많이 사용]
/*
그럼 함수의 어찌 만들면 좋을 까요 ^^
1. overloading
2. static 
*/
public class DateUtils {
  public static String dateString(Calendar date) {
	  
	  //format 관련 함수 (simple )
	  return date.get(Calendar.YEAR) + "년" + 
	         (date.get(Calendar.MONTH) + 1) + "월" +
			  date.get(Calendar.DATE) + "일";
  }
  public static String dateString(Calendar date , String opr) {
	 
	  return date.get(Calendar.YEAR) + opr + 
		         (date.get(Calendar.MONTH) + 1) + opr +
				  date.get(Calendar.DATE);
  }
  /*
  요구사항
  2024년10월12일
  2024년3월20일
  
  1~9 >> 01, 02 , 03 형식  >> 2024년03월20일
  10,11,12 >> 그대로
  
  */
  public static String monthForamat_DateString(Calendar date) {
	  String month=null;
	  if((date.get(Calendar.MONTH)+1) < 10) {
		  month="0"+ (date.get(Calendar.MONTH)+1);
	  }else {
		  month = String.valueOf((date.get(Calendar.MONTH)+1));
	  }
	  return 	date.get(Calendar.YEAR) + "년" + 
      			month + "월" +
      			date.get(Calendar.DATE) + "일";
  }
}
