package com.gem.model;

import java.sql.Blob;

/**
 * Ա����
 * @author ybgong
 *
 */
public  class Employee {
	//1
	private String empId;			//����
	private String empName;			//����
	private String empPassword;		//����
	private String gender;			//�Ա�
	private String birthDate;		//��������
	private Blob pic;				//ͷ��
	private int deptId;		//����			//ͷ��
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
	//3 ������
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
	//4 ����
	/**
	 * ����
	 * @return
	 */
	public  String work(){
		return "���ţ�"+this.empId+"\t������"+this.empName+" �ڹ�����";
	}
	
}
