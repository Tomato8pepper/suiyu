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
		//int n=JOptionPane.showOptionDialog(null, "请选择按钮", "选项对话框", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,  null,new Object[] {"按钮一","按钮二","按钮三"},"按钮一");
		J148 frm=new J148("确认对话框窗口");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		String str=inputName.getText();
		int n=JOptionPane.showConfirmDialog(this, "请确认您的输入是否正确","确认对话框",JOptionPane.YES_NO_OPTION);
		if(n==JOptionPane.YES_NO_CANCEL_OPTION)
			nameArea.append(str+"\n");
		else if(n==JOptionPane.NO_OPTION) 
			inputName.setText(null);
	}

}
