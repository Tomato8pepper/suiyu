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
			return "���Ĺ����ǣ�"+monHour*hourSar; 
		}else {
			
		}
		return "���ã����Ĺ����ǣ�"+monHour*hourSar+a*hourSar*1.5;
	}
	

}
