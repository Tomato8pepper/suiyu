package Lesson2�̳ж�̬super�������this;
class Point {
	int x,y;
	void output(){
		System.out.println(x);
		System.out.println(y);
	}
}
class Point1{
	int x,y;
	Point1(){}
	//����
	Point1(int a,int b,int c){}
	Point1(int a,int b) {
		x=a;
		y=b;
	}
	void output1() {
		System.out.println(x);
		System.out.println(y);
	}
}
//���û�й��캯����java���������Զ��ṩһ�����������Ĺ��캯��
//Ĭ��  ��ֵ��0    Boolean��false   char����\0��   ����null
public class M�������{
	public static void main (String []args) {
		Point p=new Point();
		p.output();
		Point1 p1=new Point1(5,5);
		p1.output1();
	}
}
