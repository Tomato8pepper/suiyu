package com.gem.day2;

public class T22Prime {

	public static void main(String[] args) {
		// ���100���ڵ�������ֻ��1��������������2
		// �����ֳ�������һ������1����Ȼ��������1���������⣬���ܱ�������Ȼ��������������������
		int number = 100;
		for (int i = 2; i <= number; i++) {
			if (isPrime2(i)) {
				System.out.println(i + "������");
			}
		}
	}
	public static boolean isPrime(int num) {
		// �ж�1-100�е�ÿ�����ǲ�������
		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}
	// false��������/true������
	public static boolean isPrime2(int num) {
		// �ж�1-100�е�ÿ�����ǲ�������
		for (int j = 2; j <= Math.sqrt(num); j++) {
			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}

}
