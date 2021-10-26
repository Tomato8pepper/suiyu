package com.gem.day2;

public class T21Prime {

	public static void main(String[] args) {
		// 输出100以内的素数；只能1或本身整除的数且2
		// 质数又称素数。一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数；
		int number = 100;

		int i = 0, j = 0;
		//遍历2到100
		for (i = 2; i <= number; i++) {
			//某个数能被 从 2到本身整除，一旦能整除就不是质数；就退出循环下一个
			for (j = 2; j <= i; j++) {
				if (i % j == 0)
					break;
			}
			//从 2到本身 都没有被整除，只能被本身整除，就是质数，就输出
			//想要得到j=i,只能是2到 i没有被break
			if (j == i) {
				System.out.print(i + " ");
			}

		}

	}

}
