package Java������;

import java.io.IOException;
import java.net.*;
public class J184���������� {

	public static void main(String[] args) {
		J184���������� frm=new J184����������();

	}
	String strbuf=" ";
	SerThread st;
	public 	J184����������() {
		st=new SerThread() {};
		st.start();
	}
}
class SerThread extends Thread{
	public SerThread() {}
	public void run() {
		String str1;
		try {
			//ʹ��8000�˿� ����S0cket����
			DatagramSocket skt=new DatagramSocket(8000);
			System.out.print("��������:");
			//��ʾ�����������������
			System.out.println(InetAddress.getLocalHost().getHostName());
			while(true) {
				byte[] inBuf=new byte[256];
				//�����ǵõ���������ַ
				DatagramPacket pkt;
				//���������ý���pkt����Ľ�����Ϣ
				pkt=new DatagramPacket(inBuf, inBuf.length);
				skt.receive(pkt);
				//��ȡ���յ��ķ������ݲ�ת�����ַ���
				str1=new String(pkt.getData());
				str1=str1.trim();
				if(str1.length()>0)
				{
					int pot=pkt.getPort();
					System.out.println("Զ�̶˿ڣ�"+pot);
					System.out.println("�������ѽ��յ���Ϣ��"+str1);

				}
			}
		}catch(IOException e) {return;}
		}
}
