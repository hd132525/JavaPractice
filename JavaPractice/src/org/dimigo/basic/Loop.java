package org.dimigo.basic;

public class Loop {
	public static void main(String args[]) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i=1; i<=10; i++) {
			for(int j : arr) {
				if(j == i) System.out.printf("*");
				else System.out.printf("%d", j);
			}
			System.out.println();
		}
	}
}
