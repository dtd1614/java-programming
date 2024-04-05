package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import dto.EmpDto;
import utils.ConnectionHelper;

/*
전체조회 
조건조회 where empno=?
삽입 insert into emp( ....) values(?,?,?,?,?,?,?,?)
삭제 delete from emp where empno=?
수정 update emp set ename=? , job=? , sal=? , hiredate=? where empno=?
Like 검색  >> 이름 검색
*/
public class EmpDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public EmpDao() {
		this.conn = null;
		this.pstmt = null;
		this.rs = null;
	}
	
	public int updateEmp(EmpDto empDto){
		int row = 0;
		try {
			conn = ConnectionHelper.getConnection("oracle");
			String sql = "update emp set ename=? , job=? , sal=? , hiredate=? where empno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, empDto.getEname());
			pstmt.setString(2, empDto.getJob());
			pstmt.setInt(3, empDto.getSal());
			pstmt.setDate(4, empDto.getHiredate());
			pstmt.setInt(5, empDto.getEmpno());
			
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			ConnectionHelper.close(rs);
			ConnectionHelper.close(pstmt);
			ConnectionHelper.close(conn);
		}
		return row;
	}

}
