package chapter11_CollectionsFramework;

import java.util.*;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		Person p = (Person)obj;
		
		return this.name.equals(p.name) && this.age==p.age; 
	}
	
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	public String toString() {
		return name+" : "+age;
	}
}

public class HashSetTest03 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(new Person("zzunho", 19));
		hs.add(new Person("zzunho", 19));
		
		System.out.println(hs);
	}
}
