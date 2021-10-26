package com.gem.t1;
import java.util.Date;
import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		System.out.println(new Date());
		System.out.println("请输入一行字符串：");
		Scanner scan=new Scanner(System.in); //接受用户的输入
		String str=scan.nextLine();
		System.out.println("您输入的是："+str);
		System.out.println("您是最棒的");
	}

}
