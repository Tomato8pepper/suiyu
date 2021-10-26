package 我的BG;
import javax.swing.JOptionPane;
public class 你好呀 {
	public static void mian(String[] args) {
		JOptionPane.showMessageDialog(null, "做我的好朋友，好吗！");
		int n=JOptionPane.showConfirmDialog(null,"你答应吗？","答应",JOptionPane.YES_NO_OPTION);
		JOptionPane.showMessageDialog(null, "好的！");
	}

}
