package com.gem.day4;
/**��װ
 * ����Բ��������ܳ�
 * @author ybgong *
 */
public class Circle {
	public  static int TEST_AGE=500;//ȫ�ֱ���XXX
	//1������
	public final double PI=3.14;//����
	private double r;    //����  ʵ������***  ����Ա����  
	
	//4 set/get����
	//Ϊ˽�г�Ա������ֵ��2��
	public void setR(double r){
		this.r=r;
	}
	//���ذ뾶ֵ
	public double getR(){
		return this.r;
	}
	
	//2 ���췽����������==>����1
	public Circle(){
	}
	
	//Ϊ˽�г�Ա������ֵ��1��
	public Circle(double r){
		//�����������øù�����ִ�г�ʼ���Ķ���
		this.r=r;
	}
	
	//һ��   3����
	/**
	 * ��Բ�����,
	 */
	public double getArea(){
		return PI*this.r*this.r;
	}
	
	/**
	 * ��Բ���ܳ�
	 */
	public double getLength(){
		return 2*PI*r;
	}

	//==>����2
	public  void  showInfo(){
		System.out.println("�ҵİ뾶�ǣ�"+this.r);
	}
	public  void  showInfo(int age){
		System.out.println("�Ҽ����ˣ�"+age);
	}
	
	//=================��ͨ�Ĳ���=====================
	//��̬����
	public static void  showInfo(String size){  //��������
	
		int i=10;	// �ֲ�����
		System.out.println("����һ�� " +size+" Բ");
	}
	

	public static String  showInfo2(double number ){
		return  "���� " + number+" Բ!";
	}
	
}
