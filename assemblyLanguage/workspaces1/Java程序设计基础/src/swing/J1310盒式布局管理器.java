package swing;

import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J1310盒式布局管理器 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("盒式布局管理器");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setSize(220, 130);
		Container app = frm.getContentPane(); // 获取窗口的内容窗格
		BoxLayout b1 = new BoxLayout(app, BoxLayout./* (X_AXIS */Y_AXIS); // 创建盒式布局管理器对象
		frm.setLayout(b1);
		JButton but;
		for (int i = 1; i < 4; i++) {
			but = new JButton("按钮" + i); // 创建按钮对象
			// but.setToolTipText("我是帅哥!");
			frm.add(but);
		}
		frm.setVisible(true);
	}

}
