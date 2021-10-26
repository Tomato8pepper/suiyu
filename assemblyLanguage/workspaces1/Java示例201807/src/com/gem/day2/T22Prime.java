package com.gem.day2;

public class T22Prime {

	public static void main(String[] args) {
		// 输出100以内的素数；只能1或本身整除的数且2
		// 质数又称素数。一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数；
		int number = 100;
		for (int i = 2; i <= number; i++) {
			if (isPrime2(i)) {
				System.out.println(i + "是质数");
			}
		}
	}
	public static boolean isPrime(int num) {
		// 判断1-100中的每个数是不是质数
		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}
	// false不是质数/true是质数
	public static boolean isPrime2(int num) {
		// 判断1-100中的每个数是不是质数
		for (int j = 2; j <= Math.sqrt(num); j++) {
			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}

}
