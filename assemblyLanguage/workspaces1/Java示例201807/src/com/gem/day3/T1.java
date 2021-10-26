package com.gem.day3;

public class T1 {

	public static void main(String[] args) {
		//Java的数组既可以存储基本类型的数据
		
		//声明数组
		int[]  arr;
		//数组的初始化
		arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[4]=30;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
			
		//也可以存储引用类型的数据

	}

}
