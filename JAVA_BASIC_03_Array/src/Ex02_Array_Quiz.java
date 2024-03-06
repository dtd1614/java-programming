
public class Ex02_Array_Quiz {
	public static void main(String[] args) {
		int[] score = new int[] {79,88,97,54,56,95};
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i < score.length; i++) {
			max = max < score[i] ? score[i] : max;
			min = min > score[i] ? score[i] : min;
		}
		
		System.out.printf("max : %d , min : %d", max, min);
		
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			System.out.println(numbers[i]);
		}
		
		System.out.println();
		int[] jumsu = {100, 55, 90, 60, 78};
		int sum = 0;
		float avg = 0f;
		
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
			if(i == jumsu.length - 1) avg = sum / (float)jumsu.length;
			
		}
		
		System.out.println(numbers.length + "\n" + sum + "\n" + avg);
	}
}
