package event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;


public class J1413���ò˵����������ı�ǰ��ɫ�������� extends JFrame{
	private Color[] colorValues= {Color.BLACK,Color.BLUE,Color.RED,Color.GREEN};
	private JRadioButtonMenuItem[] colorItems,fonts;
	private JCheckBoxMenuItem[] styleItems;
	private JTextArea display;
	private ButtonGroup colorGroup,fontGroup;
	private int style;
	public J1413���ò˵����������ı�ǰ��ɫ��������() {
		super("�˵�Ӧ�ó���");
		JMenu fileMenu=new JMenu("�ļ�(F)");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		JMenuItem aboutItem=new JMenuItem("����...(A)");
		aboutItem.setMnemonic(KeyEvent.VK_A);
		aboutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, ActionEvent.CTRL_MASK));
		aboutItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				 JOptionPane.showMessageDialog(J1413���ò˵����������ı�ǰ��ɫ��������.this,"����һ���˵�Ӧ������","����", JOptionPane.PLAIN_MESSAGE);
				 
			}
		});
		fileMenu.add(aboutItem);
		JMenuItem exitItem=new JMenuItem("�˳�(x)");
		exitItem.setMnemonic(KeyEvent.VK_X);
		exitItem.addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent e)
			{System.exit(0);}
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
