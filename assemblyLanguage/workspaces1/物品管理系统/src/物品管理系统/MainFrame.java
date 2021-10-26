package ��Ʒ����ϵͳ;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		super("��Ʒ����ϵͳV1(ZMG QQ:23665701)");
		JMenuBar menubar = new JMenuBar();
		ImageIcon ic = new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\�й���.jpg");
		Image im = (new ImageIcon("D:\\BIANXHENG\\workspaces1\\��Ʒ����ϵͳ\\456.jpg")).getImage();
		this.setIconImage(im);
		// ��Ʒ����:��ѯ��Ʒ �������Ʒ�� ��Ʒά��
		JMenu menu = new JMenu("��Ʒ����");

		JMenuItem item1 = new JMenuItem(" ��ѯ��Ʒ");
		item1.addActionListener(this);
		JMenuItem item2 = new JMenuItem(" �����Ʒ");
		item2.addActionListener(this);
		JMenuItem item3 = new JMenuItem(" ��Ʒά��");
		item3.addActionListener(this);
		

		setJMenuBar(menubar);
		menubar.add(menu);
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.addSeparator();
		JMenuItem item4 = new JMenuItem(" �˳�");
		item4.addActionListener(this);
		menu.add(item4);
		// ���Ź����������������ά��
		JMenu menu2 = new JMenu("�û�����");
		JMenuItem item21 = new JMenuItem(" �û����");
		item21.addActionListener(this);
		JMenuItem item22 = new JMenuItem(" �û�ά��");
		item22.addActionListener(this);
		menubar.add(menu2);
		menu2.add(item21);
		menu2.add(item22);

		Container c=this.getContentPane();
		c.setBackground(Color.cyan);
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MainFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// ���ʶ������ĸ�item��
		System.out.println(e.getActionCommand());
		System.out.println(e.getID());
		JFrame f = null;
		// ��ʾĳ������
		if (e.getActionCommand().contains("��ѯ��Ʒ")) {
			f = new GoodsShowFrame();
		}
		if (e.getActionCommand().contains("�����Ʒ")) {
			f = new GoodsAddFrame();
		}
		if (e.getActionCommand().contains("��Ʒά��")) {
			f = new GoodsMaintainFrame();
		}
		if (e.getActionCommand().contains("�û����")) {
			f = new UserShowFrame();
			}
		if (e.getActionCommand().contains("�û�ά��")) {
			f = new UserMaintainFrame();
			}
		if (e.getActionCommand().contains("�˳�")) {
			System.exit(0);
		}
		if (f != null) {
			f.setVisible(true);
		}
		
	}

}
