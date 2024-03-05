
public class Book {
	
	private String name;
	private int price;
	
	public Book(String nameParam, int priceParam) {
		name = nameParam;
		price = priceParam;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	
	public static void main(String[] args) {
		Book book = new Book("이것이 자바다", 30000);
		System.out.printf("책 이름 : %s\t 책 가격 : %d\n", book.getName(), book.getPrice());
	}
}
