package kr.or.kosa.utils;

import java.util.regex.Pattern;

//생년월일
//핸드폰번호
//이메일

public class Regular_expression {
	public static void main(String[] args) {
		
// -----------------------------------생년월일---------------------------------------
		
		String birthRegex = "^(19|20)\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$";
		/*
		^: 문자열의 시작
		(19|20) : 19 또는 20
		\\d{2} : 2자리 숫자
		(0[1-9]|1[0-2]) : 01 ~ 09 또는 10 ~ 12.
		(0[1-9]|[1-2][0-9]|3[0-1]) : 01~09 또는 10~29 또는 30~31
		$: 문자열의 끝
		 */
		String birth1 = "1999-06-24";
		String birth2 = "dsafdfsdfs";
		System.out.println("----------생년월일---------");
		System.out.printf("%s : %b\n", birth1, Pattern.matches(birthRegex, birth1));
		System.out.printf("%s : %b\n", birth2, Pattern.matches(birthRegex, birth2));

// ---------------------------------휴대폰 번호---------------------------------------------
		
		String phonenumRegex = "^01(0|1|[6-9])-(\\d{3}|\\d{4})-\\d{4}$";
		/*
		^: 문자열의 시작
		01: 01로 시작
		(0|1|[6-9]): 0 또는 1 또는 6~9
		(\\d{3}|\d{4}): 3자리의 숫자 또는 4자리의 숫자
		\\d{4}: 네 자리 숫자
		$: 문자열의 끝
		 */
		String phonenum1 = "010-4575-2518";
		String phonenum2 = "dsafdfsdfs";
		System.out.println("----------휴대폰 번호---------");
		System.out.printf("%s : %b\n", phonenum1, Pattern.matches(phonenumRegex, phonenum1));
		System.out.printf("%s : %b\n", phonenum2, Pattern.matches(phonenumRegex, phonenum2));
		
// -------------------------------이메일------------------------------------------------

		
		String emailRegex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?$";
		/*
		^: 문자열의 시작
		[a-zA-Z0-9]+: 소문자 대문자 숫자를 포함한 1개 이상의 문자가 있어야됨
		(\\.[a-zA-Z0-9]+)?: 하위 도메인은 0개 또는 1개
		$: 문자열의 끝
		 */
		String email1 = "dtd6055@mju.ac.kr";
		String email2 = "dtd1614@gmail.com";
		String email3 = "fkslajflksdafjldk";
		System.out.println("----------휴대폰 번호---------");
		System.out.printf("%s : %b\n", email1, Pattern.matches(emailRegex, email1));
		System.out.printf("%s : %b\n", email2, Pattern.matches(emailRegex, email2));
		System.out.printf("%s : %b\n", email3, Pattern.matches(emailRegex, email3));
		
// ------------------------------------------------------------------------------------------

	}
}
