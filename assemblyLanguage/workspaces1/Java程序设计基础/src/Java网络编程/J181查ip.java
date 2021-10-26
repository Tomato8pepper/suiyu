package Java网络编程;

import java.net.*;
public class J181查ip {
	InetAddress myIPAddress=null;
	InetAddress myServer=null;
	public static void main(String[] args) {
		J181查ip search=new J181查ip();
		System.out .println("您主机的ip地址为："+ search.myIP());
		System.out .println("服务器的ip地址为："+ search.serverIP());

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
