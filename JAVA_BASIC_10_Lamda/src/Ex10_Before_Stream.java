import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

enum Gender{
	Male, FeMale
}
enum SearchOption{
	Location,Gender
}

class Customer{
	private String id;
	private String location;
	private Gender gender;  //enum 열거 타입 
	private int age;
	
	
	public Customer(String id, String location, Gender gender, int age) {
		super();
		this.id = id;
		this.location = location;
		this.gender = gender;
		this.age = age;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", location=" + location + ", gender=" + gender + ", age=" + age + "]";
	}

}

class CustomerService{
	//private List<Customer> customers;
	
	//public why : 데이터 집합
	public List<Customer> customers;
	
	public CustomerService() {
		this.customers = new ArrayList<>();
	}
	
	public void addCustomer(Customer newCustomer) {
		this.customers.add(newCustomer);
	}
	
	//요구사항 
	//location 지역으로 검색된 고객목록 추출
	//parameter  location
	//명령형 (imperative) 
	public List<Customer> searchCustomerByLoation(String location){
		
		List<Customer> findCustomers = new ArrayList<>();
		for(Customer customer : customers) {
			if(customer.getLocation().equals(location)) {
				findCustomers.add(customer);
			}
		}
		return findCustomers;
	}
	
	//요구사항 
	//성별로 검색하기
	public List<Customer> searchCustomerByGender(Gender gender){
		
		List<Customer> findCustomers = new ArrayList<>();
		for(Customer customer : customers) {
			if(customer.getGender().equals(gender)) {
				findCustomers.add(customer);
			}
		}
		return findCustomers;
	}
	
	//요구사항
	//지역검색 , 성별로 검색   함수를 통합
	
	public List<Customer> searchCustomerBy(SearchOption searchoption , String searchvalue){
		
		List<Customer> findcustomers = new ArrayList<>();
		for(Customer customer : customers) {
			
			if(searchoption.equals(searchoption.Location)) {
				//지역검색
				if(customer.getLocation().equals(searchvalue)) {
					findcustomers.add(customer);
				}
				
			}else if( searchoption.equals(searchoption.Gender)){
				//성별검색
				if(customer.getGender().name().equals(searchvalue)) { //getGender().name() 주의
					findcustomers.add(customer);
				}
			}
			
			
		}
		
		return findcustomers;
	}
	
	//인터페이스를 기반으로 검색 함수 추가 
	public List<Customer> searchCustomer(SearchFilter filter){
		//내가원하는 검색과 일치하면 고객데이터를 넣어 주겠다
		List<Customer> foundCustomers = new ArrayList<Customer>();
		
		for(Customer customer : customers) {
			if(filter.isMatched(customer)) { //일치하면 true (원하는 조건 맞으면)
				foundCustomers.add(customer); 
			}
		}
		
		
		return foundCustomers;
	}
	
}

@FunctionalInterface
interface SearchFilter{
	boolean isMatched(Customer customer); //추상함수 
} 


public class Ex10_Before_Stream {
	
	 static void initData(CustomerService service) {
			service.addCustomer(new Customer("customer01", "Seoul",   Gender.Male, 30));
			service.addCustomer(new Customer("customer02", "Busan",   Gender.FeMale, 55));
			service.addCustomer(new Customer("customer03", "Seoul",   Gender.FeMale, 13));
			service.addCustomer(new Customer("customer04", "Gwangju", Gender.Male, 27));
			service.addCustomer(new Customer("customer05", "Gwangju", Gender.FeMale, 60));
			service.addCustomer(new Customer("customer06", "Incheon", Gender.Male, 29));
			service.addCustomer(new Customer("customer07", "Seoul",   Gender.Male, 42));
			service.addCustomer(new Customer("customer08", "Seoul",   Gender.FeMale, 45));
			service.addCustomer(new Customer("customer09", "Seoul",   Gender.FeMale, 33));
			service.addCustomer(new Customer("customer10", "Seoul",   Gender.Male, 20));
		}
	public static void main(String[] args) {
		CustomerService service = new CustomerService();
		initData(service); //10명의 고객 List 
		/*
		//지역검색
		List<Customer> result = service.searchCustomerByLoation("Seoul");
				for(Customer customer : result) {
					System.out.println(customer.toString());
				}

		System.out.println("*****************************************");
				
		//성별로 검색
		List<Customer> result2 = service.searchCustomerByGender(Gender.FeMale);
				
				for(Customer customer : result2) {
					System.out.println(customer);
				}
		
		System.out.println("*****************************************");	
		
		List<Customer> result3 = service.searchCustomerBy(SearchOption.Gender, "Male");
				for(Customer customer : result3) {
					System.out.println(customer);
				}
				
		System.out.println("************@FunctionalInterface***************");
		*/
		/*
		Thread th = new Thread(new Runnable() {  //익명객체
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		th.start();
		*/
		
		//위와 같은 익명 객체 만들어서 논리제공
		List<Customer> result4 = service.searchCustomer(new SearchFilter() {
			@Override
			public boolean isMatched(Customer customer) {
				if(customer.getLocation().equals("Seoul")) {
					return true;
				}else {
					return false;
				}
				
			}
		});
		
		for(Customer customer : result4) {
			System.out.println(customer);
		}
	
		//여성고객만 검색  (람다식)
		System.out.println("[여성 고객]  람다식"); 
		                                //isMatched  >> 논리 
		result4 = service.searchCustomer(customer -> customer.getGender().equals(Gender.Male));
		for(Customer customer : result4) {
				System.out.println(customer);
		}
		
		System.out.println("[여성 고객]  Stream");
		//
		//public why : 데이터 집합
		//public List<Customer> customers;
		 List<Customer> filteredCustomers2 = service.customers.stream()
                .filter(customer -> customer.getGender() == Gender.Male)
                .collect(Collectors.toList());
		 filteredCustomers2.forEach(System.out::println);
		 
		 ///////////////////////////////////////////////////////////////////////////
		 //람다식 
		 //service.searchCustomer  지역 "Seoul" && 나이 40 초과인 사람을 
		 System.out.println("조건 검색 람다식");
		 List<Customer> result5 = new ArrayList<Customer>();
		 result5 =  service.searchCustomer(customer -> customer.getLocation().equals("Seoul") && customer.getAge() > 40);
		 //필터링 된 결과
		 for(Customer customer : result5) {
			 System.out.println(customer);
		 }
		 
		 //Stream 구현
		 System.out.println("조건 검색 Stream");
		 service.customers.stream().filter(customer -> customer.getLocation().equals("Seoul") && customer.getAge() > 40)
		                           .collect(Collectors.toList())
		                           .forEach(System.out::println);
	}

}










