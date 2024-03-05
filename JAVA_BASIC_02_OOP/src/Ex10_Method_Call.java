
class Data{
	int i;
}

public class Ex10_Method_Call {
	
	static void scall(Data sdata) { // Data라고 하는 타입을 갖는 객체의 주소 값을 받겠다.
		System.out.println("함수 : " + sdata.i);
		sdata.i = 1111;
	}
	
	static void vcall(int x) {  // 값을 받겠다
		
	}

	public static void main(String[] args) {
		Data d = new Data();
		d.i = 100;
		System.out.println("d.i : " + d.i);
	}

}
