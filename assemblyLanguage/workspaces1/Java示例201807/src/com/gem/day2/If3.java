package com.gem.day2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class If3{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 	//����̨  ��ʾ�� 
		while (true) {
			System.out.print("��������� ��");
			int score = scanner.nextInt();
			if (score >= 60) {

				System.out.println("����");			//����̨  ��ʾ�� 
				JOptionPane.showMessageDialog(null, "����!","���ĳɼ�",JOptionPane.INFORMATION_MESSAGE);
			} else {
				System.out.println("������");	
				JOptionPane.showMessageDialog(null, "������!","���ĳɼ�",2);
				
			}
		}
	}
}
