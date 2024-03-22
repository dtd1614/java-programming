//https://cafe.naver.com/hyosungedu/326


/*
콜론 두개 (:: – 이중 콜론 연산자)의 정식 명칭은 메소드 참조 표현식(method reference expression)이며, 
결론부터 말하자면 람다식에서 파라미터를 중복해서 쓰기 싫을 때 사용합니다. 
말 그대로 람다 표현식(expression)에서만 사용 가능하고, 
사용 방법은 [인스턴스]::[메소드명(또는 new)]으로 사용하는데, 스태틱 메소드인 경우 인스턴스 대신 
클래스 이름으로 사용할 수 있습니다.

        List<String> names = Arrays.asList("kglim", "hong");
        // x를 건네고 받는 과정에서 x를 두 번 적게 된다.
        //***********************************************
        names.forEach(x -> System.out.println(x));
        //***********************************************
        // 아예 x들을 빼버리고 아래와 같이 작성할 수 있다.
        names.forEach(System.out::println); //코드 해석 .... parameter 생략 하고 출력 
        
        //PrintStream out 



*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ex05_Lamda_method_ref {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("kglim","hong");
		
		//"kglim" > x parameter  받아서   System.out.println("kglim")
		names.forEach(x -> System.out.println(x));
		names.forEach(System.out::println);
		//x parameter  제고 하고 사용
		
		//stream 통해서 ....
		int sum = IntStream.of(1,3,5,6,7).peek(System.out::println).sum();
		System.out.println("sum : " + sum);
	}

}







