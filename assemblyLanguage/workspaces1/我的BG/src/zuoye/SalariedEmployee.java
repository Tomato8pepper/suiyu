package zuoye;

public class SalariedEmployee extends Employee{
	private int monSalary;
	public SalariedEmployee(){
		
	}
    public SalariedEmployee(int monSalary) {
    	this.monSalary=monSalary ;
    }
    public String Salar1(int monSalary){
    	return "���ã���Ĺ�����:"+this.monSalary;
    }
}
