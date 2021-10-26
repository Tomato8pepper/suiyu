package zuoye;

public class HourlyEmployee extends Employee{
	private double hourSar;
	private double monHour;
	public HourlyEmployee() {
		
	}
	public HourlyEmployee(double hourSar,double monHour) {
		this.hourSar =hourSar;
		this.monHour =monHour;
	}
	public String Salar2(double hourSar,double monHour) {
		double a=monHour-160;
		if(monHour<=160) {
			return "您的工资是："+monHour*hourSar; 
		}else {
			
		}
		return "您好！您的工资是："+monHour*hourSar+a*hourSar*1.5;
	}
	

}
