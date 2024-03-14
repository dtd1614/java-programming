import java.util.HashMap;
import java.util.Map;

class Student{
	int kor;
	int math;
	int eng;
	String name;
	public Student(int kor, int math, int eng, String name) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.name = name;
	}
}

public class Ex13_Map_Generic {
	public static void main(String[] args) {
		Map<String, String> sts = new HashMap<>();
		sts.put("A", "AAAA");
		System.out.println(sts.get("A"));
	}
}
