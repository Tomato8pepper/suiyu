package com.gem.t3component_emslogin;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class T2ImageIcon extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public T2ImageIcon(){
		super("��Ա��ʾ");

	    // ����f�����λ�ã�����Ϊnull������ʾ����Ļ�м�
        this.setLocationRelativeTo(null);
        // ���õ��û��ڴ˶Ի��������� "close" ʱĬ��ִ�еĲ���
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		ImageIcon ic1=new ImageIcon("xjp.jpg");
		JLabel lable1=new JLabel("ϰ��ƽ",ic1,JLabel.LEFT);
		c.add(lable1);
		ImageIcon ic2=new ImageIcon("xjp.jpg");
		JLabel lable2=new JLabel("ϰ��ƽ",ic2,JLabel.LEFT);
		lable2.setHorizontalTextPosition(JLabel.LEFT);
		lable2.setVerticalTextPosition(JLabel.TOP);
		c.add(lable2);
		ImageIcon ic3=new ImageIcon("ply.jpg");
		JLabel lable3=new JLabel("������",ic3,JLabel.LEFT);
		lable3.setHorizontalTextPosition(JLabel.CENTER);
		lable3.setVerticalTextPosition(JLabel.BOTTOM);
		c.add(lable3);
	}
	
	public static void main(String[] args) {
		T2ImageIcon t2=	new T2ImageIcon();
		t2.setSize(1000, 500 );
		t2.setVisible( true );
	}
	
}
