/*
JDBC 작업

1. select
1.1 결과 집합(조회)

2. insert, update, delete
2.1 결과 집합 생성되지 않아요 >> resultSet(x)
2.2 반영 결과 return (반영된 행의 수) > update ... 5건 > return 5;

ex)
update emp set sal = 0; >> 실행 >> 14건 반영 >> return 14
update emp set sal = 100 where empno = 9999; >> 실행 >> 반영된 건이 없어요 >> return 0

결과를 받아서 자바에서 로직 처리

Today Key Point
1. Oracle DML (SQL developer에서 또는 sqlplus에서 ...Tool)에서 작업 >> commit, rollback 강제
2. JDBC API 사용해서 Oracle DML 작업을 수행하면 >> default >> auto commit
3. JDBC API 사용해서 JAVA 코드를 통해서 delete from emp >> 실행하면 >> JDBC commit >> 실반영
4. 그래서 JDBC API 옵션을 통해서 commit, rollback 처리 방법 제공

begin
	A 계좌 100 인출 (update
	
	B 계좌 100 이체 (update
end
논리적인 단위... commit 아니면 rollback

JDBC API
당신이 필요하다면 >> autocommit 옵션 >> false

반드시 너 ... java code >> commit 또는 rollback 처리 ... 서버 lock ...

----------------Developer Tool 에서 실행

create table dmlemp
as
    select * from emp;

select * from dmlemp;    

alter table dmlemp
add constraint pk_dmlemp_empno primary key(empno);

select * from user_constraints where table_name = 'DMLEMP';


*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex02_Oracle_DML {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//드라이버 로딩 (생략)
			
			//연결객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KOSA", "1004");

			//명령객체 생성
			stmt = conn.createStatement();
			
			//
			int empno = 0;
			String ename = null;
			int deptno = 0;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("사번입력");
			empno = Integer.parseInt(sc.nextLine());
			
			System.out.println("이름입력");
			ename = sc.nextLine();
	
			System.out.println("부서입력");
			deptno = Integer.parseInt(sc.nextLine());
			
			//
			//전통적인 방법
			String sql = "insert into dmlemp(empno, ename, deptno) ";
			sql += "values(" + empno + ", '" + ename + "', " + deptno +")";
			
			//preparestatement
			//values(?, ?, ?)
			//값을 설정
			
			//명령문 만들기
			//String sql = "insert into dmlemp(empno, ename, deptno) values(9999, '문제아', 10)";
			
			//명령문 실행하기
			int resultrow = stmt.executeUpdate(sql); //auto commit
			
			//로직 처리
			if(resultrow > 0) {
				System.out.println("반영된 행의 수 : " + resultrow);
			}else {
				System.out.println("예외 발생은 아니지만 반영된 행은 없다");
			}
			
		} catch (Exception e) {
			System.out.println("DB 문제가 생기면 if 타지않고 예외로 ... ");
			System.out.println(e.getMessage());
		} finally {
			//자원해제
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
