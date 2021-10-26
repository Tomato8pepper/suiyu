package com.gem.t1joptionpane;

import javax.swing.JOptionPane;

public class T1 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "中国");
		int n=JOptionPane.showConfirmDialog(null,  "您确定要退出么？");
		System.out.println(n);
		if(n==0)
			System.out.println("你选择了 确定");
		else
			System.out.println("你选择了 取消");
		//只出现 2个:是、否？	
	}

}
