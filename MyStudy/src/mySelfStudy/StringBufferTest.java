package mySelfStudy;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		String str1 = String.valueOf(sb1);
		String str2 = String.valueOf(sb2);
		
		System.out.println(sb1.equals(sb2));	//StringBuffer's equals() method was not Overriding.
		
		System.out.println(str1.equals(str2));

	}
	
}
