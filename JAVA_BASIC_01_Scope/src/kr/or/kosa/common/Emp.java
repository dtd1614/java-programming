package kr.or.kosa.common;
/*
클래스, 필드, 생성자, 메서드 
public : 클래스, 필드, 메서드, 생성자
protected (상속관계) : 
default : 클래스, 필드, 메서드, 생성자
private : 필드(간접할당), 메서드, 생성자
*/

public class Emp {
	
	private int empno;
	private String ename;
	private String job;
	private int sal;
	
	public Emp() {
		
	}
	
	public Emp(int empno, String ename, String job, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	

}
