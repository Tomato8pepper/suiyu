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
		return "���Ĺ����ǣ�"+a+basePay;

		}
	
} /*
this.��Ա����;���ʵ��Ǳ���ĳ�Ա����
super.��Ա����:���ʵĸ���ĳ�Ա����
���ʳ�Ա����:
this.��Ա����(); ���ʵ��Ǳ���ĳ�Ա����
super.��Ա����();�����õ�����ĳ�Ա����
���ʹ��췽��:
this():���ʵ��Ǳ����еĿղι���;
this("..."):�����õ��Ǳ����еĴ��ι���
super():�����õ��Ǹ������޲ι���
super(".."):���ʵ��Ǹ����еĴ��ι���*/