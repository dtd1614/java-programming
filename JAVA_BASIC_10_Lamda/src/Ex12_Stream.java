/*
1. Stream 생성하기
앞서 설명한대로 Stream API를 사용하기 위해서는 먼저 Stream을 생성해주어야 한다. 
타입에 따라 Stream을 생성하는 방법이 다른데, 
여기서는 Collection과 Array에 대해서 Stream을 생성하는 방법에 대해 알아보도록 하자.

[ Collection의 Stream 생성 ]
Collection 인터페이스에는 stream()이 정의되어 있기 때문에, 
Collection 인터페이스를 구현한 객체들(List, Set 등)은 모두 이 메소드를 이용해 Stream을 생성할 수 있다.
stream()을 사용하면 해당 Collection의 객체를 소스로 하는 Stream을 반환한다.


*/
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class Ex12_Stream {

	public static void main(String[] args) {
		// List로부터 스트림을 생성
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> listStream = list.stream();

		// 배열로부터 스트림을 생성
		Stream<String> stream =  Stream.of("a", "b", "c"); //가변인자
		Stream<String> stream2 = Stream.of(new String[] {"a", "b", "c"});
		Stream<String> stream3 = Arrays.stream(new String[] {"a", "b", "c"});
		Stream<String> stream4 = Arrays.stream(new String[] {"a", "b", "c"}, 0, 3); 
		//end범위 포함 x   0 , 3 과 은 포함되지 않아요



         stream.forEach(System.out::println);
        /*
		  [ 원시 Stream 생성 ]
		  위와 같이 객체를 위한 Stream 외에도 int와 long 그리고 double과 같은 원시 자료형들을 사용하기 위한 
		  특수한 종류의 Stream(IntStream, LongStream, DoubleStream) 들도 사용할 수 있으며, 
		  Intstream같은 경우 range()함수를 사용하여 기존의 for문을 대체할 수 있다.
		*/
        // 4이상 10 이하의 숫자를 갖는 IntStream
       IntStream stream5 = IntStream.range(4, 10);
       stream5.forEach(System.out::println);
	}

}
