package com.gem.day43;

/**
 * ���ࣺ���� ��
 * @author ybgong
 *
 */
public class Manager extends Employee {
	
	public Manager(){
	}
	public Manager(String empId, String empName) {
		super(empId, empName);//����
	}
	//����Լ�����
	public void discuss(){
		System.out.println(this.getEmpName()+"�����ڿ������ۣ�");
		
	}
}
