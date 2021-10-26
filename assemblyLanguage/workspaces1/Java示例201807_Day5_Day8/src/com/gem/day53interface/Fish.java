package com.gem.day53interface;

public class Fish implements ISwim   {
	private String type;
	
	public Fish(){		
	}

	@Override
	public void swim() {
		System.out.println("гудкгЮ!");
	}
	
	
}
