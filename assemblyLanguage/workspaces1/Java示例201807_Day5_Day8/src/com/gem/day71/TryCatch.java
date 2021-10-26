package com.gem.day71;

import javax.swing.JOptionPane;

public class TryCatch {
	public static void main(String[] args) {
		try {
			int a = 3, b = 0;
			System.out.println(a / b);
		} catch (ArithmeticException e) {

			//JOptionPane.showMessageDialog(null, "被除数不能为零!", "计算:",JOptionPane.ERROR_MESSAGE); 
			JOptionPane.showMessageDialog(null, "错误："+e.getMessage() , "计算:",JOptionPane.ERROR_MESSAGE); 
		}catch (Exception e) {
			System.out.println("计算有误！请重新输入！");

			JOptionPane.showMessageDialog(null, "计算有误！请重新输入！", "计算:",JOptionPane.ERROR_MESSAGE); 
		}finally {
			//收尾
			System.out.println("永远会被执行！");
		}
		
	}
}
