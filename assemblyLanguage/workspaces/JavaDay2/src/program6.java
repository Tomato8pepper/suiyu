import javax.swing.JOptionPane;
public class program6 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "这是一个登陆界面");
		int n=JOptionPane.showConfirmDialog(null,"你一定要退出吗");
		if(n==0) {
			System.out.println("你选择了确定。");
		}
		else {
			System.out.println("你选择了取消。");
		}
	    String str=JOptionPane.showInputDialog("请你输入字符串:");
	    n=Integer.parseInt(str);
	    JOptionPane.showMessageDialog(null, "好吧。");
	    System.out.println("你输入的是："+n);
	    
	    
	}

}
