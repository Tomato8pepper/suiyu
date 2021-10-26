package 我的BG;

import javax.swing.JOptionPane;

public class WG {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "樟雪，你好呀！", "故事与酒", JOptionPane.PLAIN_MESSAGE);

		Object[] options = { "好呀！", "不好！" };
		int m = JOptionPane.showOptionDialog(null, "做我的知己好不好呀？", "故事与酒", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

		JOptionPane.showMessageDialog(null, "不答应我吗?", "故事与酒", JOptionPane.ERROR_MESSAGE);
		Object[] option1s = { "不好", "不好" };
		int o = JOptionPane.showOptionDialog(null, "那我再问一次：做我的知己好不好呀？", "故事与酒", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		
		
		
		JOptionPane.showMessageDialog(null, "真的不答应我吗？", "故事与酒", JOptionPane.DEFAULT_OPTION);
		Object[] option2s = { "不好", "不好" };
		int p = JOptionPane.showOptionDialog(null, "那我在在问一次：做我的知己好不好呀？", "故事与酒", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		JOptionPane.showMessageDialog(null, "真真的不答应我？", "故事与酒", JOptionPane.WARNING_MESSAGE);
		Object[] optionals = { "好呀！", "嗯嗯嗯，好！" };
		int n = JOptionPane.showOptionDialog(null, "那你答应做我的知己好不好？", "故事与酒", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		JOptionPane.showMessageDialog(null, "太好了，你终于答应我了！", "故事与酒", JOptionPane.INFORMATION_MESSAGE);

	}
}
// 
//
//