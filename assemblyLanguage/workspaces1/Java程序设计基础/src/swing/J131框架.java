package swing;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Image;
import javax.swing.*;
public class J131框架 extends Frame{
	static JFrame jfrm=new JFrame("明国，你好呀!");      //创建静态框架
	public static void main(String[] args) {
		JLabel lab=new JLabel("查茹茹是个大笨蛋！");        //设置一个标签对象
		Image im=(new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\中国心.jpg")).getImage(); //创建图标对象
		jfrm.setIconImage(im);     //显示图标
		jfrm.setSize(400,400);  // 框架大小
		jfrm.setLocation(800, 400);// 框架在显示屏的位置
		jfrm.add(lab);
		jfrm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);  //关闭按钮  
		jfrm.setVisible(true);//显示窗口
		Container c=jfrm.getContentPane(); // 添加窗口背景色
		c.setBackground(Color.yellow);
	}
}
