package com.gem.day4;

public class T4Array {

	public static void main(String[] args) {
		Employee emp=new Employee();
		String[] arr=emp.getEmployees();
		for (String s : arr) {
			System.out.println(s);
		}
		
		String name1="��3",name2="��4";
		String[] arr2=emp.getEmployees(name1,name2);
		for (String s : arr2) {
			System.out.println(s);
		}

		//String[] arr3=emp.getEmployees("Lily","Lucy");
		String[] arr3=emp.getEmployees("Lily","Lucy","Trump","Bill");
		for (String s : arr3) {
			System.out.println(s);
		}
	}
}

//һ�����ļ��У����Զ��������е��ࡣ�������ֻ����һ������public ��
//������������
class Employee {
	public String[] getEmployees(){
		String[] arr={"����","����"};
		return arr;
	}
	
	public String[] getEmployees(String name1,String name2){
		System.out.println("1111111111");
		String[] arr={name1,name2};
		return arr;
	}
	public String[] getEmployees(String... name ){
		System.out.println("22222222222");
		String[] arr=name;
		return arr;
	}
}