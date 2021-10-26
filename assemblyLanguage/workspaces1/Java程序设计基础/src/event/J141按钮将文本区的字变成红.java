package event;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class J141按钮将文本区的字变成红 extends JFrame implements ActionListener{
		
	static J141按钮将文本区的字变成红 frm=new J141按钮将文本区的字变成红();
	static JButton bt=new JButton("设置字体颜色");
	static JTextArea ta=new JTextArea("你是一个善良、美丽的女孩！",5,20);
	public static void main(String[] args) {
		bt.addActionListener(frm);        // 把监听者frm向事件源bt注册
		frm.setTitle("文静的男孩");
		frm.setLayout(new FlowLayout());
		frm.setSize(400,400);
		frm.add(ta);
		frm.add(bt);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) { //单击按钮bt事件发生时的操作
		ta.setForeground(Color.blue);   //将字变成红
	}
}
