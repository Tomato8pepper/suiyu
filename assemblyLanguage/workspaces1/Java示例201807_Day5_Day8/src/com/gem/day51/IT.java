package com.gem.day51;


public class IT extends Employee  {
	private String tool;
	
	public void setTool(String tool){
		this.tool=tool;
	}
	public String getTool(){
		return this.tool;
	}
	//����
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
		return ("IT >>���ţ�"+this.getEmpId()+
				"\t������"+this.getEmpName()+
				"\t�ù���:"+this.tool+" �޵��ԣ�");
	}
	
	
}
