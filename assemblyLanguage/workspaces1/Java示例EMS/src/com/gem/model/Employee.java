package com.gem.model;

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
	private String pic;				//ͷ��
	private String deptId;		//����

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
	//3 ������
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
	//4 ����
	/**
	 * ����
	 * @return
	 */
	public  String work(){
		return "���ţ�"+this.empId+"\t������"+this.empName+" �ڹ�����";
	}
	
}
