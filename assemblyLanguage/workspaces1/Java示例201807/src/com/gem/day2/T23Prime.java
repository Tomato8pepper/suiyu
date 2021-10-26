package com.gem.day2;

public class T23Prime {

	public static void main(String[] args) {
		int i, j, number = 100;
		for (i = 2; i <= number; i++) {
			for (j = 2; j <= (int) Math.sqrt(i); j++) {
				if (i % j == 0)
					break;
			}
			if (i == 2 || i % j != 0)
				System.out.println(i);
		}

	}

}
