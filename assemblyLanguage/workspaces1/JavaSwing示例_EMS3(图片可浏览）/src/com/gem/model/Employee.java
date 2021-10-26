package com.gem.model;

import java.sql.Blob;

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
	private Blob pic;				//头像
	private int deptId;		//部门			//头像
	private String nativePlace;

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
	public Blob getPic() {
		return this.pic;
	}
	public int getDeptId() {
		return this.deptId;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public void setPic(Blob pic) {
		this.pic = pic;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	//......
	//3 构造器
	public Employee(){
		
	}
	public Employee(String empId, String empName, String empPassword, 
			String gender, String birthDate,int deptId,String nativePlace) {
		this.empId=empId;
		this.empName=empName;
		this.empPassword=empPassword;
		this.gender=gender;
		this.birthDate=birthDate;
		this.deptId=deptId;
		this.nativePlace=nativePlace;
	}
	

	public Employee(String empId, String empName, String empPassword, String gender, String birthDate, Blob pic,
			int deptId, String nativePlace) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPassword = empPassword;
		this.gender = gender;
		this.birthDate = birthDate;
		this.pic = pic;
		this.deptId = deptId;
		this.nativePlace = nativePlace;
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
