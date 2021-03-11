package chapter11_CollectionsFramework;

import java.util.Arrays;

public class ArraysTest02 {
	public static void main(String[] args) {
		int[] arrs = {1,2,3,4,5};
		
		for(int i:arrs) {
			char[] arr = new char[i];
			Arrays.fill(arr, '*');
			System.out.println(new String(arr)+i);
		}
	}
}
