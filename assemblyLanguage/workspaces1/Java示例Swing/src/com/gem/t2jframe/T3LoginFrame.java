package com.gem.t2jframe;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class T3LoginFrame extends JFrame {
	

	private static final long serialVersionUID = 1L;
	//���ý����������
	public JPanel getGUI(){
		JPanel jp=new JPanel();
		jp.add(new JButton("��¼ "));
		return jp;
	}
	
	
	public static void main(String[] args) {
		T3LoginFrame frmLogin =new T3LoginFrame();
		
		frmLogin.setTitle("Ա������ϵͳ");
		frmLogin.setContentPane(frmLogin.getGUI());
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmLogin.setSize(300,200);
		frmLogin.setVisible(true);
	}
}
