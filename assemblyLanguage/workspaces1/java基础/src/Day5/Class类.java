package Day5;
public class Class�� {       //ÿ���ഴ��ʱ�����γ�һ��Class����洢���������Ϣ
	public static void main(String []args) {
		Point pt=new Point();
		/*Class c=pt.getClass();   //getClass()����object�����ж�������ж�����
		System.out.println(c.getName());
		
		try {
			Class c1=Class.forName("Point");  //��һ��Class�����洢��Class����
			System.out.println(c1.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Class c2=Point.class;     //����Class���һ����̬����ȥ���Classʵ��
		System.out.println(c2.getName());
		
		Class c3=int.class;
		System.out.println(c3.getName());
		
		Class c4=Integer.TYPE;
		System.out.println(c4.getName());
		
		Class c5=Integer.class;
		System.out.println(c5.getName());*/
				
		if(args.length!=1) {
			return;
		}
		try {
			Class c=Class.forName(args[0]);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class Point{
	int x,y;
	static {
		System.out.println("Loading Point");
	}
	void output() {
		System.out.println("x="+x+","+"y="+y);	
	}
}
class Line{
	static {
		System.out.println("Loading Line");
	}
}