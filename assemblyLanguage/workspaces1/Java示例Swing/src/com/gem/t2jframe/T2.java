package com.gem.t2jframe;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//���� һ������
public class T2 {
	
	private JFrame f;

	private JButton btnLogin;
	private JButton btnLogin2;
	
	public T2(){
		f=new JFrame("Ա������ϵͳ");
		btnLogin=new JButton("��¼");
		btnLogin.setBackground(Color.orange);
		btnLogin2=new JButton("��¼2");
		
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
