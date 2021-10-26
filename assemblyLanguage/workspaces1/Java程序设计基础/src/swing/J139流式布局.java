package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class J139流式布局 extends JFrame {
	static JFrame frm=new JFrame("流式布局设置管理器FlowLayout");
	public static void main(String[] args) {
		FlowLayout flow=new FlowLayout(FlowLayout.CENTER,5,10);
		JButton but=new JButton("按钮");
		JLabel lab=new JLabel("我是一个可爱的标签");
		frm.setLocation(800, 400);     //在显示屏的位置
		frm.setLayout(flow);          //设置流式布局
		frm.setSize(260, 150);
		frm.add(but);      //添加按钮组件
		frm.add(lab);          //添加标签1
		frm.add(new JTextField("流式布局策略 FlowLayout",18));          //添加文本框组件
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
	

}
