package kr.or.kosa;

import java.util.EmptyStackException;
import java.util.List;

public class MyStack {
	
	private Object[] stackarr;
	private int top;
	private int maxsize;
	
	public MyStack(int maxsize) {
		this.stackarr = new Object[maxsize];
		this.top = -1;
		this.maxsize = maxsize;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxsize - 1;
	}
	
	public void push(Object object) {
		if(isFull()) throw new IndexOutOfBoundsException("mystack full....");
		stackarr[++top] = object;
		
	}
	
	public Object pop() {
		if(isEmpty()) throw new IndexOutOfBoundsException("mystack empty....");
		return stackarr[top--];
	}
}
