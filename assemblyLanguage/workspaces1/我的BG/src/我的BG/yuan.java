package 我的BG;
import java.util.Scanner;  
public class yuan {  
	    public static void main(String[] args)   
	    {  
	           new yuan().print();

	     }  

	    //画圆函数
	    void print() {
	        System.out.println("输入半径：");  
	        Scanner input=new Scanner(System.in);  
	        int r=input.nextInt();

	        System.out.println("输出：");  
	        for(int y=0; y<=2*r;y+=2){  

	            int x=(int)Math.round(r-Math.sqrt(r*r-(r-y)*(r-y)));

	            int l=2*(r-x);  
	            for(int i=0;i<=x;i++){  
	                System.out.print(" ");  
	            }  
	            System.out.print("*");

	            for(int i=0;i<=l;i++){  
	                System.out.print("*");  
	            }  
	            System.out.println("");  
	    }
	    }  
}  

