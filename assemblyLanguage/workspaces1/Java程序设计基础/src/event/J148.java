package event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class J148 extends JFrame implements ActionListener{
	JTextField inputName;
	JTextArea nameArea;
	public J148(String s) {
		super(s);
		inputName=new JTextField(20);
		inputName.addActionListener(this);
		nameArea=new JTextArea();
		add(inputName,BorderLayout.NORTH);
		add(nameArea,BorderLayout.CENTER);
		setBounds(50,50,300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		//int n=JOptionPane.showOptionDialog(null, "��ѡ��ť", "ѡ��Ի���", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,  null,new Object[] {"��ťһ","��ť��","��ť��"},"��ťһ");
		J148 frm=new J148("ȷ�϶Ի��򴰿�");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		String str=inputName.getText();
		int n=JOptionPane.showConfirmDialog(this, "��ȷ�����������Ƿ���ȷ","ȷ�϶Ի���",JOptionPane.YES_NO_OPTION);
		if(n==JOptionPane.YES_NO_CANCEL_OPTION)
			nameArea.append(str+"\n");
		else if(n==JOptionPane.NO_OPTION) 
			inputName.setText(null);
	}

}
