/*
스트림은 다양한 데이터 소스를 표준환된 방법으로 다루기 위한 것
여기서 다양한 데이터 소스는 (컬렉션과 배열)
ex) List  , Set  , Map  사용하게 헀지만 결국  반쪽 자리 표준화 구현 ..... 
자바 1.8부터 컬렉션과 배열을 통해서 스트림을 만들고  같은 작업을 통해서 구현 .....  표준화의 완성 ^^

컬렉션(배열)   ->  Stream 통해서  ->  n번의 중간연산  ->  최종연산 1번  > 결과 얻기

1. 스트림 (데이터의 연속적인 흐름)
1.1 스트림 만들기 -> 중간연산 -> 최종연산

String[] strarrr= {"dd" , "aaa" , "CC" , "cc" , "h"}
Stream<String> stream = Stream.of(strarr); 문자열 배열이 소스인 스트림
stream.filter()
stream.distinct()
stream.sort()
stream.limit(5)
stream.count()

스트림은 데이터 소스 원본 데이터 변경하지 않고  읽기만 한다
스트림은 iterator 처럼 [ 일회용 ]이다
[ 사용시 다시 생성 ]해서 사용하여야 한다 


[ Stream API의 3가지 단계 ]
Stream은 데이터를 처리하기 위해 다양한 연산들을 지원한다. 
Stream이 제공하는 연산을 이용하면 복잡한 작업들을 간단히 처리 할 수 있는데, 
스트림에 대한 연산은 크게 생성하기, 가공하기, 결과만들기 3가지 단계로 나눌 수 있다.

1. 생성하기
2. 가공하기
3. 결과만들기

1. 생성하기
Stream 객체를 생성하는 단계
Stream은 재사용이 불가능하므로, 닫히면 다시 생성해주어야 한다.
Stream 연산을 하기 위해서는 먼저 Stream 객체를 생성해주어야 한다. 
배열, 컬렉션, 임의의 수, 파일 등 거의 모든 것을 가지고 스트림을 생성할 수 있다. 
여기서 주의할 점은 연산이 끝나면 Stream이 닫히기 때문에, Stream이 닫혔을 경우 
다시 Stream을 생성해야 한다는 것이다.  
  
  
2. 가공하기
--원본의 데이터를 별도의 데이터로 가공하기 위한 중간 연산
--연산 결과를 Stream으로 다시 반환하기 때문에 연속해서 중간 연산을 이어갈 수 있다.
가공하기 단계는 원본의 데이터를 별도의 데이터로 가공하기 위한 중간 연산의 단계이다. 
어떤 객체의 Stream을 원하는 형태로 처리할 수 있으며, 
중간 연산의 반환값은 Stream이기 때문에 필요한 만큼 중간 연산을 연결하여 사용할 수 있다.   
 
  
3. 결과 만들기
가공된 데이터로부터 원하는 결과를 만들기 위한 최종 연산
Stream의 요소들을 소모하면서 연산이 수행되기 때문에 1번만 처리 가능하다.  
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex11_Stream {
	public static void main(String[] args) {
		String[] strarrr= {"dd" , "aaa" , "CC" , "cc" , "h"};
		Stream<String> stream = Stream.of(strarrr);
		 // 1. 문자열 길이가 2 이하인 것만 필터링
        stream = stream.filter(s -> s.length() <= 2);
        // 2. 중복 제거
        stream = stream.distinct();
        // 3. 알파벳순으로 정렬 (대소문자 무시)
        stream = stream.sorted(String.CASE_INSENSITIVE_ORDER);
        // 4. 최대 3개의 요소만 가져오기
        stream = stream.limit(3);
        // 5. 요소 개수 세기
        long count = stream.count();
        // 출력
        System.out.println("Filtered, Distinct, Sorted, Limited, Counted:");
        System.out.println("Total count: " + count);
		/*
		stream.filter()
		stream.distinct()
		stream.sort()
		stream.limit(5)
		stream.count()
		*/
        
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		
    	count =myList.stream()         //생성하기
    		         .filter(s -> s.startsWith("c")) //가공하기
    		         .map(String::toUpperCase)       //가공하기
    		         .sorted()                       //가공하기  
    		         .count();                       //결과 만들기
    		
    	 System.out.println("count : " + count);
    	 /*
    	  	다시 결과를 얻기 위해서는 stream 을 다시 생성하여야 합니다
			위의 코드에서는 먼저 stream()을 통해 Stream 객체를 생성하고 있다. 
			그리고 원하는 데이터를 필터링하고, 변형하고, 정렬하는 중간 연산을 진행하고 있다. 
			이렇듯 중간 연산이 세미콜론 없이 여러 번 연결되는 것은 해당 중간 연산이 Stream을 반환하기 때문이다. 
			이렇게 Stream 연산이 연결된 것을 연산 파이프라인이라고 하기도 한다. 
			최종 연산에서는 필요한 결과를 만들 수 있다. 
			위의 예제에서는 count()를 통해 남아 있는 요소의 갯수를 최종적으로 반환하도록 되어 있다. 
			물론 forEach와 같이 값을 반환하지 않는 최종 연산도 존재한다.  
    	  */
    	 
    	 myList.stream()         //생성하기
         .filter(s -> s.startsWith("c")) //가공하기
         .map(String::toUpperCase)       //가공하기
         .sorted().forEach(System.out::println);
	}
}
