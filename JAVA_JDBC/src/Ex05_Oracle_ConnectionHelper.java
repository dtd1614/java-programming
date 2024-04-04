import java.sql.Connection;

import kr.or.kosa.utils.ConnectionHelper;

public class Ex05_Oracle_ConnectionHelper {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = ConnectionHelper.getConnection("oracle");
			System.out.println(conn.toString());
			System.out.println(conn.getMetaData().getDatabaseProductName());
			System.out.println(conn.getMetaData().getDatabaseProductVersion());
			System.out.println(conn.isClosed());
			ConnectionHelper.close(conn);
			System.out.println(conn.isClosed());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
