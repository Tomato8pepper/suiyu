package Java网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class J184客户端向服务器发送 {

	public static void main(String[] args) {
		J184客户端向服务器发送 frm=new J184客户端向服务器发送();
	}
	CliThread ct;
	public J184客户端向服务器发送() {
		ct=new CliThread() {};
		ct.start();
	}

}
class CliThread extends Thread{
	public CliThread() {}
	public void run() {
		String str1;
		String serverName="ZMGsuiyuComputer";
		System.out.println("请发送信息给服务器《"+serverName+"》");
		try {
			DatagramSocket skt=new DatagramSocket();
			DatagramPacket pkt;
			while(true) {
				BufferedReader buf;
				buf=new BufferedReader(new InputStreamReader(System.in));
				System.out.print("请输入信息:");
				str1=buf.readLine();
				byte[] outBuf=new byte[str1.length()];
				outBuf=str1.getBytes();
//				下面是得到服务器地址
				InetAddress address=InetAddress.getByName(serverName);
				pkt=new DatagramPacket(outBuf, outBuf.length,address,8000);
				skt.send(pkt);
			}
		}catch(IOException e) {}
	}
}