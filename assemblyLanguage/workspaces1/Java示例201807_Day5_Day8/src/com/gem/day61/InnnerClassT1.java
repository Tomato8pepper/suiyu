package com.gem.day61;

//Ҫ����һ���ڲ��࣬�ڲ�������һ������i=5,Ҫ��ʾ5��
//�ڲ����ṩ�˸��õķ�װ
class Wai {
	public class Nei {
		int i = 5;
	}

	public void myVoid() {
		Nei n = new Nei();
		int ii = n.i;
		System.out.println(ii);
	}
}

public class InnnerClassT1 {

	public static void main(String[] args) {
		Wai w = new Wai();
		w.myVoid();
	}
}
