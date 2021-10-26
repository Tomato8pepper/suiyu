package com.gem.t1joptionpane;


import javax.swing.JOptionPane;

public class T2 {

	public static void main(String[] args) {
		while (true) {
			String myScore=JOptionPane.showInputDialog(null,"请输入分数 ：");
			int score=Integer.parseInt(myScore);
			if (score >= 60) {
				JOptionPane.showMessageDialog(null, "及格!","您的成绩",JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "不及格!","您的成绩",2);
				
			}
		}
	}
}
