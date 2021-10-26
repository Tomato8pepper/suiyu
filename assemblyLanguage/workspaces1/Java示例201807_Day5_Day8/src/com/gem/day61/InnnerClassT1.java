package com.gem.day61;

//要定义一个内部类，内部类中有一个变量i=5,要显示5？
//内部类提供了更好的封装
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
