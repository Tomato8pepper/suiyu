package com.gem.swing;

import javax.swing.JOptionPane;

public class T3 {
	
	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "�й�");  
		//JOptionPane.showMessageDialog(null, "������", "�й���ţ��У",JOptionPane.WARNING_MESSAGE); 
		//JOptionPane.showMessageDialog(null, "��ʾ��Ϣ.", "����",JOptionPane.PLAIN_MESSAGE);  
		//JOptionPane.showMessageDialog(null, "�ʺŻ��������!\r\n�������룡", Util.SYS_TITLE,JOptionPane.ERROR_MESSAGE);
		//JOptionPane.showMessageDialog(null, "�ʺŻ��������!\r\n�������룡", Util.SYS_TITLE,3);
		
		//0,1,2,3
		/* public static final int  ERROR_MESSAGE = 0;
	    *//** Used for information messages. *//*
	    public static final int  INFORMATION_MESSAGE = 1;
	    *//** Used for warning messages. *//*
	    public static final int  WARNING_MESSAGE = 2;
	    *//** Used for questions. *//*
	    public static final int  QUESTION_MESSAGE = 3;*/
		

		//int n = JOptionPane.showConfirmDialog(null, "�������?", "����",JOptionPane.DEFAULT_OPTION);
		//int n = JOptionPane.showConfirmDialog(null, "�������?", "����",JOptionPane.YES_NO_OPTION);
		//int n = JOptionPane.showConfirmDialog(null, "�������?", "����",JOptionPane.YES_NO_CANCEL_OPTION);
		int n = JOptionPane.showConfirmDialog(null, "�������?", "����",JOptionPane.OK_CANCEL_OPTION);
		System.out.println(n);
		
		/*   public static final int         DEFAULT_OPTION = -1;
		    *//** Type used for <code>showConfirmDialog</code>. *//*
		    public static final int         YES_NO_OPTION = 0;
		    *//** Type used for <code>showConfirmDialog</code>. *//*
		    public static final int         YES_NO_CANCEL_OPTION = 1;
		    *//** Type used for <code>showConfirmDialog</code>. *//*
		    public static final int         OK_CANCEL_OPTION = 2;*/
	}

}
