package chapter11_CollectionsFramework;

import java.util.Arrays;

public class ArraysTest01 {
	public static void main(String[] args) {
		int[] arrs = {23,12,5,36,346,2,1,5,325};
		
		System.out.println(Arrays.binarySearch(arrs, 325));
		Arrays.sort(arrs);
		System.out.println(Arrays.binarySearch(arrs, 325));
	}
}
