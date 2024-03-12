import java.util.Scanner;

public class Ex07_String_Total_Quiz {
	public static void main(String[] args) {
		String inputssn = new Scanner(System.in).nextLine();
		
		System.out.println(checkDigit(inputssn));
		System.out.println(checkRange(inputssn));
		printGender(inputssn);
	}
	
	static boolean checkDigit(String ssn) {
		return ssn.substring(6, 7).equals("-") && ssn.length() == 14;
	}
	
	static boolean checkRange(String ssn) {
		int num = Integer.valueOf(ssn.substring(7, 8));
		return 1 <= num && num <= 4;
	}
	
	static void printGender(String ssn) {
		int num = Integer.valueOf(ssn.substring(0, 1));
		if(num == 1 | num == 3) System.out.println("남자");
		else if(num == 2 | num == 4) System.out.println("여자");
		else System.out.println("판별불가");	
	}
}