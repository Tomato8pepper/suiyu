package com.gem.day51;

public class T2 {
	public static void main(String[] args) {
		// ==================================
		Employee emp;
		emp = new Employee("101", "lily");
		System.out.println(emp.work());
		
		emp=new CEO("102", "lucy");
		System.out.println(emp.work());
		
		//��̬
		emp=new IT("103", "Tom","U��");
		System.out.println(emp.work());
		
		//===================================
		Employee emp2;
		CEO ceo=new CEO("202", "lucy202");
		emp2=ceo;   //������Line10 ,�Զ�ת������ת�Ͷ���;  
		System.out.println(emp2.work());
		emp2=(Employee)ceo;  
		System.out.println(emp2.work());
		
		//�Զ�װ����ǰ�һ���������͵ı���ֱ�Ӹ�����Ӧ�İ�װ�����
		int i=15;
		Integer j=i;
		//Employee k=i; //XX
		Object obj=i;
		System.out.println(j);//�Զ�װ��
		System.out.println(obj.toString());
	}
}
