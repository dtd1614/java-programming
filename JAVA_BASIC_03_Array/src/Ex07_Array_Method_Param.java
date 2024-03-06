class Human{
	String name;
	
	void method(String ...values) {  // method("A") ..... javascript (매개변수 처리)
		
	}
	void method2(String[] s) {
		
	}
}

class OverClass{
	int add(int i, int j) {
		return i + j;
	}
	
	void add(Human human) {
		System.out.println(human.name);
	}
	
	int add(int param) {
		return param + 100;
	}
	
	int[] add(int[] params) {
		int[] target = new int[params.length];
		for (int i = 0; i < params.length; i++) {
			target[i] = params[i] + 1;
		}
		return target;
	}
}

public class Ex07_Array_Method_Param {
	public static void main(String[] args) {
		OverClass oc = new OverClass();
		int[] source = {10,20,30,40,50};
		int[] ta = oc.add(source);
		for(int value : ta) {
			System.out.println(value);
		}
	}
}
