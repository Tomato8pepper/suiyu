package OutIntput;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class J109����file������ļ��������� {

	public static void main(String[] args) {
		String str=new String();
		try {
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader inp=new BufferedReader(isr);
			String sdir="E:\\temp1.txt";
			String sfile;
			File fdir1=new File(sdir);
			if(fdir1.exists() && fdir1.isDirectory()) {
				System.out .println("�ļ��У�"+sdir+"�Ѿ�����");
				for(int i=0;i<fdir1.list().length;i++)
					System.out .println((fdir1.list())[i]);
				File fdir2=new File("E:\\temp1.txt\\temp");
				if(!fdir2.exists())
					fdir2.mkdirs();
				System.out .println();
				System.out .println("�������ļ��к���ļ��б�");
				for(int i=0;i<fdir1.list().length;i++)
					System.out .println((fdir1.list())[i]);
				
			}
			System.out .println("��������ļ����е�һ���ļ�����");
			sfile=inp.readLine();
			File ffile=new File(fdir1,sfile);
			if(ffile.isFile()) {
				System.out .print("�ļ���"+ffile.getName());
				System.out .print(";�����ļ��У�"+ffile.getPath());
				System.out .println(";�ļ���С��"+ffile.length()+"�ֽ�");

			}
			if(inp!=null)inp.close();
			
		}catch(IOException e) {
			System.out .println(e.toString());

		}
	}

}
