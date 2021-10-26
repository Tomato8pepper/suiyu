package OutIntput;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class J105用filereader读取文件 {

	public static void main(String[] args) throws Exception {
		char[] c=new char[500];
		FileReader fr=new FileReader("E:\\temp1.txt");
		int num=fr.read(c);
		String str=new String(c,0,num);
		System.out .println("读取的字符个数为："+num+",其内容如下：");
		System.out .println(str);
		fr.close();
	}

}
