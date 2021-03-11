package chapter12_01_GenericsEnumAnnotation;

import java.util.*;

class Students{
	String name;
	int grade;
	int classes;
	int num;
	
	Students(String name,int grade, int classes, int num){
		this.name = name;
		this.grade = grade;
		this.classes = classes;
		this.num = num;
	}
	
	public String toString() {return grade+""+classes+""+num+""+name;}
}
public class GenericsTest05 {
	public static void main(String[] args) {
		ArrayList<Students> arrList = new ArrayList<Students>();
		
		arrList.add(new Students("junho",02,11, 27));
		
		Iterator<Students> it = arrList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().name);
		}
	}
}
