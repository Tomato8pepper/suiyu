package com.gem.day2;

public class T1 {

	public static void main(String[] args) {
		//必须先声明类型，再使用。
		int abc=10;//abc identifier
		
		//二进制
		//byte short int long
		//在内存中各占:1,2,4,8个字节;

		byte i=-128; //-128-127  		2^8=256
		short j=-128; //-32768-32767  	2^16=65536
				
		int sum=1+2;	//2^32			9
		//long  2^64			1.8446744073709552E19
		System.out.println(sum);
		
		System.out.println(Math.pow(2, 3));

		System.out.println(012);//八进制(以0开头)
		System.out.println(0XA);//十六进制(以0X开头),
		System.out.println(0B1010);//二进制（以0B)

		System.out.println(8-5);
		System.out.println(2.0-1.5==0.5);
		System.out.println(2.0-1.1==0.9);
		System.out.println(1/3.0);
		//float:十进制精确到小数点后面7-8  =》8*8=64二进制64
		//double:十进制精确到小数点后面15-16
		float a1=1.1f;
		double a2=1.1;
		double a3=1/3.0;

		System.out.println(2.0-1.1);  //特例不要纠结0.8999999999999999==>0.90 四舍五入过的
		System.out.println(2.0-1.5);

		System.out.println(2.0f-1.1f); //float
			//精度2
			
			char c='中';
			boolean flag=true;

			byte i3=(byte) -131;
			System.out.println(i3);//125
			byte i4=(byte)131;
			System.out.println(i4);//-125
	}
}
