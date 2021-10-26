package Lianxiti;
import java.util.Scanner;
public class practice1 {
	public static void main(String args[]) {
	String a="",b="*";
	int m,n;
	System.out.println("请输入一个整数:");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(m=1;m<n;m++) {
		a=a+b;
	System.out.println(a+" ");
	}
	}
}