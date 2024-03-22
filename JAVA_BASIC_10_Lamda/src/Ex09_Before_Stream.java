import java.util.ArrayList;
import java.util.List;
/*
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
	private List<Customer> customers;
	
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
}
public class Ex09_Before_Stream {
	
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

	}

}

*/


