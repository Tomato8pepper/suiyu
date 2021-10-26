package com.gem.day4;

public class T5Recursive {

	// 5!
	public static void main(String[] args) {
		int i = 20;// 5!=5*4!
		FacTest f = new FacTest();
		int result = f.fac(i);
		System.out.println(result);
	}
}

//
class FacTest {
	public int fac(int n) {
		if (n == 1)
			return 1;
		else
			return n * fac(n - 1);
	}
}
