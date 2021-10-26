package swing;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
public class J132框架面板按钮 {
	public static void main(String[] args) {
		JFrame jfrm=new JFrame("明国，你真好！"); //框架
		jfrm.setSize(210,210);  // 框架的大小
		Image im=(new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\中国心.jpg")).getImage();  
		jfrm.setIconImage(im); //显示图标
		Container c=jfrm.getContentPane();
		c.setBackground(Color.BLUE);   //没什么用
		jfrm.setLocation(1000,500);  //在显示屏的位置
		JPanel jpan=new JPanel();   //创建面板对象
		jpan.setSize(200,200);  //面板的大小
		jpan.setLocation(30,30);  
		JButton bun=new JButton("我是按钮");// 按钮
		bun.setSize(80,170);     //横  竖
		bun.setLocation(20,30);//按钮的位置
		jfrm.setLayout(null);   //取消默认的布局管理器
		jpan.setLayout(null);
		jpan.add(bun);      //将命令按钮添加到面板当中
		jpan.setBorder(new TitledBorder("面板区"));//为面板对象设置边框
		jfrm.add(jpan);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
	}
}
