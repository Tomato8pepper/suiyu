package com.gem.day81Stream;

import java.io.IOException;

public class T3FileOutputStream {

	// 写入美国2字
	public static void main(String[] args) {
		String s = "美国";
		try {
			FileOperate op = new FileOperate("Employee.txt", s);
			op.writeContent();
			System.out.println("保存成功！");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("保存失败！");
		}
	}

}
