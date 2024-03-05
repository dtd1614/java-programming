import kr.or.kosa.Person;

class Test{
	int i;
	int j;
	void print() {
		System.out.println(i);
	}
}
public class Ex01_Ref_Type {
	
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("참조값을 가지고 있다 : "  + test);
		test.i = 100;
		test.j = 200;
		
		Test test2 = test;
		System.out.println(test2.i);
		System.out.println(test2.j);
		
		Person person1 = new Person();
		person1.name = "홍길동";
		person1.age = 100;
		person1.power = true;
		
		Person person2 = new Person();
		
		if(person1 == person2) {
			System.out.println("같은 집에 살아요 ^^");
		}else {
			System.out.println("서로 다른 집에 살아요 ㅠㅠ");
		}
	}
}
