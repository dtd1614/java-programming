import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex15_Stream {
	public static void main(String[] args) {
		/*
		[ 특정 연산 수행 - Peek ]
		Stream의 요소들을 대상으로 Stream에 영향을 주지 않고 특정 연산을 수행하기 위한 peek 함수가 존재한다. 
		'확인해본다'라는 뜻을 지닌 peek 단어처럼, peek 함수는 Stream의 각각의 요소들에 대해 특정 작업을 수행할 
		뿐 결과에 영향을 주지 않는다. 또한 peek 함수는 파라미터로 함수형 인터페이스 Consumer를 인자로 받는다. 
		예를 들어 어떤 stream의 요소들을 중간에 출력하기를 원할 때 다음과 같이 활용할 수 있다.
		*/
		
		int sum = IntStream.of(1, 3, 5, 7, 9)
				  .peek(System.out::println)
				  .sum(); 
		System.out.println("sum : " + sum);
		
		/*
		 [ 원시 Stream <-> Stream ]
			작업을 하다 보면 일반적인 Stream 객체를 원시 Stream으로 바꾸거나 그 반대로 하는 작업이 필요한 경우가 있다. 
			이러한 경우를 위해서, 일반적인 Stream 객체는 mapToInt(), mapToLong(), mapToDouble()이라는 
			특수한 Mapping 연산을 지원하고 있으며, 그 반대로 원시객체는 mapToObject를 통해 일반적인
 			Stream 객체로 바꿀 수 있다.
		 */
		// IntStream -> Stream<String>
		IntStream.range(1, 4).mapToObj(i -> "a" + i);
		
		// Stream<Double> -> IntStream -> Stream<String>
		Stream.of(1.0, 2.0, 3.0).mapToInt(Double::intValue).mapToObj(i -> "a" + i);
		
		
	}
}
