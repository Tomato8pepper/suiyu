package com.gem.t1joptionpane;


import javax.swing.JOptionPane;

public class T2 {

	public static void main(String[] args) {
		while (true) {
			String myScore=JOptionPane.showInputDialog(null,"��������� ��");
			int score=Integer.parseInt(myScore);
			if (score >= 60) {
				JOptionPane.showMessageDialog(null, "����!","���ĳɼ�",JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "������!","���ĳɼ�",2);
				
			}
		}
	}
}
