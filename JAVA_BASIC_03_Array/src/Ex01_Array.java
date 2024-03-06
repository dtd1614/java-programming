import java.util.ArrayList;
import java.util.List;

/*
1. new 통해서 만든다 (주소값)
2. heap 메모리에 생성 (GC 관리)
3. 정적배열(고정배열) : 배열은 한번 선언하면 (방의 크기가 정해지면) 변경불가 <-> Collection(동적) (ArrayList)
4. 자료구조 : 기초적인 자료구조
 */

public class Ex01_Array {
	public static void main(String[] args) {
		int[] score = new int[5];
		
		System.out.println(score[0]);
		score[0] = 100;
		score[1] = 200;
		score[2] = 300;
		score[3] = 400;
		score[4] = 500;
		
		System.out.println(score[3]);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(score[i]);
		}
		
		for(int i = 0; i < score.length; i++) {
			System.out.printf("[%d] = %d \t",i, score[i]);
		}
		
		System.out.println();
				
		// Today Point
		// 배열 만드는 3가지
		int[] arr = new int[5];
		int[] arr2 = new int[] {10,20,30};
		int[] arr3 = {11, 22, 33}; // 컴파일러가 new 해요
		
		// 배열은 객체다
		int[] arr4;
		arr4 = new int[] {21,22,23,24,25};
		int[] arr5 = arr4;
		
		System.out.println(arr4 == arr5);
		
		// 배열은 타입 : 8가지 타입 + String + 클래스(타입)
		
		ArrayList array = new ArrayList<>();
	}
}
