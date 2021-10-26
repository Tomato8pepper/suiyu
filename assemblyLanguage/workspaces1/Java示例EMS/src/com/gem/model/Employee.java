package com.gem.model;

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
	private String deptId;		//部门

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
	public String getEmpPassword() {
		return this.empPassword;
	}

	public String getGender(){
		return this.gender;
	}
	public String getBirthDate() {
		return this.birthDate;
	}
	public String getPic() {
		return this.pic;
	}
	public String getDeptId() {
		return this.deptId;
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

	public Employee(String empId, String empName, String empPassword, 
			String gender, String birthDate) {
		this.empId=empId;
		this.empName=empName;
		this.empPassword=empPassword;
		this.gender=gender;
		this.birthDate=birthDate;
	}
	public Employee(String empId, String empName, String empPassword, 
			String gender, String birthDate,String pic,String deptId) {
		this.empId=empId;
		this.empName=empName;
		this.empPassword=empPassword;
		this.gender=gender;
		this.birthDate=birthDate;
		this.pic=pic;
		this.deptId=deptId;
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
