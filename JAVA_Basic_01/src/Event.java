
public class Event {
	
	public static void main(String[] args) {
		int point = ((int)(Math.random() * 10) + 1) * 100;
		
//		String[] prizes = {"TV", "NoteBook", "냉장고", "한우세트", "휴지"};
//		
//		String result = "칫솔";
//				
//		if(point >= 600) {
//			result = "";
//			int count = (point - 600)/100 + 1 ;
//			for(int i = 0; i < count; i++) result += prizes[i] + " ";
//		}
//		
//		System.out.println("고객님의 점수는 " + point + "입니다." + result + "에 당첨되셨습니다.");
		
		String prizes = "";
		
		point = 600;
		
		switch(point) {
			case 1000 : prizes += "티비, ";
			case 900 : prizes += "노트북, ";
			case 800 : prizes += "냉장고, ";
			case 700 : prizes += "한우세트, ";
			case 600 : prizes += "휴지"; break;
			default : prizes = "칫솔";
		}
		
		System.out.println("고객님의 점수는 " + point + "입니다. " + prizes + "에 당첨되셨습니다.");

	}

}
