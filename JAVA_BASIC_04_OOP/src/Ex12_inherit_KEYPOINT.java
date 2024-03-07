/*
시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라 전자제품 매장이 오픈되면

[클라이언트 요구사항]
가전제품은 제품의 가격 , 제품의 포인트 정보를 모든 제품이 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름정보를 가지고 있다
ex)
각각의 전자제품은 이름을 가지고 있다 (ex) Tv , Audio , Computer
각각의 전자제품은 다른 가격정보를 가지고 있다( Tv:5000 , Audio : 6000)
제품의 포인트는 가격의 10%적용한다

시뮬레이션 시나리오
구매자: 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다
ex) 10만원 , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게 되면 가지고 있는 돈은 감소하고 (가격) 포인트는 증가한다
구매자는 처음 초기 금액을 가질 수 있다
*/

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
	int money = 5000;
	int bonusePoint;
	
	// 고객은 KtTv 구매기능
	// 고객은 Audio 구매기능
	// 고객은 NoteBook 구매기능
	
	void buyProduct(Product product) {
		System.out.println(product.toString() + "구매를 시작합니다.");
		System.out.println("가격은 " + product.price + "원이며 보너스 포인트는 " + product.bonusPoint + "입니다.");
		System.out.println("고객님의 잔액은 " + money + "이며 보너스 포인트는 " + bonusePoint + "입니다.");
		if(money < product.price) {
			System.out.println("돈이 부족해요.");
			return;
		}
		money -= product.price;
		bonusePoint += product.bonusPoint;
		System.out.println("구매가 완료되었습니다.");
		System.out.println("고객님의 잔액은 " + money + "이며 보너스 포인트는 " + bonusePoint + "입니다.\n");
	}
}

public class Ex12_inherit_KEYPOINT {
	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		
		buyer.buyProduct(new KtTv());
		buyer.buyProduct(new Audio());
		buyer.buyProduct(new NoteBook());
	}
}
