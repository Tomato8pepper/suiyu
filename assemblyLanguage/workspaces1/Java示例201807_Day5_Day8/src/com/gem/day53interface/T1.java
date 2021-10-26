package com.gem.day53interface;

public class T1 {

	public static void main(String[] args) {
		/*People p=new People();
		p.swim();
		
		Frog f=new Frog();
		f.swim();*/
		
		ISwim s;
		s=new People();
		s.swim();
		
		s=new Frog();
		s.swim();
		
		s=new Fish();
		s.swim();
		//∂‡Ã¨
		
		System.gc();//ªÿ ’
		
		new People().swim();
		
	}

}
