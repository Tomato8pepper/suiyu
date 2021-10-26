package Java网络编程;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class J183Socket客户端 implements Runnable {
	Socket clientSocket;
	boolean flag = true;
	Thread connenThread;
	BufferedReader cin;
	DataOutputStream cout;

	public static void main(String[] args) {
		new J183Socket客户端().clientStart();

	}
	public void clientStart() {
		try {
			clientSocket = new Socket("localhost",8080);
			System.out.println("连接已经建立完毕！");
			while (flag) {
				InputStream is = clientSocket.getInputStream();
				cin = new BufferedReader(new InputStreamReader(is));
				OutputStream os = clientSocket.getOutputStream();
				cout = new DataOutputStream(os);
				connenThread = new Thread(this);
				connenThread.start();
				String aLine;
				while ((aLine = cin.readLine()) != null) {
					System.out.println(aLine);
					if (aLine.equals("bye")) {
						flag = false;
						connenThread.interrupt();
						break;
					}
				}
				cout.close();
				os.close();
				cin.close();
				clientSocket.close();
				System.exit(0);
			}

		}catch (Exception e) {
			System.out.println(e);
		}
	}
	public void run() {
		while (true) {
			try {
				int ch;
				while ((ch = System.in.read()) != -1) {
					cout.write((byte) ch);
					if (ch == '\n')
						cout.flush();
				}
			} catch (Exception e) {
				System.out.println(e);

			}
		}
	}
}
