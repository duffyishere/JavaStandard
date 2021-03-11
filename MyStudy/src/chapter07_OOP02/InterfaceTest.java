package chapter07_OOP02;

interface I{
	void methodI();  //public abstract 생략
}

class A{
	public void methodA(I i) {
		i.methodI();
	}
}

class B implements I{
	public void methodI() {
		System.out.println("TestB");
	}
}

class C implements I{
	public void methodI() {
		System.out.println("TestC");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		
		a.methodA(new C());
	}
}
