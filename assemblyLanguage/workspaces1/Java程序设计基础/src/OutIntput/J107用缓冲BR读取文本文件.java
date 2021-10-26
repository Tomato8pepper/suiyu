package OutIntput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class J107用缓冲BR读取文本文件 {

	public static void main(String[] args) throws IOException{
		String thisLine;
		int count=0;
		try {
			FileReader fr=new FileReader("E:\\temp1.txt");
			BufferedReader bfr=new BufferedReader(fr);
			while((thisLine=bfr.readLine())!=null) {
				count++;
				System.out.println(thisLine);
				
			}
			System.out .println("共读取了"+count+"行");
			bfr.close();
			
		}catch(IOException ioe) {
			//String ioe = null;
			System.out .println("错误"+ioe);
		}
	}

}
