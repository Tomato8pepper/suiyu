package com.gem.t1joptionpane;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class T4 {

	public static void main(String[] args) {
		String[] options={"�ð���", "ȥһ�ߣ�" };
		JOptionPane.showOptionDialog(null, "����һ��Է���", "��ʾ", JOptionPane.YES_NO_OPTION,
				 JOptionPane.QUESTION_MESSAGE,  null, null, null);
		/*int i=JOptionPane.showOptionDialog(null, "����һ��Է���", "��ʾ", JOptionPane.YES_NO_OPTION,
				 JOptionPane.QUESTION_MESSAGE,  null, options, options[0]);
		System.out.println(i);*/
		
		
		/*String[] options2={ "����", "����", "ƹ����" };  
		String s = (String) JOptionPane.showInputDialog(null, "��ѡ����İ���:\n", "����",
				 JOptionPane.QUESTION_MESSAGE, new ImageIcon("icon.png") ,options2, options2[0]);
		System.out.println(s);*/
		
		String s1=JOptionPane.showInputDialog("��������İ��ã�");
		System.out.println(s1);
		
		
		
		Icon icon=new ImageIcon("icon.png");
		String s2=(String) JOptionPane.showInputDialog(null,"��������İ��ã�\n","title",JOptionPane.PLAIN_MESSAGE,icon,null,"��������");  
		System.out.println(s2);
	}

}
