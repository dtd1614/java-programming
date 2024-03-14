import java.util.List;
import java.util.Stack;

class Coin{
	int value;
	Coin(int value){
		this.value = value;
	}
	
	int getValue() {
		return this.value;
	}
}

public class Ex05_Stack_Queue {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop()); //C
		System.out.println(stack.pop()); //B
		System.out.println(stack.pop()); //A
		
		System.out.println(stack.isEmpty()); //true 
		
		
		// 동전 케이스
		Stack<Coin> coinBox = new Stack<>();
		coinBox.push(new Coin(10));
		
		

	}
}
