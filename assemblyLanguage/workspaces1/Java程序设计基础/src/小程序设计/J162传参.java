package С�������;
import java.awt.Graphics;
import javax.swing.JApplet;
public class J162����  extends JApplet{
	private String v_name;
	private int v_age;
	public void init() {
		v_name=getParameter("vname");
		v_age=Integer.parseInt(getParameter("age"));
	}
	public void paint(Graphics g) {
		g.drawString("����:"+v_name+"; ����:"+v_age,10,20);
	}
}
