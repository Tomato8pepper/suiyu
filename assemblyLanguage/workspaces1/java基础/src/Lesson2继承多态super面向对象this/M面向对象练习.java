package Lesson2�̳ж�̬super�������this;
public class M���������ϰ {
	//������̵ģ�
	/*static int perimeter(int length,int width) {
		return 2*(length+width);
	}
	static int area(int length,int width) {
		return length*width;
	}
	public static void main(String []args) {
		System.out.println("Rectangle's perimeter is:"+M���������ϰ.perimeter(5, 4));
		System.out.println("Rectangle's area is:"+M���������ϰ.area(7, 8));
	}*/
	
	//�������
	int l,w;
	int perimeter() {
		return 2*(l+w);
	}
	int area() {
		return l*w;
	}
	public static void main(String []args) {
		M���������ϰ m1=new M���������ϰ();
		M���������ϰ m2=new M���������ϰ();
		
		m1.l=3;
		m1.w=4;
		System.out.println("perimeter of m1 is:"+m1.perimeter());
		System.out.println("area of m1 is:"+m1.area());
		
		m2.l=7;
		m2.w=8;
		System.out.println("perimeter of m1 is:"+m2.perimeter());
		System.out.println("area of m1 is:"+m2.area());
	}
}
   //�������ݣ�java��λ����
   //       java���������������̵�����
   //       ��Ͷ���Ĺ�ϵ
   //       ���캯�����������ء�this��super��������̬������java�еĳ������̳С���̬