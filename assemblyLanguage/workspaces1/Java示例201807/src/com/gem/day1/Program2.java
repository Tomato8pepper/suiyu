package com.gem.day1; //包

import java.util.Date;  //使用其他的包
import java.util.Scanner;


public class Program2 {
	//输出当前时间
	public static void main(String[] args){
		
		// 包1 :java.util
		System.out.println(new Date());   //Wed Jul 04 14:28:21 CST 2018
		//2018年7月14日？？？
		
		// 包2 :java.util
		//一般的类使用时都要进行实例化  new 类()
		System.out.println("请输入：");
		Scanner scan=new Scanner(System.in);  //接收用户的输入
		String str=scan.nextLine();  //得到用户的输入
		//syso  alt+/
		System.out.println("您输入的是："+str);
		
	}
}
