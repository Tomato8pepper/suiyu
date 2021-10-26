package OutIntput;

import java.io.FileWriter;
import java.io.IOException;

public class J106用filewrite将数组字符串到文件 {

	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("E:\\temp1.txt");
		char[] c= {'W','C','B','N','H','A','\r','\n'};
		String str="最近好吗！";
		fw.write(c);
		fw.write(str);
		fw.close();
	}

}
