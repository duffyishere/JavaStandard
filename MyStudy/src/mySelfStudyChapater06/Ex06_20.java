package mySelfStudyChapater06;

import java.util.*;

public class Ex06_20 {
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(shuffle(original)));
	}
	
	static int[] shuffle(int[] deck) {
		for(int i=0; i<10; i++) {
			deck[i] = (int) ((Math.random()*10)+1);
			for(int j=0; j<i; j++) {
				if(deck[i] == deck[j])
					i--;
			}
		}
		return deck;
	}
}
