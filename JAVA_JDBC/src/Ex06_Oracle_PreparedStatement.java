/*
PreparedStatement (준비된 Statement )
(1) 설명 
미리 SQL문이 셋팅된 Statement 가 DB가 전송되어져서 컴파일되어지고, SQL문의 ?만 나중에 추가 셋팅해서 실행 
이 되어지는 준비된 Statement 

(2) 장점
<1> Statement 에 비해서 반복적인 SQL문을 사용할 경우에 더 빠르다. ( 특히, 검색문 )
<2> DB컬럼타입과 상관없이 ?하나로 표시하면 되므로 개발자가 헷깔리지 않고 쉽다. ( 특히, INSERT문 )
(이유: ?를 제외한 SQL문이 DB에서 미리 컴파일되어져서 대기)

(3) 단점
SQL문마다 PreparedStatement 객체를 각각 생성해야 하므로 재사용불가
(but, Statement 객체는 SQL문이 달라지더라도 한 개만 생성해서 재사용이 가능하다. )

(4) 특징
<1> Statement stmt = con.createStatement(); //생성 stmt.execute(sql);//실행
<2> PreparedStatement pstmt = con.prepareStatement(sql); //생성 pstmt.execute(); //실행

(5) 주의
DB 객체들(table, ..)의 뼈대( 테이블명 or 컬럼명 or 시퀀스명 등의 객체나 속성명)은
?로 표시할 수 없다.

즉, data 자리에만 ?로 표시할 수 있다.
cf) 그래서, DDL문에서는 PreparedStatement를 사용하지 않는다.

장점 :

보안 (매 실행시 마다 전체 쿼리를 보내지 않아요 ) > 제일 처음 > 전체 문장 컴파일 > 그 다음 > parameter  값만
미리 컴파일 (쿼리문) .... 

성능 : 네트워크 트래픽 ..등 ...

단점 : 쿼리문장이 바뀌면 다시 컴파일 ...

*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import kr.or.kosa.utils.ConnectionHelper;

public class Ex06_Oracle_PreparedStatement {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			conn = ConnectionHelper.getConnection("oracle");
			String sql="select empno , ename from emp where deptno=?"; //where deptno=20
			
			/*
			  	Statement stmt = conn.createStatement(); //연결된 객체에서 명령객체 받기
				String sql="select empno , ename , sal , comm from emp";
				stmt.executeQuery(sql);
			*/
			
			  pstmt = conn.prepareStatement(sql); //컴파일된 SQL 정보를 가지고 있는 객체 주소 리턴 
			  
			  Scanner sc = new Scanner(System.in);
			  int deptno = Integer.parseInt(sc.nextLine());
			  
			  // where empno = ? and deptno = ? and sal = ?
			  // pstmt.setInt(1,7788);
			  // pstmt.setInt(2,10);
			  // pstmt.setInt(3,5000);
			  
			  //parameter
			  //where deptno=?
			  pstmt.setInt(1,deptno);
			  
			  rs = pstmt.executeQuery(); 
			  //네트워크 타고 ... parameter  가지고 ..oracle 서버
			  //select empno , ename from emp where deptno=10
			  
			  //공식같은 로직
			  //1건 or  1건 이상 or 없는 경우
			  if(rs.next()) { //true  1건 or  1건 이상
				  do {
					  System.out.println(rs.getInt(1) + "/" + rs.getString("ename"));
				  }while(rs.next());
			  }else {
				  System.out.println("조회된 데이터 없습니다");
			  }
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			ConnectionHelper.close(rs);
			ConnectionHelper.close(pstmt);
			ConnectionHelper.close(conn);
		}
	}

}



