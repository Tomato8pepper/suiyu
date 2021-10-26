package OutIntput;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class J101建文件写入文字显示 {

	public static void main(String[] args) {
		FileInputStream fin;
		FileOutputStream fout;
		char ch;
		int data;
		try {
			fin=new FileInputStream(FileDescriptor.in);
			fout=new FileOutputStream("e:\\myfile.txt");
			System.out .println("请输入一行字符串，并以#结束：");
			while((ch=(char)fin.read())!='#')
				fout.write(ch);
			fin.close();
			fout.close();
			System.out .println();
			fin=new FileInputStream("e:\\myfile.txt");
			fout=new FileOutputStream(FileDescriptor.out);
			while(fin.available()>0) {
				data=fin.read();
				fout.write(data);
				
			}
			fin.close();
			fout.close();
			
		}catch(FileNotFoundException e) {
			System.out .println("文件没找到!");
			
		}catch(IOException e) {}

	}

}
