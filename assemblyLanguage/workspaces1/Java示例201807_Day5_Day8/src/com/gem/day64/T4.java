package com.gem.day64;

public class T4 {

	public static void main(String[] args) {
		//静态类的非静态成员
		System.out.println(new Wai.Nei().i);
		new Wai.Nei().show1();
		//new Wai.Nei().show2(); //XXX right
		//静态类的静态成员
		System.out.println(Wai.Nei.j);
		Wai.Nei.show2();
		System.out.println(Wai.k);
	}

}
