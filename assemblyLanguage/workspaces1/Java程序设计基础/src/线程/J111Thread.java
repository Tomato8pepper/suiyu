package �߳�;
class MyThread extends Thread{
	private String who;

	public MyThread(String str) {
		who=str;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				sleep((int)(1000*Math.random()));
			}catch(InterruptedException e) {}
			System.out .println(who+"�������У���");
		}
	}
	
}
public class J111Thread{
	public static void mian() {
		MyThread you=new MyThread("��");
		MyThread she=new MyThread("��");
		you.start();
		she.start();
		System.out.println("������main()���н�����");
	}
}
