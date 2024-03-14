import java.util.ArrayList;
import java.util.List;

import kr.or.kosa.Emp;


public class Ex03_ArrayList_Object {
	public static void main(String[] args) {
		//1. 사원 1명을 만드세요
		Emp emp = new Emp(1000,"김유신","장군");
		System.out.println(emp.toString());

		//2. 사원 2명을 만드세요 (Array)
		Emp[] emplist = {new Emp(100,"김씨","영업"), new Emp(200,"박씨","IT")};
		for(Emp e : emplist) {
			System.out.println(e.toString());
		}
		// ?? 사원한명을 추가하세요 (정적배열 (Array) 만들고 복사 이동) ...Emp[] emplist = {}
		
		
		//3. 사원 2명을 만드세요 (ArrayList)
		List elist = new ArrayList();
		elist.add(new Emp(101,"김씨","영업"));
		elist.add(new Emp(102,"박씨","IT"));
		// ?? 사원한명을 추가하세요 (편하게)
		elist.add(new Emp(103,"이씨","IT"));
		
		//사원 3명을 일반 for문으로 출력하세요
		for(int i = 0 ; i < elist.size() ; i++) {
			System.out.println(elist.get(i).toString());
		}
		
		//toString() 사용하지 말고 3명의 사원을 출력하는데
		//단 getter 함수 사용 
		for(int i = 0 ; i < elist.size() ; i++) {
		    	Object obj =elist.get(i);
		    	//System.out.println(obj.toString());
		    	//getter > getEmpno() , getEname()
		    	//부모타입이 자식타입 전달할때 .. 자식타입 강제적()casting
		    	Emp e = (Emp)obj;
		    	
		    	System.out.println(e.getEmpno() + "/" + e.getEname() + "/" + e.getJob());
		}
		//현업에서 위와 같은 코드 사용 ..... (x)
		//Object ...대신에 타입강제하자 (원하는 타입 강제)
		//Generic > 타입강제 > 데이터의 관리는 하나의 타입 > 필요한 타입을 명시 
		
		ArrayList<Emp> emplst = new ArrayList<Emp>();
		emplst.add(new Emp(1,"A","IT"));
		for(Emp e : emplst) {
			System.out.println(e.getEmpno() +":" + e.getEname()+":" + e.getJob());
		}
		
	}

}