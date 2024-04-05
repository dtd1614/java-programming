
//INSERT
//insert into dmlemp(empno, ename, deptno) values(?, ?, ?)

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.or.kosa.utils.ConnectionHelper;

public class Ex07_Oracle_PreparedStatement_DML {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = ConnectionHelper.getConnection("oracle");
			
			/*
			String sql = "insert into dmlemp(empno, ename, deptno) values(?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			//parameter 세팅
			
			pstmt.setInt(1, 5555);
			pstmt.setString(2, "아무개");
			pstmt.setInt(3, 20);
			*/
			
			String sql = "update dmlemp set ename = ?, sal = ?, job = ?, deptno = ? where empno = ?";
			pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1, "공길동");
			pstmt.setInt(2, 1000);
			pstmt.setString(3, "SALESMAN");
			pstmt.setInt(4, 10);
			pstmt.setInt(5, 5555);
			
			int row = pstmt.executeUpdate();
			
			if(row > 0) {
				System.out.println("update row count : " + row);
			}else {
				System.out.println("update row count : " + row);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			ConnectionHelper.close(pstmt);
			ConnectionHelper.close(conn);
		}
	}

}
