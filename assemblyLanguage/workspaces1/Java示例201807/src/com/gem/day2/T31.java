package com.gem.day2;

import java.util.Scanner;

public class T31 {

	public static void main(String[] args) {
		System.out.println("请输入:");
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		System.out.println("您输入的是:" + k);
		int i = 0, j = 0;
		for (i = 1; i <= k; i++) {
			for (j = k - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (j = 1; j < 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		scan.close();
	}

}
