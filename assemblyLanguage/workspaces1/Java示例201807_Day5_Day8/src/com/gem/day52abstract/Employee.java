package com.gem.day52abstract;


/**
 * Ա����
 * @author ybgong
 *ģ�壬�������Ƕ�����Լ���������Ե����Ժͷ��������󷽷�����ֱ�ȥʵ�֣�
 */
public abstract  class Employee {
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
	
	//......
	//3 ������
	public Employee(){
		
	}
	
	public Employee(String empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}
	
	//4 ����
	/**
	 * ����
	 * @return
	 */
	public abstract  String work();
}
