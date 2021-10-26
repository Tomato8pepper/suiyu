package com.gem.day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.gem.day53interface.ISwim;

public class T2FileInputStream {

	// hello world!
	public static void main(String[] args) {
		try {

			// ¶Á
			InputStream is = new FileInputStream("Employee.txt");
			//12  
			byte[] b = new byte[10];
			int len=0;
			while((len=is.read(b,0,b.length))!=-1){
				System.out.print(new String(b, 0, len));
			}
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
