/*
Java 는 객체지향 언어이기 때문에 기본적으로 함수형 프로그래밍이 불가능하다
JDK8 Stream API 제공 ... 람다식을 사용 

함수형 인터페이스 등을 지원 ... java 이용해서 javascript 에서 사용했던 함수형을 API를 통해서 제공
그 대표 Stream API  는 [ 데이터를 추상화하고 처리하는데 자주 사용하는 함수를 정의 ]해 두었다
ex) select * from emp where sal > 2000 and ename ='길동' and ...
위에서 쓰는 방식을  자바에서도 추상화된 함수를 구현할 수 있다  >> Stream API 구현 람다식 ....
****표준화 , 재사용성  높일 수 있다*****
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Ex07_Stream {
	public static void main(String[] args) {
		String[] namearr = {"Hulk" , "Captain" , "IromMan"};
		
		List<String> namelist = Arrays.asList(namearr);
		
		/*
		  좋아요 ^^
		  Arrays.asList(namearr);
		  Stream API 적용 하기
		  
		 */
		 
		Arrays.sort(namearr);  //원본 변경
		Collections.sort(namelist); //원본 변경
		
		for(String str : namearr) {
			System.out.println(str);
		}
		for(String str : namelist) {
			System.out.println(str);
		}
		
		//JAVA stram API 리팩토링 ...
		
		//1. 원본 데이터 아닌  별도의 데이터 집합을 생성
		Stream<String> arraystream = Arrays.stream(namearr); //정적
		Stream<String> namestream = namelist.stream(); //collection 내부에 stream() 구현
		
		
		System.out.println("***********************************");
		//복사된 데이터를 정렬해서 출력
		arraystream.sorted().forEach(x -> System.out.println(x));
		namestream.sorted().forEach(System.out::println); //메서드 참조
		
		//Stream API 코드의 라인수도 줄고 , 가독성 , 표준화 
		//그런데 쓰는 것은 개발자 마음 ........ 
		

	}

}
/*
함수형 프로그래밍은 선언형 프로그래밍을 따르는 대표적인 패러다임이다


함수형 프로그래밍은 함수들의 집합으로 프로그램을 구성하는 것을 의미합니다
자바에 함수형 프로그래밍 도입은 프로그램 구현 방식에  큰 변화를 가져 왔습니다
함수형 프로그래밍의 함수는 
1. 순수함수(Pure function)  : 함수의 수행 결과(output) 입력(input) 따라 결정
                          : 함수의 실행에 따른 부수효과(side-effect)가 발생하지 않음
2. 일급객체(First-class)    : 함수를 변수 혹은 특정 데이터 구조에 담을 수 있음
                          : 함수를 파라미터를 통해 전달할 수 있고 결과를 변환 할 수 있음
                           
3. 불변의 자료구조 또는 영속 자료구조등 과 같은 특성을 갖습니다
   : 특정 변수/객체의 자료를 직접 변경하지 않고 새로운 인스턴스를 통해 의도하지 않은 변경을 방지


일급객체(First-class Object)란 다른 객체들에 일반적으로 적용 가능한 연산을 
모두 지원하는 객체를 가리킨다. [위키백과]
일급객체의 조건에 대해서 정의를 내려보겠다.

변수에 할당(assignment)할 수 있다.
다른 함수를 인자(argument)로 전달 받는다.
다른 함수의 결과로서 리턴될 수 있다.
위에 대한 조건으로 인해 알 수 있는 것은 함수를 데이터(string, number, boolean, array, object) 다루 듯이 
다룰 수 있다는 점이다.

*/









