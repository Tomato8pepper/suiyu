package com.gem.day52abstract;

public class CEO extends Employee {

	public CEO(String empId, String empName) {
		super(empId, empName);
	}

	/*
	 * 开会
	 */
	public void discuss() {
		System.out.println("CEO >>工号："+this.getEmpId()+
				"\t姓名："+this.getEmpName()+" 在开会讨论！");
	}

	
	@Override
	public String work(){
		return "CEO >>工号："+this.getEmpId()+"\t姓名："+this.getEmpName()+" 在总经理办公室工作！";
		
	}
	
}
