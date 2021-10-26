package 员工管理系统;

public class Employee {
	private int empId;
	private String empName;
	private String gender;
	private String birthDate;

	public Employee(int empId, String empName, String gender, String birthDate) {
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.birthDate = birthDate;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return this.gender;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthDate() {
		return this.birthDate;
	}

	public Employee() {

	}

}
