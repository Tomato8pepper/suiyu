package com.gem.day4;

public class T3 {

	public static void main(String[] args) {
		
		//==========1======================
		Circle cir=new Circle(10);
		double area=cir.getArea();
		double l=cir.getLength();
		System.out.println("��İ뾶�ǣ�"+cir.getR());
		System.out.println("����ǣ�" + area);
		System.out.println("�ܳ��ǣ�" + l);

		//==========2======================
		Circle cir2=new Circle();
		cir2.setR(10);
		double area2=cir.getArea();
		double l2=cir.getLength();

		System.out.println("��İ뾶�ǣ�"+cir.getR());
		System.out.println("����ǣ�" + area2);
		System.out.println("�ܳ��ǣ�" + l2);
		
		//==>����
		Circle cir3=new Circle(15);
		cir3.showInfo();
		cir3.showInfo(3);
	}

}
