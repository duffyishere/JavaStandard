package mySelfStudy;

public class Test {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for (int j = 0; j < lotto.length; j++) {
			System.out.printf("로또%d번째\t", j + 1);
		
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int) (Math.random() * 45) + 1;

				for (int k=0; k<i; k++) {
					if (lotto[i] == lotto[k])
					i--;
				}
			}
			for (int i = 0; i < lotto.length; i++)
				if (i == 5)
					System.out.println(lotto[i]);
				else
					System.out.printf(lotto[i] + ",");
		}

	}
}
