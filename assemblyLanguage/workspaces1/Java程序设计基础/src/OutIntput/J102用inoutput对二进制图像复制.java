package OutIntput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class J102��inoutput�Զ�����ͼ���� {

	public static void main(String[] args) throws Exception {
		FileInputStream fi=new FileInputStream("E:\\1.jpg");
		FileOutputStream fo=new FileOutputStream("E:\\2.jpg");
		System.out .println("�ļ��Ĵ�С="+fi.available());
		byte[] b=new byte[fi.available()];
		fi.read(b);
		fo.write(b);
		System.out .println("�ļ��ѱ����Ʋ�������");
		fi.close();
		fo.close();
		

	}

}
