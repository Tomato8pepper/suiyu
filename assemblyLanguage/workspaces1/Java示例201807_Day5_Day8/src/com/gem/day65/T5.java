package com.gem.day65;

public class T5 {
	// ��Ҫ��Ӿ
	public void action(ISwim s) {
		s.swim();
	}

	public static void main(String[] args) {
		T5 t = new T5();
		// ������
		t.action(new ISwim() {
			@Override
			public void swim() {
				System.out.println("������");
			}
		});
	}
}
