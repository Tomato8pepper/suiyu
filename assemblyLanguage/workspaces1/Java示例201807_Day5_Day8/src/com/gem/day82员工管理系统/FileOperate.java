package com.gem.day82Ա������ϵͳ;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOperate {
	private File file;
	private String content;

	public FileOperate(String fileName, String content) {
		this.file = new File(fileName);
		this.content = content;
	}

	// throws����һ���쳣�����ⲿ����������׽
	public void writeContent() throws IOException {
		OutputStream os = new FileOutputStream(this.file);
		  //���ļ���д���ֽ�����
		os.write(this.content.getBytes());
		//�رմ��ļ���������ͷ�������йص�����ϵͳ��Դ�����ļ����������������д���ֽڡ� ���������һ����֮������ͨ������رո�ͨ����
		os.close();
	}
}
