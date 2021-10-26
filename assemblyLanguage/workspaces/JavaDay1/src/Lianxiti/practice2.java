package Lianxiti;
import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
			String a="",b="*",c=" ";
			int m,n;
			System.out.println("请输入一个整数:");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			for(m=1;m<n;m++) {
				if(m%2==0) {
				a=c+a+b;
			System.out.println(a+" ");
				}
			}
	}

}
