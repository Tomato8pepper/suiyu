package com.gem.day3;

import java.util.Scanner;

public class T6���� {

	public static void main(String[] args) {
		int i, j, k;
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		System.out.println("����������a��9����:");
		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++) {
				Scanner scan = new Scanner(System.in);
				a[i][j] = scan.nextInt();
			}
		System.out.println("����������b��9����:");
		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++) {
				Scanner scan = new Scanner(System.in);
				b[i][j] = scan.nextInt();
			}
		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++) {
				for (k = 0; k < 3; k++)
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
			}
		System.out.println("������˺����Ϊ:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++)
				System.out.print(c[i][j] + "      ");
			System.out.print("\n");
		}

	}

}
