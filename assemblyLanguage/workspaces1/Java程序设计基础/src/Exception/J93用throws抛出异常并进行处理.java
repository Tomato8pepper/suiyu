package Exception;

public class J93��throws�׳��쳣�����д��� {

	public static void main(String[] args) {
		int a=5,b=0;
		try {
			if(b==0)
			throw new ArithmeticException(); //�׳��쳣
			else 
				System.out .println(a+"/"+b+"="+a/b);
			}
		catch (Exception e) {
			System.out .println("�쳣:"+e+"���׳���");
			e.printStackTrace();
		}
		
	}
}
