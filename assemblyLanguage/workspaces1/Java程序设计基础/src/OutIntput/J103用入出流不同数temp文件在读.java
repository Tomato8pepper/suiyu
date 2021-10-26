package OutIntput;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class J103用入出流不同数temp文件在读 {

	public static void main(String[] args) {
		FileOutputStream fout;
		DataOutputStream dout;
		FileInputStream fin;
		DataInputStream din;
		try {
			fout=new FileOutputStream("E:\\temp1.txt");
			dout=new DataOutputStream(fout);
			dout.writeInt(10);
			dout.writeLong(12345);
			dout.writeFloat(3.1415926f);
			dout.writeDouble(987654321.123);
			dout.writeBoolean(true);
			dout.writeChars("Goodbye!");
			dout.close();
			
		}catch(IOException e) {}
		try {
			fin=new FileInputStream ("E:\\temp1.txt");;
			din=new DataInputStream (fin);
			System.out .println(din.readInt());
			System.out .println(din.readLong());
			System.out .println(din.readFloat());
			System.out .println(din.readDouble());
			System.out .println(din.readBoolean());
			char ch;
			while((ch=din.readChar())!='\0')
				System.out .print(ch);
			din.close();
			
		}
		catch(FileNotFoundException e) {
			System.out .println("文件未找到");
		}catch(IOException e) {
	}
	}
}
