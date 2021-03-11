package mySelfStudy;

import java.util.ArrayList;

class Product{
	int price;
	
	Product(){}
	
	Product(int price){
		this.price = price;
	}
}

class AppleWatch extends Product{	
	AppleWatch(){
		super(369000);
	}
	
	public String toString() {
		return "Apple Watch";
	}
}

class Buyer{
	int money;
	
	Buyer(){
		money = 10000000;
	}
	
	Buyer(int money){
		this.money = money;
	}
	
	public void buyProduct(Product p) {
		try{
			if(p.getClass().isInstance(new Product())) {
				throw new Exception("옳바른 제품을 입력해주세요.");
			}
			else {
				if(money >= p.price) {
					money -= p.price;
					System.out.println("Buy an "+p+".");
					System.out.println("Left money : "+money);
				}
				
				else {
					System.out.println("Not enough money");
				}
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

public class WishList {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
//		b.buyProduct(new Product());
		
		b.buyProduct(new AppleWatch());		
	}
}
