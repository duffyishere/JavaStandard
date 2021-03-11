package chapter06_OOP01;

class Product{
	static int count;
	int serialNo;
	
	{
		++count;
		serialNo = count;
	}
	public Product() {
		
	}
}

public class ProductTest_29{
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println(p1.serialNo);
		System.out.println(p2.serialNo);
		System.out.println(p3.serialNo);
		
		System.out.println(Product.count);
		
		
	}
}


