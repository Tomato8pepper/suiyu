package Class��;
public class J62Բ����Ĳ� {
	public static void mian() {
		Cylinder1 volu1,volu2;
		volu1=new Cylinder1();
		volu2=new Cylinder1();
		volu1.radius=volu2.radius=2.5;
		volu2.pi=3;
		System.out .println("��Բ1�뾶="+volu1.radius);
		System.out .println("��Բ2�뾶="+volu2.radius);
		System.out .println("Բ��һ��pi="+volu1.pi);
		System.out .println("Բ������pi="+volu2.pi);
		System.out .print("Բ��һ");
		volu1.area();
		System.out .println("Բ����");
		volu2.area();

	}

}
class Cylinder1{
	double radius;
	int height;
	double pi=3.14;
	void area() {
		System.out .println("�����="+pi*radius*radius);
	}
	double volume() {
		return (pi*radius*radius)*height;
	}

}
