package Ա��;

public class Employee {
	private String empId;			//����
	private String empName;			//����
	//private String empPassword;		//����
	private String gender;			//�Ա�
	//private String birthDate;		//��������
	//private String pic;				//ͷ��
	//private String deptName;		//����
	public  String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	/*public String getDeptName() {
		return deptName;
	}
	//public void setDeptName(String deptName) {
		this.deptName = deptName;
	}*/
	public Employee() {}
		
	public Employee(String empId, String empName, String gender/*, String deptName*/) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		//this.deptName = deptName;
	}
	
}
