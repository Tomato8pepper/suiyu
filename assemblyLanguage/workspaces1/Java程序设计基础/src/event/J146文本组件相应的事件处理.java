package event;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class J146�ı������Ӧ���¼�����  extends JFrame implements ActionListener{
		
		private JLabel[] jlArray= {new JLabel("�û���"), new JLabel("��  ��")};//������ǩ����
		private JTextField jName=new JTextField();
		private JPasswordField jPassword=new JPasswordField();
		private JTextArea jText=new JTextArea("�����ڲ��ɱ༭",10,30);
		private JScrollPane jsp=new JScrollPane(jText);			
		
	public J146�ı������Ӧ���¼�����() {
		this.setLayout(null);
		jlArray[0].setBounds(20,10,50,25);
		jName.setBounds(70,10,170,25);
		jlArray[1].setBounds(20,30,50,25);
		jPassword.setBounds(70,35,170,25);
		jsp.setBounds(20,70,220,100);
		jText.setEnabled(false);
		jText.setDisabledTextColor(Color.RED);
		this.add(jsp);
		this.add(jlArray[0]);
		this.add(jlArray[1]);
		this.add(jName);
		this.add(jPassword);
		jName.addActionListener(this);
		jPassword.addActionListener(this);
		this.setTitle("�ı������Ӧ��");
		this.setResizable(false);
		this.setBounds(800,400,280,220);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (jName.getText().equals("abc")&& String.valueOf(jPassword.getPassword()).equals("123")) {
			jText.setEnabled(true);
			jText.setText("��ϲ�㣡��\n����,�����ڿ��Ա��༭�ˣ���");
			jText.setLineWrap(true);
		}
	}
	public static void main(String[] args) {
		J146�ı������Ӧ���¼����� frm=new J146�ı������Ӧ���¼�����();
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
