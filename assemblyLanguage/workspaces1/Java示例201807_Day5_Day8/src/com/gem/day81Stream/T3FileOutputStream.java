package com.gem.day81Stream;

import java.io.IOException;

public class T3FileOutputStream {

	// д������2��
	public static void main(String[] args) {
		String s = "����";
		try {
			FileOperate op = new FileOperate("Employee.txt", s);
			op.writeContent();
			System.out.println("����ɹ���");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("����ʧ�ܣ�");
		}
	}

}
