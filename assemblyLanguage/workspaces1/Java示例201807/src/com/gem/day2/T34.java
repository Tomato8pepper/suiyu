package com.gem.day2;

import java.util.Scanner;

public class T34 {

	public static void main(String[] args) {
		int i, j, k;
		System.out.println("ÇëÊäÈënµÄÖµ£º");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (i = 1; i <= n; i++) {
			for (k = 1; k <= n - i; k++)
				System.out.print(" ");
			for (j = 1; j <= 2 * i - 1; j++) {
				if (j == 1 || j == 2 * i - 1 || i == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		for (i = 1; i <= n; i++)
			for (j = 1; j <= n; j++) {
				if (j == n)
					System.out.println("*");
				else
					System.out.print(" ");
			}
	}

}
