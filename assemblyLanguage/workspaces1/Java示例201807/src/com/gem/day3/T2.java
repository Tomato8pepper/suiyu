package com.gem.day3;

public class T2 {

	public static void main(String[] args) {
		//Java������ȿ��Դ洢�������͵�����
		int a=(int)3.9f;//ǿ��ת�� ,��ʾת��
		System.out.println(a);
		
		//A 3   B 4 
		//===========================================	
		byte b=(byte)-129;//ǿ��ת�� ,��ʾת��

		long c=a;//��ʽת��
		long d=c;//��ʽת��
		
		String val="12";
		int val2=Integer.parseInt(val);  //��������ת���� ��������--��������ת����
		//===========================================
		//��������,����ĳ�ʼ��
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
		
		//JDK1.5 �ṩ��foreachѭ��
		for (double item : arr) {
			System.out.println(item);
		}
		//Ҳ���Դ洢�������͵�����

	}

}
