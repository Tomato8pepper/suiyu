package com.gem.day82Writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class T1 {
	public static void main(String[] args) {
		//System.out.println( (char)20061);
		
		try {
			Writer w = new FileWriter("Employee2.txt");
			w.write("¾Å½­\r\n");
			w.write("ÄÏ²ý");
			w.close();
			
			Reader r=new FileReader("Employee2.txt");
			int i;
			while((i=r.read())!=-1){
				System.out.print((char)i);
			}
			r.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
