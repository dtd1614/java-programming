import java.util.Scanner;

import dao.EmpDao;
import dto.EmpDto;
import dto.EmpDto.EmpDtoBuilder;

public class Program {

	public static void main(String[] args) {
		EmpDao dao = new EmpDao();
		Scanner sc = new Scanner(System.in);
		
		//---------------------update start----------------------------
		EmpDtoBuilder updateEmpDtoBuiler = EmpDto.builder();
		
		System.out.println("update emp start");
		System.out.print("empno : ");
		updateEmpDtoBuiler.empno(Integer.parseInt(sc.nextLine()));
		System.out.print("ename : ");
		updateEmpDtoBuiler.ename(sc.nextLine());
		System.out.print("job : ");
		updateEmpDtoBuiler.job(sc.nextLine());
		System.out.print("sal : ");
		updateEmpDtoBuiler.sal(Integer.parseInt(sc.nextLine()));
		System.out.print("hiredate(yyyy-mm-dd) : ");
		updateEmpDtoBuiler.hiredate(java.sql.Date.valueOf(sc.nextLine()));

		EmpDto updateEmpDto = updateEmpDtoBuiler.build();
		
		int updateRow = dao.updateEmp(updateEmpDto);
		System.out.println("update row count : " + updateRow);
		//---------------------update end----------------------------
	}

}
