import kr.or.kosa.Emp;

public class Ex05_Object_Array_Quiz {
   public static void main(String[] args) {
      Emp[] emparr = {
            new Emp(1000, "홍길동"), 
            new Emp(2000, "김유신"), 
            new Emp(3000, "유관순")
            };
      
      for(Emp emp : emparr) emp.empInfoPrint();
   }
}
