package Day5;
public class Class类 {       //每个类创建时都会形成一个Class对象存储类的类型信息
	public static void main(String []args) {
		Point pt=new Point();
		/*Class c=pt.getClass();   //getClass()是在object基类中定义的所有对象都有
		System.out.println(c.getName());
		
		try {
			Class c1=Class.forName("Point");  //用一个Class变量存储该Class对象；
			System.out.println(c1.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Class c2=Point.class;     //利用Class类的一个静态方法去获得Class实例
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