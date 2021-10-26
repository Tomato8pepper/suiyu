package Class类;
public class J62圆柱类改参 {
	public static void mian() {
		Cylinder1 volu1,volu2;
		volu1=new Cylinder1();
		volu2=new Cylinder1();
		volu1.radius=volu2.radius=2.5;
		volu2.pi=3;
		System.out .println("底圆1半径="+volu1.radius);
		System.out .println("底圆2半径="+volu2.radius);
		System.out .println("圆柱一的pi="+volu1.pi);
		System.out .println("圆柱二的pi="+volu2.pi);
		System.out .print("圆柱一");
		volu1.area();
		System.out .println("圆柱二");
		volu2.area();

	}

}
class Cylinder1{
	double radius;
	int height;
	double pi=3.14;
	void area() {
		System.out .println("底面积="+pi*radius*radius);
	}
	double volume() {
		return (pi*radius*radius)*height;
	}

}
