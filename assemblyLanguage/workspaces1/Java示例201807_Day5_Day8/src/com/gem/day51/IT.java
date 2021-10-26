package com.gem.day51;


public class IT extends Employee  {
	private String tool;
	
	public void setTool(String tool){
		this.tool=tool;
	}
	public String getTool(){
		return this.tool;
	}
	//重载
	public IT(){
		
	}

	public IT(String empId,String empName){
		super(empId,empName);
	}
	public IT(String empId,String empName,String tool){
		super(empId,empName);
		this.tool=tool;
	}
	
	@Override
	public String work(){
		return ("IT >>工号："+this.getEmpId()+
				"\t姓名："+this.getEmpName()+
				"\t用工具:"+this.tool+" 修电脑！");
	}
	
	
}
