package event;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import event.J142�����ڲ���䵱������.MyActLister;
public class J143���������ڲ���䵱������ {
	static JFrame frm = new JFrame("�ľ����к�");
	static JButton bt = new JButton("����������ɫ");
	static JTextArea ta = new JTextArea("����һ��������������Ů����", 5, 20);
	public static void main(String[] args) {
		// �����ڲ������䵱�����ߣ������¼�Դbtע��
		bt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ta.setForeground(Color.CYAN);
			}
		});
		frm.setLayout(new FlowLayout());
		frm.setSize(400, 400);
		frm.add(ta);
		frm.add(bt);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);

	}

}
