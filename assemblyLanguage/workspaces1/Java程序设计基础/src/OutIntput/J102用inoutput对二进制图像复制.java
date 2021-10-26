package OutIntput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class J102用inoutput对二进制图像复制 {

	public static void main(String[] args) throws Exception {
		FileInputStream fi=new FileInputStream("E:\\1.jpg");
		FileOutputStream fo=new FileOutputStream("E:\\2.jpg");
		System.out .println("文件的大小="+fi.available());
		byte[] b=new byte[fi.available()];
		fi.read(b);
		fo.write(b);
		System.out .println("文件已被复制并被更名");
		fi.close();
		fo.close();
		

	}

}
