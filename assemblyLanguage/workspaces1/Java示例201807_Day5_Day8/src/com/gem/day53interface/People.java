package com.gem.day53interface;

public class People implements ISwim {
	private String id; // ID
	private String name; // 姓名
	private String gender; // 性别

	public People() {
	}

	@Override
	public void swim() {
		System.out.println("人在游!");
	}
}
