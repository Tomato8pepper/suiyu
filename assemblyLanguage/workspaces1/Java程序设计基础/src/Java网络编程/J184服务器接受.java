package Java网络编程;

import java.io.IOException;
import java.net.*;
public class J184服务器接受 {

	public static void main(String[] args) {
		J184服务器接受 frm=new J184服务器接受();

	}
	String strbuf=" ";
	SerThread st;
	public 	J184服务器接受() {
		st=new SerThread() {};
		st.start();
	}
}
class SerThread extends Thread{
	public SerThread() {}
	public void run() {
		String str1;
		try {
			//使用8000端口 建立S0cket对象
			DatagramSocket skt=new DatagramSocket(8000);
			System.out.print("服务器名:");
			//显示服务器计算机的名称
			System.out.println(InetAddress.getLocalHost().getHostName());
			while(true) {
				byte[] inBuf=new byte[256];
				//下面是得到服务器地址
				DatagramPacket pkt;
				//创建并设置接收pkt对象的接收信息
				pkt=new DatagramPacket(inBuf, inBuf.length);
				skt.receive(pkt);
				//提取接收到的分组数据并转换成字符串
				str1=new String(pkt.getData());
				str1=str1.trim();
				if(str1.length()>0)
				{
					int pot=pkt.getPort();
					System.out.println("远程端口："+pot);
					System.out.println("服务器已接收到信息："+str1);

				}
			}
		}catch(IOException e) {return;}
		}
}
