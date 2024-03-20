enum Color {
    RED, GREEN, BLUE;
    
  
}
public class Ex14_Enum {

	public static void main(String[] args) {
		// values(): Enum 상수를 배열로 반환
        Color[] colors = Color.values();

        // 값들을 반복하여 출력
        for (Color color : colors) {
            System.out.println("Enum 상수: " + color + ", 순서: " + color.ordinal() + 
            		           ", 이름: " + color.name());
        }

        // valueOf(String name): 지정된 이름과 일치하는 Enum 상수 반환
        String colorName = "RED";
        Color redColor = Color.valueOf(colorName); // 대소문자 구분

        System.out.println("값이 " + colorName + "인 Enum: " + redColor);

        // compareTo(): Enum 상수들 간의 비교
        Color firstColor = Color.RED;
        Color secondColor = Color.BLUE;

        int comparison = firstColor.compareTo(secondColor);

        if (comparison < 0) {
            System.out.println(firstColor + " comes before " + secondColor);
        } else if (comparison > 0) {
            System.out.println(firstColor + " comes after " + secondColor);
        } else {
            System.out.println(firstColor + " and " + secondColor + " are the same");
        }

	}

}
