package 员管;

public class Employee {
	private String empId;			//工号
	private String empName;			//姓名
	//private String empPassword;		//密码
	private String gender;			//性别
	//private String birthDate;		//出生日期
	//private String pic;				//头像
	//private String deptName;		//部门
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
