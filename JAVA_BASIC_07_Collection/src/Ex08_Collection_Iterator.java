/*
Collection Framework
>> 다수의 데이터를 다루는 표준화된 방법 
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ex08_Collection_Iterator {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) { // 현업 권장 (표준화)
			System.out.println(it.next());
		}
		
		// 역방향
		ListIterator<Integer> it3 = list.listIterator();
		
		// 순방향 돈 후
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		// 역방향 실행
		while(it3.hasPrevious()) {
			System.out.println(it3.previous());
		}
		
		//remove
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);

		System.out.println(numbers);
		
		Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext()) {
			int num = itr.next();
			if(num % 2 == 0) {
				itr.remove();
			}
		}
		
		System.out.println(numbers);
	}
}