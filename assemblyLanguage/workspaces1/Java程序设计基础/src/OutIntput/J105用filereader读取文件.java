package OutIntput;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class J105��filereader��ȡ�ļ� {

	public static void main(String[] args) throws Exception {
		char[] c=new char[500];
		FileReader fr=new FileReader("E:\\temp1.txt");
		int num=fr.read(c);
		String str=new String(c,0,num);
		System.out .println("��ȡ���ַ�����Ϊ��"+num+",���������£�");
		System.out .println(str);
		fr.close();
	}

}
