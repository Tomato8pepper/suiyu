package com.gem.t2jframe;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

//���� һ������
public class T1 {
	
	private JFrame f;
	private Container c;

	private JButton btnLogin;
	
	public T1(){
		f=new JFrame("Ա������ϵͳ");
		btnLogin=new JButton("��¼");
		c=f.getContentPane();
		c.add(btnLogin);
		f.setSize(2000, 2000);
		f.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new T1();
	}
}
