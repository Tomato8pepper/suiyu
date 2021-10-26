package 物品管理系统;
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
		super("物品管理系统V1(ZMG QQ:23665701)");
		JMenuBar menubar = new JMenuBar();
		ImageIcon ic = new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\中国心.jpg");
		Image im = (new ImageIcon("D:\\BIANXHENG\\workspaces1\\物品管理系统\\456.jpg")).getImage();
		this.setIconImage(im);
		// 物品管理:查询物品 ，添加物品， 物品维护
		JMenu menu = new JMenu("物品管理");

		JMenuItem item1 = new JMenuItem(" 查询物品");
		item1.addActionListener(this);
		JMenuItem item2 = new JMenuItem(" 添加物品");
		item2.addActionListener(this);
		JMenuItem item3 = new JMenuItem(" 物品维护");
		item3.addActionListener(this);
		

		setJMenuBar(menubar);
		menubar.add(menu);
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.addSeparator();
		JMenuItem item4 = new JMenuItem(" 退出");
		item4.addActionListener(this);
		menu.add(item4);
		// 部门管理：部门浏览，部门维护
		JMenu menu2 = new JMenu("用户管理");
		JMenuItem item21 = new JMenuItem(" 用户浏览");
		item21.addActionListener(this);
		JMenuItem item22 = new JMenuItem(" 用户维护");
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
		// 如何识别点了哪个item？
		System.out.println(e.getActionCommand());
		System.out.println(e.getID());
		JFrame f = null;
		// 显示某个界面
		if (e.getActionCommand().contains("查询物品")) {
			f = new GoodsShowFrame();
		}
		if (e.getActionCommand().contains("添加物品")) {
			f = new GoodsAddFrame();
		}
		if (e.getActionCommand().contains("物品维护")) {
			f = new GoodsMaintainFrame();
		}
		if (e.getActionCommand().contains("用户浏览")) {
			f = new UserShowFrame();
			}
		if (e.getActionCommand().contains("用户维护")) {
			f = new UserMaintainFrame();
			}
		if (e.getActionCommand().contains("退出")) {
			System.exit(0);
		}
		if (f != null) {
			f.setVisible(true);
		}
		
	}

}
