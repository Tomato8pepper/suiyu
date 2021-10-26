package OutIntput;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class J109创建file类输出文件夹下内容 {

	public static void main(String[] args) {
		String str=new String();
		try {
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader inp=new BufferedReader(isr);
			String sdir="E:\\temp1.txt";
			String sfile;
			File fdir1=new File(sdir);
			if(fdir1.exists() && fdir1.isDirectory()) {
				System.out .println("文件夹："+sdir+"已经存在");
				for(int i=0;i<fdir1.list().length;i++)
					System.out .println((fdir1.list())[i]);
				File fdir2=new File("E:\\temp1.txt\\temp");
				if(!fdir2.exists())
					fdir2.mkdirs();
				System.out .println();
				System.out .println("建立新文件夹后的文件列表");
				for(int i=0;i<fdir1.list().length;i++)
					System.out .println((fdir1.list())[i]);
				
			}
			System.out .println("请输入该文件夹中的一个文件名：");
			sfile=inp.readLine();
			File ffile=new File(fdir1,sfile);
			if(ffile.isFile()) {
				System.out .print("文件名"+ffile.getName());
				System.out .print(";所在文件夹："+ffile.getPath());
				System.out .println(";文件大小："+ffile.length()+"字节");

			}
			if(inp!=null)inp.close();
			
		}catch(IOException e) {
			System.out .println(e.toString());

		}
	}

}
