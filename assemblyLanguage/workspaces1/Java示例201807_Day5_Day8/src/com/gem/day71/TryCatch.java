package com.gem.day71;

import javax.swing.JOptionPane;

public class TryCatch {
	public static void main(String[] args) {
		try {
			int a = 3, b = 0;
			System.out.println(a / b);
		} catch (ArithmeticException e) {

			//JOptionPane.showMessageDialog(null, "����������Ϊ��!", "����:",JOptionPane.ERROR_MESSAGE); 
			JOptionPane.showMessageDialog(null, "����"+e.getMessage() , "����:",JOptionPane.ERROR_MESSAGE); 
		}catch (Exception e) {
			System.out.println("�����������������룡");

			JOptionPane.showMessageDialog(null, "�����������������룡", "����:",JOptionPane.ERROR_MESSAGE); 
		}finally {
			//��β
			System.out.println("��Զ�ᱻִ�У�");
		}
		
	}
}
