package com.gem.day81Stream;

import java.io.File;
import java.io.IOException;

public class T1 {
	public static void main(String[] args) {
		// File file=new File("C:/1.txt");

		try {
			File file = new File("Employee.txt");
			// �������򴴽�
			if (!file.exists()) {
				// file.mkdirs();//Ŀ¼
				file.createNewFile();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
