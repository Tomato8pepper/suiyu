package Exception;

public class J93用throws抛出异常并进行处理 {

	public static void main(String[] args) {
		int a=5,b=0;
		try {
			if(b==0)
			throw new ArithmeticException(); //抛出异常
			else 
				System.out .println(a+"/"+b+"="+a/b);
			}
		catch (Exception e) {
			System.out .println("异常:"+e+"被抛出了");
			e.printStackTrace();
		}
		
	}
}
