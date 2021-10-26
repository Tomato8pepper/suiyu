package com.gem.t1joptionpane;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameDemo2 {
	public static void main(String[] args) {
		JFrame f;
		JButton b;
		Container c;
		f=new JFrame("员工管理系统2");
		b=new JButton("登录");
		c=f.getContentPane();
		c.add(b);
		f.setSize(200, 200);
		f.setVisible(true);
	}
}
