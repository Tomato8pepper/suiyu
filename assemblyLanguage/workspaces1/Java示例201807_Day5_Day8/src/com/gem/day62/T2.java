package com.gem.day62;

import com.gem.day62.Wai.Nei;

class Wai{
	class Nei{
		private int i=5;
		private int j=6;
		public int getI(){
			return i;
		}
		public int getJ(){
			return j;
		}
	}
}

public class T2 {
	public static void main(String[] args) {
			Wai.Nei n=new Wai().new Nei();
			System.out.println(n.getI());
			System.out.println(n.getJ());
			
			Wai w2=new Wai();
			Nei n2=w2.new Nei();
			System.out.println(n2.getI());
			System.out.println(n2.getJ());
			
	}
}
