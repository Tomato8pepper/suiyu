package Java������;

import java.net.*;
public class J181��ip {
	InetAddress myIPAddress=null;
	InetAddress myServer=null;
	public static void main(String[] args) {
		J181��ip search=new J181��ip();
		System.out .println("��������ip��ַΪ��"+ search.myIP());
		System.out .println("��������ip��ַΪ��"+ search.serverIP());

	}
	public InetAddress myIP() {
		try {
			myIPAddress=InetAddress.getLocalHost();
		}catch(UnknownHostException e){}
		return (myIPAddress);
	}
	public InetAddress serverIP() {
		try {
			myServer=InetAddress.getByName("www.tom.com");
		}catch(UnknownHostException e) {}
		return(myServer);
	}

}
