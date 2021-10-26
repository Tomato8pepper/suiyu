package com.gem.day65;

public class T5 {
	// 想要游泳
	public void action(ISwim s) {
		s.swim();
	}

	public static void main(String[] args) {
		T5 t = new T5();
		// 匿名类
		t.action(new ISwim() {
			@Override
			public void swim() {
				System.out.println("人在游");
			}
		});
	}
}
