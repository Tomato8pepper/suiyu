package Exception;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class J96��Сд�ĳɴ�д��ʾ��Ϣ {

	public static void main(String[] args) throws IOException {
		String str;
		BufferedReader buf;
		buf=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
				System.out.println("�������ַ���");
				str=buf.readLine();
				if(str.length()>0)
					break;
				else 
					throw new IOException();
			}catch(IOException e) {
				System.out .println("���������ַ���!!");
				continue;
			}
		}
		String s=str.toUpperCase();
		System.out .println("ת������ַ���Ϊ��"+s);
	}

}
