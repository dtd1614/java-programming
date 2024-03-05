/*
static member field : 객체 간 공유자원
static method : public static void main

static 함수를 왜 사용할까요
1. 객체 생성 없이 사용할려고
2. 많이 사용하니까 >> 편하게 쓰게 >> new 없이 >> 바로 사용 (메모리에 올려줄게)
3. 설계도 : 많이 사용하면 static으로 설계
 */ 
class StaticClass{
	int iv;
		
	static int cv;
		
	static void print() {
		System.out.println("static print");
	}
	
	void printIv() {
		cv = 100;
	}
}

public class Ex08_Static_method {
	public static void main(String[] args) {
		System.out.println(StaticClass.cv);
		StaticClass.print();
		
		StaticClass st = new StaticClass();
		st.iv = 200;
		st.printIv();
	}
}