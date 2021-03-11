package chapter11_CollectionsFramework;

import java.util.*;

public class HashMapTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap hm = new HashMap();
		
		hm.put("testID", "testPWD");
		
		while(true) {
			System.out.print("Input ID :");
			String id = sc.nextLine().trim();
			
			System.out.print("Input Password :");
			String pwd = sc.nextLine().trim();
			
			
			if(!hm.containsKey(id)) {
				System.out.println("Not correct ID");
			}
			else if(!hm.get(id).equals(pwd)) {
				System.out.println("Not correct Password");
			}
			else if(hm.get(id).equals(pwd)) {
				System.out.println("Login!!");
				break;
			}
			
		}
	}
}
