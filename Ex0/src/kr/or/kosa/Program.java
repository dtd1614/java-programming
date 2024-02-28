package kr.or.kosa;

public class Program {
	
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.empno = 7788;
		emp.ename = "홍길동";
        
		Emp emp2 = emp;		
	}

}
