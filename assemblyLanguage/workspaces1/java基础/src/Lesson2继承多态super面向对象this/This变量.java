package Lesson2�̳ж�̬super�������this;
class Point2{
	int x,y;
	static int z;//����������࣬�����ڳ�Ա������ֱ��ʹ��
	final double PI;//=3.1415926;//������ͬʱ���г�ʼ����Ҳ�����ڹ��캯���н��г�ʼ��  �����������һ����̬�ĳ�����ֻ��ֱ�ӳ�ʼ����Ϊ���������øþ�̬������ʱ�򲢲���ȥ���ù��캯�������൱��û�г�ʼ����
	Point2(int a,int b){
		PI=3.1415926;
		x=a;
		y=b;
	}
	Point2(){
		//PI=3.1415926;
		this(1,1);}   //this�����˴������Ĺ��췽����ʹ��ʱ������ڵ�һ��
	void output() {
		System.out.println(x);
		System.out.println(y);
	}
	void output(int x,int y) {
		this.x=x;//x=x; ������Ƕ������
		this.y=y;//y=y;
	}
	static void output1() {       //��̬���������౾����������Ǹ���ķ���
		System.out.println("��̬����������");
		System.out.println("��̬����ֱ������������");
		System.out.println(z);
	}
}
public class This���� {
	public static void main(String []args) {
		/*Point2 p=new Point2(3,3);
		p.output(4,4);
		p.output();*/
		Point2 p=new Point2();
		p.x=2;
		p.output();
		Point2 pt=new Point2();
		pt.x=23;
		System.out.println(p.x);
		System.out.println(pt.x);   //һ��������е�ʵ�����õĳ�Ա�������ڴ���ֻ��ֻ��һ�ݿ��������ݳ�Ա�ڶ���ÿһ�������ж���һ�ݿ���
		pt.output();
		Point2.output1();    //���ÿ���������Ҳ�����ö��󣬾�̬����������ص�ʱ��͸�������˴���ռ䣬���������ʹ���˳�Ա�����Ǳ�����õ�ʱ�������ʵ���������������ڴ�ռ���ʵ�ֵ���
		p.z=5;
		pt.z=6;
		System.out.println(p.z);
		System.out.println(pt.z);//��̬��������Ķ�����ĳ�������ֻ��һ���ڴ�
	}
}
