package com.gem.day3;

public class T2 {

	public static void main(String[] args) {
		//Java的数组既可以存储基本类型的数据
		int a=(int)3.9f;//强制转换 ,显示转换
		System.out.println(a);
		
		//A 3   B 4 
		//===========================================	
		byte b=(byte)-129;//强制转换 ,显示转换

		long c=a;//隐式转换
		long d=c;//隐式转换
		
		String val="12";
		int val2=Integer.parseInt(val);  //引用类型转换成 基本类型--》用类来转换；
		//===========================================
		//声明数组,数组的初始化
		double[]  arr={1.11,2.124,3.32333333};
		int i=0;
		while(i<arr.length){
			System.out.println(arr[i]);
			i++;
		}
		
		i=0;
		do {
			System.out.println(arr[i]);
			i++;
		} while (i<arr.length);
		
		//JDK1.5 提供了foreach循环
		for (double item : arr) {
			System.out.println(item);
		}
		//也可以存储引用类型的数据

	}

}
