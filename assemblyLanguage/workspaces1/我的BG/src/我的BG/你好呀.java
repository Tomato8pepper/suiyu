package �ҵ�BG;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class ���ѽ {
	public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "��ð�");
	JOptionPane.showMessageDialog(null, "�򲻹��Ұ�", "                      �Ҿ�˵�������",JOptionPane.WARNING_MESSAGE);
	JOptionPane.showMessageDialog(null, "û�а취.", "                         �Ҿ�˵�������",JOptionPane.ERROR_MESSAGE);
	JOptionPane.showMessageDialog(null, "�Ҿ�����ôǿ��.", "                     �Ҿ�˵�������",JOptionPane.PLAIN_MESSAGE);  
	int n = JOptionPane.showConfirmDialog(null, "�������?", "����",JOptionPane.YES_NO_OPTION);//i=0/1  
	
	Object[] options ={ "�򲻹���", "�򲻹���" }; 
	int m = JOptionPane.showOptionDialog(null, "���ù�����", "����",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]); 
	
	Object[] obj2 ={ "��", "�ܲ�", "�ǳ���" };  
	String s = (String) JOptionPane.showInputDialog(null,"��ѡ���㱻��ķ�ʽ:\n", "����", JOptionPane.PLAIN_MESSAGE, new ImageIcon("icon.png"), obj2, "����"); 
	
	JOptionPane.showInputDialog(null,"���������뱻��ķ�ʽ��\n","title",JOptionPane.PLAIN_MESSAGE,null,null,"��������");  
		
	}
	}
