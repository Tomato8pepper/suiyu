package com.gem.day5;

public class T1 {

	public static void main(String[] args) {
		int i=10;
		Integer j=10;
		System.out.println(i==10);
		
		Integer k=new Integer(10);
		
		System.out.println(i==j);
		System.out.println(i==k);
		System.out.println(j==k);//2者引用 类型，比较的地址；
		
		//127
		int a=Byte.MAX_VALUE;
		int b=Byte.MIN_VALUE;
		System.out.println(a);
		System.out.println(b);
		
	}

}
