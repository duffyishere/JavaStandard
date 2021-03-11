package chapter12_01_GenericsEnumAnnotation;

@FunctionalInterface
interface FuncInterface{
	abstract public void funcInterface();
//	abstract public void funcInterface2();
}

class Parents{
	
	public void parentsMethod() {
		System.out.println("Parents");
	}
}

class Child extends Parents{
	@Override
	@Deprecated
	public void parentsMethod() {
		System.out.println("Child");
	}
}
public class AnnotationTest01 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		new Child().parentsMethod();
	}
}
