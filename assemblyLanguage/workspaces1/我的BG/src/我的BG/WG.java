package �ҵ�BG;

import javax.swing.JOptionPane;

public class WG {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "��ѩ�����ѽ��", "�������", JOptionPane.PLAIN_MESSAGE);

		Object[] options = { "��ѽ��", "���ã�" };
		int m = JOptionPane.showOptionDialog(null, "���ҵ�֪���ò���ѽ��", "�������", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

		JOptionPane.showMessageDialog(null, "����Ӧ����?", "�������", JOptionPane.ERROR_MESSAGE);
		Object[] option1s = { "����", "����" };
		int o = JOptionPane.showOptionDialog(null, "��������һ�Σ����ҵ�֪���ò���ѽ��", "�������", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		
		
		
		JOptionPane.showMessageDialog(null, "��Ĳ���Ӧ����", "�������", JOptionPane.DEFAULT_OPTION);
		Object[] option2s = { "����", "����" };
		int p = JOptionPane.showOptionDialog(null, "����������һ�Σ����ҵ�֪���ò���ѽ��", "�������", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		JOptionPane.showMessageDialog(null, "����Ĳ���Ӧ�ң�", "�������", JOptionPane.WARNING_MESSAGE);
		Object[] optionals = { "��ѽ��", "�����ţ��ã�" };
		int n = JOptionPane.showOptionDialog(null, "�����Ӧ���ҵ�֪���ò��ã�", "�������", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		JOptionPane.showMessageDialog(null, "̫���ˣ������ڴ�Ӧ���ˣ�", "�������", JOptionPane.INFORMATION_MESSAGE);

	}
}
// 
//
//