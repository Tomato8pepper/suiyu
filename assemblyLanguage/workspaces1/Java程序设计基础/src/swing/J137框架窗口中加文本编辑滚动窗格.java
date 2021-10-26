package swing;
import javax.swing.*;
public class J137框架窗口中加文本编辑滚动窗格 extends JFrame {
	JTextField jtf = new JTextField("该文本框不可编辑", 20);       
	static JPasswordField jpf = new JPasswordField("太空人3号", 30);
           //创建密码文本行组件jpf
	public J137框架窗口中加文本编辑滚动窗格(String str) {
		super(str);  //调用父类的构造方法
		jtf.setBounds(20, 40, 140, 20);   
		jtf.setEditable(false);  //设置文本行不可编辑
		add(jtf);
	}
	public static void main(String[] args) {
		J137框架窗口中加文本编辑滚动窗格 frm=    //调用本类的构造方法
				new J137框架窗口中加文本编辑滚动窗格("文本编辑功能窗口");
		JTextArea jta=new JTextArea("您好啊，my you",10,30);  //创建10行三十列的文本区对象
		JScrollPane jsp=new JScrollPane(jta);        //创建滚动窗格对象 使其内容是jta
		frm.setLocation(200, 150);
		frm.setSize(240,220);  // 框架大小
		frm.setLayout(null);
		jsp.setBounds(20,70,160,100);//设置滚动窗格的位置大小
		jpf.setBounds(20,10,140,20); 	
		frm.add(jsp);
		frm.add(jpf);
		char[] password=jpf.getPassword();  //获取密码框中内容
		String str=new String(password);    //将密码转换成文本
		System.out .println("今天口令是："+password+"转换成文本后是："+str);
		frm.setVisible(true);
//		frm.setResizable(false);   //设置窗口大小不可变
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
