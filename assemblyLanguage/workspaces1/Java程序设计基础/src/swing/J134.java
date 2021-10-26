package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class J134 {

	public static void main(String[] args) {
		JFrame jfrm=new JFrame("标签类窗口");
		JLabel jlab=new JLabel("哈哈，我是一个标签！",JLabel.CENTER);
		//jfrm.setLayout(null);
		Image im=(new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\中国心.jpg")).getImage();
		jfrm.setIconImage(im); 
		jfrm.setSize(300,200);
		//jfrm.setBackground(Color.BLUE);
		Container c=jfrm.getContentPane();
		c.setBackground(Color.yellow);//*/
		jlab.setOpaque(true);
		jlab.setBackground(Color.BLUE);
		jlab.setForeground(Color.CYAN);
		jlab.setLocation(80,60);
		jlab.setSize(130,30);
		jlab.setToolTipText("我被设置成不透明状态");
		Font fnt=new Font("Serief" ,Font.BOLD+Font.ITALIC,20);
		jlab.setFont(fnt);
		jfrm.add(jlab);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);


	}

}
