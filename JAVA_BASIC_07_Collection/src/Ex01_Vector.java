/*
Collection Framework
다수의 데이터를 다루는 표준화된 인터페이스를 구현하고 있는 클래스의 집합
Collection 인터페이스 > 상속 List > 구현 > ArrayList
Collection 인터페이스 > 상속 Set > 구현 > HashSet

1. ArrayList의 부모 타입은 List다 (o)
*/
import java.util.Vector;

public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());
		System.out.println("size : " + v.size());
		
		v.add("AA");
		v.add("BB");
		v.add("CC");
		v.add(10);
		
		System.out.println(v.size());
		System.out.println(v.toString());
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		for(Object obj : v) {
			System.out.println(obj);
		}
		
		Vector<String> v2 = new Vector();
		v2.add("hello");
		v2.add("word");
		for(String str : v2) {
			System.out.println(str);
		}
		
		Vector v3 = new Vector();
		System.out.println(v3.capacity()); // 10
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("B"); // 열한번째 >> 방의 크기 20개 생성 >> 이동
		
		System.out.println(v3.capacity()); // 20
		
		
		
	}
}