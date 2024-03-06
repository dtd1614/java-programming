/*
1. 1~45 까지의 난수를 발생시켜서 6개의 정수값을 배열에 담으세요
2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요 (중복값 검증)

3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요(정렬 : 자리바꿈 : swap)

4. 위 결과를 담고있는 배열을 출력하세요

main 안에서 모두 작성하세요
static 함수를 만들어 기능 나누는 것은 가능 (x)
별도의 Lotto.java 클래스는 생성하지 마세요 ....(x)
*/
public class Ex06_Array_Lotto_Quiz {

   public static void main(String[] args) {
	   
	   int[] numarr = new int[6];
	   
	   for(int i = 0; i < numarr.length; i++) {
		   numarr[i] = (int) (Math.random() * 45 + 1);
		   for(int j = 0; j < i; j++) {
			   if(numarr[j] == numarr[i]) { // 중복값 검사
				   i--;
				   break;
			   }
		   }
	   }
	   
	   for(int num : numarr) System.out.println(num);
	   System.out.println();
	   
	   for(int i = 0; i < numarr.length; i++) { // 버블 정렬
		   for(int j = 0; j < numarr.length - i - 1; j++) { 
			   if(numarr[j] > numarr[j + 1]) { 
				   int temp = numarr[j];
				   numarr[j] = numarr[j + 1];
				   numarr[j + 1] = temp; 
			   }
		   }
	   }
	   
	   for(int num : numarr) System.out.println(num);
	   
   }
}