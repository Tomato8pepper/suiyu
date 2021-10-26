package com.gem.day2;
public class T32 {

	public static void main(String[] args) {
		int m = 10;
		for (int i = 1; i <= m; i++) {
			int j;
			for (j = m - i; j > 0; j--) {           //              
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.println("*");
			} else if (i != 1) {
				for (int n = 1; n <= 2 * i - 1; n++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

}
