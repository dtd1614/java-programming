/*
1. String은 클래스 (여러 개의 문자를 담을 수 있는 클래스)
2. String 활용은 함수활용 (클래스는 당연히 함수를 가짐) > 조작(자르고, 합치고, 나누고)
3. String 함수 : 일반함수 + static 함수
 */
public class Ex05_String {
	public static void main(String[] args) {
		String str = "";
		String[] strarr = {"abc", "bbb", "ccc"};
		
		String st = "홍길동";
		System.out.println(st.length()); 
		// String 내부적으로 데이터 관리 자료구조 : char[] 
		// [홍][길][동]
		
		System.out.println(st); //toString() 재정의
		System.out.println(st.toString());
		
		// Object 가지고 있는 toString 재정의 ....
		String sdata = new String("김유신");
		System.out.println(sdata);
		
		String str1 = "AAA";
		String str2 = "AAA";
		System.out.println(str1 == str2); //true str1과 str2의 주소를 비교
		// String 비교는 == 사용하지 마세요
		
		//POINT
		//문자열은 무조건 equals
		System.out.println(str1.equals(str2)); //주소를 찾아가서 그 안에 들어있는 값을 비교
		
		//WHY
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		System.out.println(str3 == str4); //false
		System.out.println(str3.equals(str4)); //true
		
		String s = "A";
		s += "B";
		s += "C";
		
		//String 누적 용도가 아니다
		//Collection 활용
		//StringBuilder, StringBuffer를 써야함
	}
}