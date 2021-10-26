package Exception;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class J96将小写改成大写提示信息 {

	public static void main(String[] args) throws IOException {
		String str;
		BufferedReader buf;
		buf=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
				System.out.println("请输入字符串");
				str=buf.readLine();
				if(str.length()>0)
					break;
				else 
					throw new IOException();
			}catch(IOException e) {
				System.out .println("必须输入字符串!!");
				continue;
			}
		}
		String s=str.toUpperCase();
		System.out .println("转换后的字符串为："+s);
	}

}
