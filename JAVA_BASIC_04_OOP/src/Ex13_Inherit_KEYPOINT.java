class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		this.bonusPoint = price/10;
	}
}

class KtTv extends Product{
	
	KtTv(){
		super(1000);
	}
	
	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product{
	
	Audio(){
		super(2000);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product{
	
	NoteBook(){
		super(3000);
	}
	
	@Override
	public String toString() {
		return "NoteBook";
	}
}

class Buyer{
	int money;
	int bonusPoint;
	Product[] cart;
	int cartSize;
	
	public Buyer(int money) {
		this.money = 5000;
		this.bonusPoint = 0;
		
		this.cart = new Product[10];
		this.cartSize = 0;
	}
	
	void buyProduct(Product product) {
		System.out.println("\n" + product + "구매를 시작합니다.");
		if(cartSize == cart.length) {
			System.out.println("장바구니가 다 찼어요.");
			return;
		}
		System.out.printf("가격 : %d, 지급 포인트: %d\n", product.price, product.bonusPoint);
		System.out.printf("고객님 잔액 : %d, 고객님 포인트 : %d\n", money, bonusPoint);
		if(money < product.price) {
			System.out.println("돈이 부족해요.");
			return;
		}
		cart[cartSize++] = product;

		money -= product.price;
		bonusPoint += product.bonusPoint;
		System.out.println("구매가 완료되었습니다.");
		System.out.printf("고객님 잔액 : %d, 고객님 포인트 : %d\n", money, bonusPoint);
	}

	void summary() {
		System.out.println("\n장바구니 현황을 조회합니다.");
		if(cart[0] == null) {
			System.out.println("장바구니가 비어있어요.");
			return;
		}
		
		int totalPrice = 0;
		int totalPoint = 0;
		for(int i = 0; i < cartSize; i++) {
			totalPrice += cart[i].price;
			totalPoint += cart[i].bonusPoint;
			System.out.printf("%s(%d원, %d포인트)\n", cart[i], cart[i].price, cart[i].bonusPoint);
		}
		System.out.printf("총 가격 : %d, 총 포인트: %d\n", totalPrice, totalPoint);
	}
}

public class Ex13_Inherit_KEYPOINT {
	public static void main(String[] args) {
		Buyer buyer = new Buyer(5000);
		buyer.summary();
		
		buyer.buyProduct(new KtTv());
		buyer.summary();
		
		buyer.buyProduct(new Audio());
		buyer.summary();

		buyer.buyProduct(new NoteBook());
		buyer.summary();
		
		buyer.buyProduct(new Audio());
		buyer.summary();

		buyer.buyProduct(new KtTv());
		buyer.summary();
	}
}
