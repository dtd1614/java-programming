/*
delete from dmlemp where deptno = ?
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04_Oracle_DML {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {

			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KOSA", "1004");

			int deptno = 0;
			
			Scanner sc = new Scanner(System.in);
	
			System.out.println("부서입력");
			deptno = Integer.parseInt(sc.nextLine());
			
			//preparestatement
			//values(?, ?, ?)
			//값을 설정
			
			pstmt = conn.prepareStatement("delete from dmlemp where deptno = ?");
			pstmt.setInt(1, deptno);
			
			//명령문 실행하기
			int resultrow = pstmt.executeUpdate();
			
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
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
