/*
create or replace procedure usp_Update_EmpData
(
    param_empno  IN emp.empno%TYPE,
    param_ename  IN emp.ename%TYPE,
    param_job    IN emp.job%TYPE,
    param_sal    IN emp.sal%TYPE,
    param_outmsg OUT varchar2   
)
is
    begin
        update emp set ename=param_ename , job=param_job , sal=param_sal
        where empno=param_empno;
        commit;
        param_outmsg := 'udpate success';
        EXCEPTION WHEN OTHERS THEN
        param_outmsg := SQLERRM;
        rollback;
    end;

declare 
outmsg varchar2(20);
begin
    usp_Update_EmpData(7369,'수퍼맨','영웅',10,outmsg);
    DBMS_OUTPUT.put_line('결과 : ' || outmsg);
end;

 코드 주의 사항 
 param_outmsg OUT varchar2    >> registerOutParameter(5, Types.VARCHAR)
 String msg = (String)cstmt.getObject(5);
*/

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import kr.or.kosa.utils.ConnectionHelper;
import oracle.jdbc.OracleTypes;

public class Ex10_procedure_dml_call {

	public static void main(String[] args) {
		Connection conn = null;
		CallableStatement cstmt = null; //procedure 전용 객체
	
		try {
			  conn = ConnectionHelper.getConnection("oracle");
			  String sql="{call usp_Update_EmpData(?,?,?,?,?)}";
			  cstmt = conn.prepareCall(sql);
			  
			  
			   /*
			     param_empno  IN emp.empno%TYPE,
    			 param_ename  IN emp.ename%TYPE,
    			 param_job    IN emp.job%TYPE,
    			 param_sal    IN emp.sal%TYPE,
    			 param_outmsg OUT varchar2    
			   */
			  
			  cstmt.setInt(1, 7369);
			  cstmt.setString(2,"누구야");
			  cstmt.setString(3,"IT");
			  cstmt.setInt(4, 5555);
			  cstmt.registerOutParameter(5, OracleTypes.VARCHAR); //약속 OUT SYS_REFCURSOR
			  
			  boolean result = cstmt.execute(); //실행 
			  System.out.println("result : " + result);
			  
			  String msg = (String)cstmt.getObject(5); // cursor 객체 >> resultset 접근
			  System.out.println("orace procedure 실행 결과 : " + msg);
			  
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			ConnectionHelper.close(cstmt);
			ConnectionHelper.close(conn);
		}

	}

}
