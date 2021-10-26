package swing;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import javax.swing.JFrame;
public class J138窗口中房选项卡并放图片  extends JFrame{
	JTabbedPane jtab=new JTabbedPane(JTabbedPane.TOP);//创建选项卡 上方
	public J138窗口中房选项卡并放图片() {
		JLabel[] lab=new JLabel[6];
		Icon pic;
		String title;
		for (int i=1;i<=5;i++) {
			pic=new ImageIcon("t"+i+".jpg");
			lab[i]=new JLabel();
			lab[i].setIcon(pic);
			title="第"+i+"页";
			jtab.add(title, lab[i]);
		}
		this.add(jtab);
	}
	public static void main(String[] args) {
		J138窗口中房选项卡并放图片 frm=new J138窗口中房选项卡并放图片();
		Container c=frm.getContentPane();
		c.setBackground(Color.blue);
		frm.setTitle("选项卡的应用");
		frm.setSize(300,300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);

	}

}
