package com.gem.day53interface;

public class People implements ISwim {
	private String id; // ID
	private String name; // ����
	private String gender; // �Ա�

	public People() {
	}

	@Override
	public void swim() {
		System.out.println("������!");
	}
}
