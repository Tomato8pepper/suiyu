package com.gem.day4;

import javax.swing.JOptionPane;

public class T2 {

	public static void main(String[] args) {
		// ==>�����������˼��

		//***д��1��
		// 1,������ OK
		// 2,ʹ���� ���� ������= new ���췽��(ʵ��);
		//3 �� ������.����()
		Circle cir = new Circle(10.0);
		double area = cir.getArea();
		double l = cir.getLength();
		System.out.println("����ǣ�" + area);
		System.out.println("�ܳ��ǣ�" + l);
		
		//***д��2��
		Circle.showInfo("С");
		Circle.showInfo("��");
		
		String result=	Circle.showInfo2(200);
						//JOptionPane.showInputDialog(null)
		System.out.println(result);
	}

}
