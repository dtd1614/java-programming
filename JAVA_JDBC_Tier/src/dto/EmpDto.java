package dto;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;

//emp 테이블과 동일한 구조 클래스 정의
@Data
@Builder
public class EmpDto {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
}
