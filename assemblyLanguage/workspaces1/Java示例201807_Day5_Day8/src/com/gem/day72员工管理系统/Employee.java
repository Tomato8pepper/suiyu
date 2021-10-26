package com.gem.day72员工管理系统;


/**
 * 员工类
 * @author ybgong
 *
 */
public  class Employee {
	//1
	private String empId;			//工号
	private String empName;			//姓名
	private String empPassword;		//密码
	private String gender;			//性别
	private String birthDate;		//出生日期
	private String pic;				//头像
	private String deptName;		//部门

	//2 set ,get
	public void setEmpId(String empId){
		this.empId=empId;
	}
	public String getEmpId(){
		return this.empId;
	}
	
	public void setEmpName(String empName){
		this.empName=empName;
	}
	public String getEmpName(){
		return this.empName;
	}

	public String getGender(){
		return this.gender;
	}
	
	//......
	//3 构造器
	public Employee(){
		
	}
	
	public Employee(String empId,String empName,String gender){
		this.empId=empId;
		this.empName=empName;
		this.gender=gender;
	}
	
	//4 方法
	/**
	 * 工作
	 * @return
	 */
	public  String work(){
		return "工号："+this.empId+"\t姓名："+this.empName+" 在工作！";
	}
}

