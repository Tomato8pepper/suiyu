package zuoye;

public class Employee {
		private String empName;
		private String empBirmon;
		public Employee(){
		}
		public Employee(String empName,String empBirmon){
			this.empName=empName;
			this.empBirmon=empBirmon;			
		}
		public String getSalary(int month) {
			return "�װ���"+this.empName+','+this.empBirmon+"��������գ���˾��������һ��Ԫ��ף�����տ���";
		}
		

}
