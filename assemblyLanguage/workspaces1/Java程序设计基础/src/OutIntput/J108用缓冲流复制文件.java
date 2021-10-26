package OutIntput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class J108用缓冲流复制文件{

	public static void main(String[] args) {
		String str=new String();
		try {
			BufferedReader in=new BufferedReader(new FileReader("E:\\temp1.txt"));
			BufferedWriter out=new BufferedWriter(new FileWriter("E:\\temp2.txt"));
			while((str=in.readLine())!=null) {
				System.out .println(str);
				out.write(str);
				out.newLine();
				
			}
			out.flush();
			in.close();
			out.close();
		}catch(IOException ioe) {
			System.out .println("错误"+ioe);
		}
	}

}
