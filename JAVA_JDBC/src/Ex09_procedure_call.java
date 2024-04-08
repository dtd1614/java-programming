import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import kr.or.kosa.utils.ConnectionHelper;
import oracle.jdbc.internal.OracleTypes;

public class Ex09_procedure_call {
	public static void main(String[] args) {
		Connection conn = null;
		CallableStatement cstmt = null;//procedure 전용 객체
		ResultSet rs = null;
		
		try {
			conn = ConnectionHelper.getConnection("oracle");
			String sql = "{call usp_EmpListByDeptno(?,?)}";
			cstmt = conn.prepareCall(sql);
			
			//usp_EmpListByDeptno(?,?) ? input, ? output
			cstmt.setInt(1, 10);
			cstmt.registerOutParameter(2, OracleTypes.CURSOR);
			
			boolean result = cstmt.execute(); //실행
			
			rs = (ResultSet)cstmt.getObject(2); // cursor 객체 >> resultset 접근
			while(rs.next()) {
				System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3) + ", " + rs.getInt(4));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			ConnectionHelper.close(rs);
			ConnectionHelper.close(cstmt);
			ConnectionHelper.close(conn);

		}
	}
	

}
