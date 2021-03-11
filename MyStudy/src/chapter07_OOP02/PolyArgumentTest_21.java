package chapter07_OOP02;

public class PolyArgumentTest_21 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv2());
		b.buy(new Computer());		
		b.summary();
	}
}

class Product{
	int value;
	int point;
	
	Product() {}
	
	Product(int value){
		this.value = value;
		point = (int)value/10; 
	}
}

class Tv2 extends Product{
	Tv2(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Buyer{	
	int money = 1000;
	int point = 0;
	int i =0;

	Product[] cart = new Product[10];
	
	void buy(Product p) {
		if(money >= p.value) {			
			System.out.println(p + "를 구입하셨습니다.");
			this.money -= p.value;
			this.point += p.point;
			cart[i++] = p; 
		}
		else {
			System.out.println("금액이 부족합니다.");
		}
	}

	void summary() {
		int sum = 0;
		String cartList = "";
		
		for(int j=0; cart[j] != null; j++) {
				sum += cart[j].value;
				cartList += cart[j] +" "; 
			}
		
		System.out.println("총금액 : " + sum + "만원");
		System.out.println("구입하신 제품은: " +  cartList + "입니다."); 
	}
	
}