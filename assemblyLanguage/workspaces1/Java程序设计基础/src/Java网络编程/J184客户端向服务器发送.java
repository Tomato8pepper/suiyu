package Java������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class J184�ͻ�������������� {

	public static void main(String[] args) {
		J184�ͻ�������������� frm=new J184�ͻ��������������();
	}
	CliThread ct;
	public J184�ͻ��������������() {
		ct=new CliThread() {};
		ct.start();
	}

}
class CliThread extends Thread{
	public CliThread() {}
	public void run() {
		String str1;
		String serverName="ZMGsuiyuComputer";
		System.out.println("�뷢����Ϣ����������"+serverName+"��");
		try {
			DatagramSocket skt=new DatagramSocket();
			DatagramPacket pkt;
			while(true) {
				BufferedReader buf;
				buf=new BufferedReader(new InputStreamReader(System.in));
				System.out.print("��������Ϣ:");
				str1=buf.readLine();
				byte[] outBuf=new byte[str1.length()];
				outBuf=str1.getBytes();
//				�����ǵõ���������ַ
				InetAddress address=InetAddress.getByName(serverName);
				pkt=new DatagramPacket(outBuf, outBuf.length,address,8000);
				skt.send(pkt);
			}
		}catch(IOException e) {}
	}
}