package zuoye;

public class SalariedEmployee extends Employee{
	private int monSalary;
	public SalariedEmployee(){
		
	}
    public SalariedEmployee(int monSalary) {
    	this.monSalary=monSalary ;
    }
    public String Salar1(int monSalary){
    	return "您好！你的工资是:"+this.monSalary;
    }
}
