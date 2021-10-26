package com.gem.day2;

public class For1 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("*");
		}
		// Ç¶Ì×Ñ­»·

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.print("\r\n");
		}
	/*	i=0   j<1 	0 
		i=1   j<2 	0,1 */
	}
}
