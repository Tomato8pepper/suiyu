package com.gem.day72Ա������ϵͳ;


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
	private String deptName;		//����

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
	//3 ������
	public Employee(){
		
	}
	
	public Employee(String empId,String empName,String gender){
		this.empId=empId;
		this.empName=empName;
		this.gender=gender;
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

