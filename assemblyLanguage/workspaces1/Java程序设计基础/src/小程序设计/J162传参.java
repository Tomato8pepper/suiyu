package 小程序设计;
import java.awt.Graphics;
import javax.swing.JApplet;
public class J162传参  extends JApplet{
	private String v_name;
	private int v_age;
	public void init() {
		v_name=getParameter("vname");
		v_age=Integer.parseInt(getParameter("age"));
	}
	public void paint(Graphics g) {
		g.drawString("姓名:"+v_name+"; 年龄:"+v_age,10,20);
	}
}
