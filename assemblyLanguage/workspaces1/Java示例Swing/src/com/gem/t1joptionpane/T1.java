package com.gem.t1joptionpane;

import javax.swing.JOptionPane;

public class T1 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "�й�");
		int n=JOptionPane.showConfirmDialog(null,  "��ȷ��Ҫ�˳�ô��");
		System.out.println(n);
		if(n==0)
			System.out.println("��ѡ���� ȷ��");
		else
			System.out.println("��ѡ���� ȡ��");
		//ֻ���� 2��:�ǡ���	
	}

}
