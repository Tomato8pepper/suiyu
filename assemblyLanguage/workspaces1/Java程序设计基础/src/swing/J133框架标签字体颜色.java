package swing;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class J133��ܱ�ǩ������ɫ {
	public static void main(String[] args) {
		JFrame jfrm=new JFrame("��ǩ�ര��");   //
		JLabel jlab=new JLabel("����������һ����ǩ��",JLabel.CENTER);
		jfrm.setLayout(null);
		Image im=(new ImageIcon("C:\\Users\\ZHAMINGGUO\\Desktop\\�й���.jpg")).getImage();
		jfrm.setIconImage(im); 
		jfrm.setSize(300,200);
		jfrm.setBackground(Color.yellow);
		/*Container c=jfrm.getContentPane();
		c.setBackground(Color.yellow);*/
		jlab.setOpaque(true);
		jlab.setBackground(Color.GREEN);
		jlab.setForeground(Color.CYAN);
		jlab.setLocation(80,60);
		jlab.setSize(130,30);
		Font fnt=new Font("Serief" ,Font.BOLD+Font.ITALIC,20); //�����������
		jlab.setFont(fnt);           //���ñ�ǩ�ϵ�����
		jfrm.add(jlab);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);

	}

}
