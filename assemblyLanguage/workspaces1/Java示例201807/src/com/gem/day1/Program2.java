package com.gem.day1; //��

import java.util.Date;  //ʹ�������İ�
import java.util.Scanner;


public class Program2 {
	//�����ǰʱ��
	public static void main(String[] args){
		
		// ��1 :java.util
		System.out.println(new Date());   //Wed Jul 04 14:28:21 CST 2018
		//2018��7��14�գ�����
		
		// ��2 :java.util
		//һ�����ʹ��ʱ��Ҫ����ʵ����  new ��()
		System.out.println("�����룺");
		Scanner scan=new Scanner(System.in);  //�����û�������
		String str=scan.nextLine();  //�õ��û�������
		//syso  alt+/
		System.out.println("��������ǣ�"+str);
		
	}
}
