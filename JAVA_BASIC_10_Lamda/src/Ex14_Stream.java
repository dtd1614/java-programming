import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Employee2 {
    private String name;
    public Employee2(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee = (Employee2) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
public class Ex14_Stream {

	public static void main(String[] args) {
		/*
		 [ 중복 제거 - Distinct ]
		Stream의 요소들에 중복된 데이터가 존재하는 경우, 
		중복을 제거하기 위해 distinct를 사용할 수 있다. 
		distinct는 중복된 데이터를 검사하기 위해 Object의 equals() 메소드를 사용한다. 
		예를 들어 중복된 Stream의 요소들을 제거하기 위해서는 아래와 같이 distinct()를 사용할 수 있다. 
		*/
		List<String> list = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift", "Java");

		list.stream().distinct().forEach(System.out::println);
		// [Java, Scala, Groovy, Python, Go, Swift]
		/*
		 	만약 우리가 생성한 클래스를 Stream으로 사용한다고 하면 equals와 hashCode를 오버라이드 해야만 
			distinct()를 제대로 적용할 수 있다.
			equals와 hashCode에 대해서는 여기에서 자세히 다루었다. 
		  
		 */
		
		    Employee e1 = new Employee("kglim");
	        Employee e2 = new Employee("kglim");
	        List<Employee> employees = new ArrayList<>();
	        employees.add(e1);
	        employees.add(e2);

	        int size = employees.stream().distinct().collect(Collectors.toList()).size();
	        System.out.println("size : " +  size);  
	        /*
	         위의 Employee 클래스는 equals와 hashCode를 오버라이드하지 않았기 때문에, 
			 아래의 코드를 실행해도 중복된 데이터가 제거되지 않고, size 값으로 2를 출력하게 된다. 
	         */
	        
	        Employee2 e3 = new Employee2("kglim");
	        Employee2 e4 = new Employee2("kglim");
	        List<Employee2> employees2 = new ArrayList<>();
	        employees2.add(e3);
	        employees2.add(e4);
	        int size2 = employees2.stream().distinct().collect(Collectors.toList()).size();
	        System.out.println("size2 : " +  size2);  
	        
	}

}
