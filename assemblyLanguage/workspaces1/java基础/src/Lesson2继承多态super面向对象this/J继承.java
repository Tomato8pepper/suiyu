package Lesson2�̳ж�̬super�������this;
class Animal{
	int height,weight;
	Animal(){
		System.out.println("animal construct����Ĺ��췽���ȱ�����");
	}
	void eat(){
		System.out.println("animal eat");
	}
	void sleep() {
		System.out.println("animal sleep");
	}
	void breathe() {
		System.out.println(height);
		System.out.println("animal breathe");
	}
}
class Fish extends Animal{  //�����ټ̳�����������
	int height;  //��Ա��������
	Fish(){
		super();    //�����ĵ����˸���Ĳ��������Ĺ��췽�������ô������Ĺ���������β� �����д������ʡ�Ե�����������޲ι���
		System.out.println("fish construct");
	}
	void breathe() {        //��������
		super.height=30;    //���ʸ���ĳ�Ա����
		super.breathe();    //���ʸ����б����ǵķ���
		System.out.println("fish bubble");
		System.out.println(height);
	}
}
public class J�̳� {
	static void fn(Animal an) {
		an.breathe();
	}
	public static void main(String []args) {
		//Animal an=new Animal();
		//an.breathe();
		/*Fish f=new Fish();
		Animal an;
		an=f;             //����ʱ��̬��������ı�����ֵ������ı���������ı���������
		J�̳�.fn(an);       //����ʱ��̬�����أ����ݵ��÷������ݵĲ�����ͬ���ò�ͬ�ķ���' */
		//f.height=20;
		//f.breathe();
		Animal an=new Animal();
		Fish fh=new Fish();
		//an=fh; //��ֵ�Ժ������Ҳ�������ʵ��
		//instanceof�ж�һ�������Ƿ���һ�����ʵ��
		if(an instanceof Animal) {
			System.out.println("an is Animal's instanceof");
		}
		if(fh instanceof Fish) {
			System.out.println("an is Fish's instanceof");
		}
		if(fh instanceof Animal) {      //�γ��ǳ����������ǽγ�����������Ǹ�����󣬸��������������󣬵����������ֵ����������Ժ󣬸������Ҳ�������ʵ��
			System.out.println("fh is Animal's instanceof");
		}
		else {
			System.out.println("fh isn't Animal's instanceof");
		}
		if(an instanceof Fish){
			System.out.println("an is Fish's instanceof");
		}
		else {
			System.out.println("an isn't Fish's instanceof");
		}
	}
}
