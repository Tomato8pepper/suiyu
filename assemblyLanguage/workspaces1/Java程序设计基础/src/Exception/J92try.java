package Exception;

public class J92try {
	public static void main(String[] args) {
		int i;
		int[] a = { 1, 2, 3, 4 };
		for (i = 0; i < 5; i++) {
			try {
				System.out.println(" a[" + i + "]" + a[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�����������±�Խ���쳣" );
			} catch (ArithmeticException e) {
				System.out.println("�쳣�������ǣ�"+e);
			} catch (Exception e) {
				System.out.println("����"+e.getMessage()+"�쳣");
			}finally{
				System.out .println("   finally    i="+i);
			}
		}
			System.out .println("��������");
		}
	
}
