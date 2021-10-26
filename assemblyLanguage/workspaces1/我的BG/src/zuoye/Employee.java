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
			return "亲爱的"+this.empName+','+this.empBirmon+"有你的生日，公司将奖励你一百元，祝你生日快乐";
		}
		

}
