package OutIntput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class J107�û���BR��ȡ�ı��ļ� {

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
			System.out .println("����ȡ��"+count+"��");
			bfr.close();
			
		}catch(IOException ioe) {
			//String ioe = null;
			System.out .println("����"+ioe);
		}
	}

}
