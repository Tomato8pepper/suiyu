package 练习;
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.text.html.HTMLDocument.Iterator;
public class deidaixunhuan {
	public static void main(String[] args) {
		/*java.util.List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(6);
		list.add(9);
		for (Integer b : list) {
			System.out .println(b);
		}
		java.util.Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out .println(iterator.next());
		}*/
		System.out.println("请输入一个整数！");
		Scanner m=new Scanner(System.in);
		String m1=m.next();
		int i=Integer.parseInt(m1);  
		String []a= {"Experience","Experience","Experience"};
		if(i>1)
			System.out.println("Expression");
		else
			for(String s:a)
				System.out.println(s);
	}
}
