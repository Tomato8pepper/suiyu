package OutIntput;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class J101���ļ�д��������ʾ {

	public static void main(String[] args) {
		FileInputStream fin;
		FileOutputStream fout;
		char ch;
		int data;
		try {
			fin=new FileInputStream(FileDescriptor.in);
			fout=new FileOutputStream("e:\\myfile.txt");
			System.out .println("������һ���ַ���������#������");
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
			System.out .println("�ļ�û�ҵ�!");
			
		}catch(IOException e) {}

	}

}
