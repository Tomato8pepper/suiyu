package com.gem.day52abstract;

public class CEO extends Employee {

	public CEO(String empId, String empName) {
		super(empId, empName);
	}

	/*
	 * ����
	 */
	public void discuss() {
		System.out.println("CEO >>���ţ�"+this.getEmpId()+
				"\t������"+this.getEmpName()+" �ڿ������ۣ�");
	}

	
	@Override
	public String work(){
		return "CEO >>���ţ�"+this.getEmpId()+"\t������"+this.getEmpName()+" ���ܾ���칫�ҹ�����";
		
	}
	
}
