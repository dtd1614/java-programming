import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import kr.or.kosa.Emp;
import kr.or.kosa.Emp2;

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

public class Ex07_Generic_Product {
	public static void main(String[] args) {
		//1. Array 사용해서 객체 생성
		// KtTv, Audio, NoteBook을 담을 수 있는 Cart를 만드세요
		Product[] productArr = {new KtTv(), new Audio(), new NoteBook()};
		List<Product> productList = new ArrayList<>(List.of(new KtTv(), new Audio(), new NoteBook()));
		
		for(Product product : productList) System.out.println(product);
		
		List<Emp2> emps = new ArrayList<>();
		emps.add(new Emp2(1, "김씨", 1000));
		emps.add(new Emp2(2, "이씨", 2000));
		emps.add(new Emp2(3, "박씨", 3000));
		
		for(int i = 0; i < emps.size(); i++) {
			if(emps.get(i).getEmpno() == 2) emps.get(i).setSal(6000);
		}
		
		for(Emp2 emp : emps) {
			if(emp.getEmpno() == 3) emp.setEname("궁금해씨");;
		}
		
		System.out.println(emps);
	}
}
