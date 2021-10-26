package com.gem.t2jframe;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//定义 一个窗体
public class T2 {
	
	private JFrame f;

	private JButton btnLogin;
	private JButton btnLogin2;
	
	public T2(){
		f=new JFrame("员工管理系统");
		btnLogin=new JButton("登录");
		btnLogin.setBackground(Color.orange);
		btnLogin2=new JButton("登录2");
		
		JPanel panel=new JPanel();
		panel.add(btnLogin);
		panel.setBackground(Color.PINK);

		panel.add(btnLogin2);
		
		f.setContentPane(panel);
		f.setSize(200, 200);
		f.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new T2();
	}
}
