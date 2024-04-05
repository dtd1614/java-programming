import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import kr.or.kosa.utils.ConnectionHelper;

/*
transaction 처리
하나의 논리적인 작업 단위 (은행)
단위 모든 작업이 성공 실패 ....

create table trans_A(
    num number,
    name varchar2(20)
);

create table trans_B(
    num number constraint pk_trans_B_num primary key,
    name varchar2(20)
);

JDBC > Default > DML > autocommit > 실반영

JDBC > autocommit 옵션 > false > 반드시 개발자는 > 명시적으로 commit, rollback을 강제해야한다.
*/
public class Ex08_Transaction {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		
		conn = ConnectionHelper.getConnection("oracle");
		
		String sql = "insert into trans_A(num, name) values(100, 'A')";
		String sql2 = "insert into trans_B(num, name) values(100, 'B')";
		
		try {
			//업무상(둘 다 성공 아니면 둘 다 실패)
			//옵션
			conn.setAutoCommit(false); //개발자 commit, rollback 강제'
			pstmt = conn.prepareStatement(sql);
			pstmt2 = conn.prepareStatement(sql2);
			//begin tran
			pstmt.executeUpdate(); //insert
			pstmt2.executeUpdate();
			//end tran
			//예외가 발생하지 않으면
			conn.commit(); //둘 다 실 반영 ....
		} catch (Exception e) {
			//예외가 발생하면 (둘 중에 하나라도 문제가 생기면)
			try {
				System.out.println("문제발생 : " + e.getMessage());
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			ConnectionHelper.close(pstmt2);
			ConnectionHelper.close(pstmt);
			ConnectionHelper.close(conn);
		}
	}

}
