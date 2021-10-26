package zuoye;
public class BasePlusSalesEmployee extends SalesEmployee{
	private double basePay;
	public BasePlusSalesEmployee() {
	}
	public BasePlusSalesEmployee(double basePay) {
		this.basePay=basePay;	
	}
	public String Salar4(double monSale,double royRate,double basePay) {
		
		double a=super.Salar3( monSale, royRate);
		return "您的工资是："+a+basePay;

		}
	
} /*
this.成员变量;访问的是本类的成员变量
super.成员变量:访问的父类的成员变量
访问成员方法:
this.成员方法(); 访问的是本类的成员方法
super.成员方法();访问拿到父类的成员方法
访问构造方法:
this():访问的是本类中的空参构造;
this("..."):访问拿到是本类中的带参构造
super():访问拿到是父类中无参构造
super(".."):访问的是父类中的带参构造*/