package zuoye;
public class SalesEmployee extends Employee{
	protected int monSale;
	protected double royRate;
	public SalesEmployee() {
	}
	
	public  SalesEmployee(int monSale,double royRate) {   //注意加了void，这不是构造方法；
		this.monSale=monSale;
		this.royRate=royRate;
		
	}
	public double Salar3(double monSale,double royRate) {
		return  monSale*royRate;
		
	}

}
