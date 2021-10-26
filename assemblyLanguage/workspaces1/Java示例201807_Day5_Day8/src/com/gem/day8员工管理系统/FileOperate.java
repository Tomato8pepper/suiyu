package com.gem.day8员工管理系统;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class FileOperate {
	private File file;
	private String content;

	public FileOperate(String fileName) {
		this.file = new File(fileName);
	}

	public FileOperate(String fileName, String content) {
		this.file = new File(fileName);
		this.content = content;
	}

	// throws申明一个异常，由外部调用者来捕捉
	public void writeContent() throws IOException {
		OutputStream os = new FileOutputStream(this.file);
		// 向文件中写入字节数组
		os.write(this.content.getBytes());
		// 关闭此文件输出流并释放与此流有关的所有系统资源。此文件输出流不能再用于写入字节。 如果此流有一个与之关联的通道，则关闭该通道。
		os.close();
	}

	// 追加内容 {处理流}
	public void appendContent() throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.file, true)));
		bw.write(this.content + "\r\n");
		bw.close();
	}

	public List<Employee> readContent() throws IOException {
		// 定义一个员工集合
		List<Employee> empList = new ArrayList<Employee>();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(this.file)));
		String line;
		// 循环每一行字符
		while ((line = br.readLine()) != null) {
			// 对一行字符处理，处理完填加到集合
			String[] arr=line.split("\t");
			Employee emp = new Employee(arr[0], arr[1], arr[2]);
			empList.add(emp);
		}
		br.close();
		return empList;
	}
}
