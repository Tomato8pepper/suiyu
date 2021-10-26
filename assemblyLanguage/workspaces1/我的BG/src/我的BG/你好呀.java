package 我的BG;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class 你好呀 {
	public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "你好啊");
	JOptionPane.showMessageDialog(null, "打不过我吧", "                      我就说你想干嘛",JOptionPane.WARNING_MESSAGE);
	JOptionPane.showMessageDialog(null, "没有办法.", "                         我就说你想干嘛",JOptionPane.ERROR_MESSAGE);
	JOptionPane.showMessageDialog(null, "我就是这么强大.", "                     我就说你想干嘛",JOptionPane.PLAIN_MESSAGE);  
	int n = JOptionPane.showConfirmDialog(null, "你高兴吗?", "标题",JOptionPane.YES_NO_OPTION);//i=0/1  
	
	Object[] options ={ "打不过！", "打不过！" }; 
	int m = JOptionPane.showOptionDialog(null, "你打得过我吗？", "标题",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]); 
	
	Object[] obj2 ={ "惨", "很惨", "非常惨" };  
	String s = (String) JOptionPane.showInputDialog(null,"请选择你被打的方式:\n", "爱好", JOptionPane.PLAIN_MESSAGE, new ImageIcon("icon.png"), obj2, "足球"); 
	
	JOptionPane.showInputDialog(null,"请输入你想被打的方式：\n","title",JOptionPane.PLAIN_MESSAGE,null,null,"在这输入");  
		
	}
	}
