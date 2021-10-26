package swing;
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
public class J136复选框单选按钮 extends JFrame {
		static JFrame frm=new JFrame("复选框和单选按钮");
		static JCheckBox jchk1=new JCheckBox("斜体");   //创建复选框
		static JCheckBox jchk2=new JCheckBox("粗体",true);
		static JCheckBox jchk3=new JCheckBox("下划线");
		static JRadioButton jrb1=new JRadioButton("红色");     
		static JRadioButton jrb2=new JRadioButton("绿色",true);//创建单选框，初始状态选中
		static JRadioButton jrb3=new JRadioButton("蓝色");

		public static void main(String[] args) {
			ButtonGroup grp=new ButtonGroup();  //创建单选按钮组对象
			Container c=frm.getContentPane();
			c.setBackground(Color.yellow);
			frm.setSize(300,220);  // 框架大小
			frm.setLocation(200,150);
			frm.setLayout(null);
			jchk1.setBounds(20,20,150,20);  //复选框位置与大小
			jchk2.setBounds(20,40,150,20);
			jchk3.setBounds(20,60,150,20);
			jrb1.setBounds(20,80,150,20);  //单选按钮位置与大小
			jrb2.setBounds(20,100,150,20);
			jrb3.setBounds(20,120,150,20);
			grp.add(jrb1);
			grp.add(jrb2);
			grp.add(jrb3);
			frm.add(jchk1);
			frm.add(jchk2);
			frm.add(jchk3);
			frm.add(jrb1);
			frm.add(jrb2);
			frm.add(jrb3);
			frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frm.setVisible(true);
			
	}

}
