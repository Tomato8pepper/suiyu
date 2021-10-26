package com.gem.day82员工管理系统;
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

	// throws申明一个异常，由外部调用者来捕捉
	public void writeContent() throws IOException {
		OutputStream os = new FileOutputStream(this.file);
		  //向文件中写入字节数组
		os.write(this.content.getBytes());
		//关闭此文件输出流并释放与此流有关的所有系统资源。此文件输出流不能再用于写入字节。 如果此流有一个与之关联的通道，则关闭该通道。
		os.close();
	}
}
