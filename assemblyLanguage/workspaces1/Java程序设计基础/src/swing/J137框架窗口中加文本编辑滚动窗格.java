package swing;
import javax.swing.*;
public class J137��ܴ����м��ı��༭�������� extends JFrame {
	JTextField jtf = new JTextField("���ı��򲻿ɱ༭", 20);       
	static JPasswordField jpf = new JPasswordField("̫����3��", 30);
           //���������ı������jpf
	public J137��ܴ����м��ı��༭��������(String str) {
		super(str);  //���ø���Ĺ��췽��
		jtf.setBounds(20, 40, 140, 20);   
		jtf.setEditable(false);  //�����ı��в��ɱ༭
		add(jtf);
	}
	public static void main(String[] args) {
		J137��ܴ����м��ı��༭�������� frm=    //���ñ���Ĺ��췽��
				new J137��ܴ����м��ı��༭��������("�ı��༭���ܴ���");
		JTextArea jta=new JTextArea("���ð���my you",10,30);  //����10����ʮ�е��ı�������
		JScrollPane jsp=new JScrollPane(jta);        //��������������� ʹ��������jta
		frm.setLocation(200, 150);
		frm.setSize(240,220);  // ��ܴ�С
		frm.setLayout(null);
		jsp.setBounds(20,70,160,100);//���ù��������λ�ô�С
		jpf.setBounds(20,10,140,20); 	
		frm.add(jsp);
		frm.add(jpf);
		char[] password=jpf.getPassword();  //��ȡ�����������
		String str=new String(password);    //������ת�����ı�
		System.out .println("��������ǣ�"+password+"ת�����ı����ǣ�"+str);
		frm.setVisible(true);
//		frm.setResizable(false);   //���ô��ڴ�С���ɱ�
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
