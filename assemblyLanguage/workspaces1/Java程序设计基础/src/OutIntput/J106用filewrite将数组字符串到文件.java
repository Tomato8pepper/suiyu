package OutIntput;

import java.io.FileWriter;
import java.io.IOException;

public class J106��filewrite�������ַ������ļ� {

	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("E:\\temp1.txt");
		char[] c= {'W','C','B','N','H','A','\r','\n'};
		String str="�������";
		fw.write(c);
		fw.write(str);
		fw.close();
	}

}
