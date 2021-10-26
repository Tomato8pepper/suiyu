package event;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class J142利用内部类充当监听者 {
	static JFrame frm = new JFrame("文静的男孩");
	static JButton bt = new JButton("设置字体颜色");
	static JTextArea ta = new JTextArea("你是一个善良、美丽的女孩！", 5, 20);

	public static void main(String[] args) {
		bt.addActionListener(new MyActLister()); // 创建内部类对象充当监听者，并向事件源bt注册
		frm.setLayout(new FlowLayout());
		frm.setSize(400, 400);
		frm.add(ta);
		frm.add(bt);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);

	}

	// 定义内部类MyActLister,并实现ActionListener接口
	static class MyActLister implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ta.setForeground(Color.blue);
		}
	}
}
