package event;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class J147 extends JFrame{
	static JLabel lab=new JLabel();
	static J147 frm=new J147();
	static MyWinListener winlist=new MyWinListener();

	public static void main(String[] args) {
		frm.setLayout(null);
		frm.setTitle("窗口事件");
		frm.setBounds(120,50,260,150);
		lab.setBounds(15,10,150,50);
		frm.add(lab);
		frm.addWindowListener(winlist);
		frm.setVisible(true);
		
	}
	static class MyWinListener implements WindowListener{
		public void windowOpened(WindowEvent e) {
			lab.setText("打开新窗口");
		}
		public void windowActivated(WindowEvent e) {
			lab.setText("窗口被激活");
		}
		public void windowIconified(WindowEvent e) {
			frm.setTitle("窗口被最小化");
		}
		public void windowDeiconified(WindowEvent e) {
			frm.setTitle("窗口被还原成正常大小");
		}
		public void windowClosing(WindowEvent e) {	
			frm.dispose();
			System.exit(0);
		}
		public void windowDeactivated(WindowEvent e) {	

		}
		public void windowClosed(WindowEvent e) {	
		}
	}

}
