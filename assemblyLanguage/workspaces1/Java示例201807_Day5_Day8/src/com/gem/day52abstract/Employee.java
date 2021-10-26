package com.gem.day52abstract;


/**
 * 员工类
 * @author ybgong
 *模板，抽象类是对子类约束，都共性的属性和方法，抽象方法子类分别去实现；
 */
public abstract  class Employee {
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
	
	//......
	//3 构造器
	public Employee(){
		
	}
	
	public Employee(String empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}
	
	//4 方法
	/**
	 * 工作
	 * @return
	 */
	public abstract  String work();
}
