import java.util.StringTokenizer;

public class Ex06_String_Method {

	public static void main(String[] args) {
		String str = "hello";
		String concatstr = str.concat(" world");
		System.out.println(concatstr);
		
		boolean bo = str.contains("ello");
		
		System.out.println(bo);
		
		String str2 = "a b c d";
		
		String filename = "hello java world";
		System.out.println(filename.indexOf("e"));
		System.out.println(filename.indexOf("z")); // -1
		
		String filename2 = "home.jpg";
//		String[] strarr = filename2.split("\\."); // .은 정규표현식의 예약어라서 \\를 붙여야함
//		for(int i = 0; i < strarr.length; i++) {
//			System.out.print(strarr[i] + " ");
//		}
		int position = filename2.indexOf(".");
		String file = filename2.substring(0, position);
		String format = filename2.substring(position++);
		
		String str3 = "ABCDDDDDDDDA";
		String result3 = str3.replace("DDD", "오늘은 화요일");
		System.out.println(result3);
		
		
		//StringTokenizer
		String str6 = "a/b,c-d.f";
		StringTokenizer sto = new StringTokenizer(str6, "/,-.");
		while(sto.hasMoreElements()) {
			System.out.println(sto.nextToken());
		}
		
		String str7 = "홍        길          동";
		System.out.println(str7.replace(" ", ""));
		
		String str8 = "    홍길동    ";
		System.out.println(str8.trim());
		
		String str9 = "  홍   길  동  ";
		System.out.println(str9.trim().replace(" ", ""));
		
		int sum = 0;
		String[] numarr = {"1", "2", "3", "4"};
		
		
		
//		String jumin = "111-111";
//		StringTokenizer st = new StringTokenizer(jumin, "-,");
//		int result = 0;
//		while(st.hasMoreElements()) result += Integer.valueOf(st.nextToken());
//		
//		System.out.println(result);
		
		String jumin = "111-111";
		String replacestr = jumin.replace("-", "");
		int result = 0;
		for(int i = 0; i < replacestr.length(); i++) {
			result += Integer.valueOf(replacestr.substring(i, i + 1));
		}
		System.out.println(result);
		
		
	}
}