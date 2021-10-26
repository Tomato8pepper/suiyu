package swing;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Beijing extends JFrame{
	private JLabel lblTitle;
	private JLabel lblName;
	private JTextField fldName;
	private JLabel lblPwd;
	private JPasswordField fldPwd;
	private Image image;
	private JButton btnLogin;

	private static final long serialVersionUID=-1588458291133087637L;

    public Beijing(){
		btnLogin=new JButton("登录");
		//lblTitle=new JLabel("员工管理系统");
		lblName=new JLabel("账号：");
		//fldName=new JTextField();
		//lblPwd=new JLabel("密码：");
		//fldPwd=new JPasswordField();
    	this.setTitle("设置窗体的背景颜色");

    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	this.setBounds(800 , 400, 550,400 );

		btnLogin.setBounds(80,270,100, 40);
		lblName.setBounds(10, 10, 30,30);
		lblName.setBackground(Color.BLUE);
		lblName.setOpaque(true);

		//fldName.setBounds(100, 100, 150, 30);
		//lblPwd.setBounds(50, 150, 50, 30);
		//fldPwd.setBounds(100, 150,150, 30);
    	JPanel contentPane=new JPanel(){

    		@Override

    		public void paint(Graphics g) {

    			ImageIcon icon=new ImageIcon("D:\\BIANXHENG\\workspaces1\\物品管理系统\\789.jpg");

    	 image=icon.getImage();

    	 g.drawImage(image, 0,0,null);

    			// TODO Auto-generated method stub

    			

    		}

    	};	 
    	this.add(btnLogin);
    	this.add(contentPane);
    	this.setVisible(true);
    	//this.add(lblTitle);
    	this.add(lblName);
    	//this.add(fldName);
    	//this.add(lblPwd);
    	//this.add(fldPwd);
    }

    

    

    public static void main(String[]args){

    	Beijing example=new Beijing();

 

    }
}