package com.gem.day8Ա������ϵͳ;

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

	// throws����һ���쳣�����ⲿ����������׽
	public void writeContent() throws IOException {
		OutputStream os = new FileOutputStream(this.file);
		// ���ļ���д���ֽ�����
		os.write(this.content.getBytes());
		// �رմ��ļ���������ͷ�������йص�����ϵͳ��Դ�����ļ����������������д���ֽڡ� ���������һ����֮������ͨ������رո�ͨ����
		os.close();
	}

	// ׷������ {������}
	public void appendContent() throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.file, true)));
		bw.write(this.content + "\r\n");
		bw.close();
	}

	public List<Employee> readContent() throws IOException {
		// ����һ��Ա������
		List<Employee> empList = new ArrayList<Employee>();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(this.file)));
		String line;
		// ѭ��ÿһ���ַ�
		while ((line = br.readLine()) != null) {
			// ��һ���ַ�������������ӵ�����
			String[] arr=line.split("\t");
			Employee emp = new Employee(arr[0], arr[1], arr[2]);
			empList.add(emp);
		}
		br.close();
		return empList;
	}
}
