import java.util.ArrayList;

public class Ex03_ArrayList {
	
	public static void main(String[] args) {
		ArrayList alist = new ArrayList();
		alist.add(100);
		alist.add(200);
		alist.add(300);
		
		for(int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		
		// add 함수는 순차적으로 데이터를 추가하는 함수
		
		System.out.println(alist.toString());
		
		alist.add(0, 4444); // 덮어쓰기 안되고 뒤로 밀려남
	}
}