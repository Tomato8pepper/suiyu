package com.gem.t1joptionpane;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class T4 {

	public static void main(String[] args) {
		String[] options={"好啊！", "去一边！" };
		JOptionPane.showOptionDialog(null, "晚上一起吃饭？", "提示", JOptionPane.YES_NO_OPTION,
				 JOptionPane.QUESTION_MESSAGE,  null, null, null);
		/*int i=JOptionPane.showOptionDialog(null, "晚上一起吃饭？", "提示", JOptionPane.YES_NO_OPTION,
				 JOptionPane.QUESTION_MESSAGE,  null, options, options[0]);
		System.out.println(i);*/
		
		
		/*String[] options2={ "足球", "篮球", "乒乓球" };  
		String s = (String) JOptionPane.showInputDialog(null, "请选择你的爱好:\n", "爱好",
				 JOptionPane.QUESTION_MESSAGE, new ImageIcon("icon.png") ,options2, options2[0]);
		System.out.println(s);*/
		
		String s1=JOptionPane.showInputDialog("请输入你的爱好：");
		System.out.println(s1);
		
		
		
		Icon icon=new ImageIcon("icon.png");
		String s2=(String) JOptionPane.showInputDialog(null,"请输入你的爱好：\n","title",JOptionPane.PLAIN_MESSAGE,icon,null,"在这输入");  
		System.out.println(s2);
	}

}
