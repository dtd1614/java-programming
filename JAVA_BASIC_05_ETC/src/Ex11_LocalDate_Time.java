import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Ex11_LocalDate_Time {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date); //2024-03-19
		
		LocalDate parisdate = LocalDate.now(ZoneId.of("Europe/Paris"));
		System.out.println(parisdate); //2024-03-19
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println("time : " + time);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println("현재시간 : " + time.format(dtf));
		
		LocalDateTime result1 = time.plusYears(1);
		System.out.println("1년 plus : " + result1.format(dtf));
		
		LocalDateTime result2 = time.minusMonths(5);
		System.out.println("5월 minus : " + result2.format(dtf));
		
		
		LocalDateTime result3 = time.plusDays(1000); //100일기념
		System.out.println("100일 plus : " + result3.format(dtf));
	}

}
