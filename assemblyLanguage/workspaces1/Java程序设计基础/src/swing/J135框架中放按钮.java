package swing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J135框架中放按钮 extends JFrame{
	public static void main(String[] args) {
		J135框架中放按钮 jfrm=new J135框架中放按钮();     //创建框架对象
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon ic=new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\中国心.jpg");
		JButton btn=new JButton("灿烂",ic);   //创建按钮对象
		//jfrm.setLayout(null);
		jfrm.setSize(200, 180);
		jfrm.setTitle("按钮类窗口");          //窗口标题
		/*/Container c=jfrm.getContentPane();
		c.setBackground(Color.yellow);/*/
		btn.setBounds(50,45,100,40);  //设置位置与大小
		btn.setToolTipText("我是按钮");    //光标停止时显示
		jfrm.add(btn);
		jfrm.setVisible(true);
	}

}
