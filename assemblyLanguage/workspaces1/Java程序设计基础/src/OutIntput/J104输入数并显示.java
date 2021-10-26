package OutIntput;

import java.io.IOException;

public class J104输入数并显示 {
	public static void main(String[] args) {
		try {
		byte[] b=new byte[128];
		System.out .println("请输入字符：");
		int count=System.in.read(b);
		System.out .println("输入的是：");
		for(int i=0;i<count;i++)
			System.out .println(b[i]+" ");
		System.out .println();
		for(int i=0;i<count-2;i++)
			System.out .println((char)b[i]+" ");
		System.out .println();
		System.out .println("输入的字符个数为"+count);
		Class InClass=System.in.getClass();
		Class OutClass=System.out.getClass();
		System.out .println("in所在的类是："+InClass.toString());
		System.out .println("out所在的类是："+OutClass.toString());
		}catch(IOException e) {
			
		}
	}

}
