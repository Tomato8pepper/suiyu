package Lesson1语法与位运算;
public class Y语法 {
	public static void main (String []args) {
		System.out.print("你好");
		System.out.println("java的八大数据类型");
		byte b;
		b=3;
		b=(byte)(b*3);
		System.out.println(b);
		short s;  //32768----32767
		int i;
		long l;
		char ch;
		//ch='a';
		ch=97;	
		System.out.println(ch);
		float f;
		f=1.4f;
		double d;
		boolean bool;
		bool=true;//false
		System.out.println(bool);
		if(true) {	
		}
		System.out.println("java的数组");
		int []num=new int[] {1,2,3};
		int []num1= {1,2,3};
		int []num3;
		num3=new int[3];
		num3[0]=1;
		num3[1]=2;
		num3[2]=3;
		System.out.println(num3[0]);
		
		int [][]n1=new int[][] {{2,2},{2,2}};
		int [][]n2={{2,2},{2,2}};
		int [][]n;
		n=new int[2][];
		n[0]=new int[2];
		n[1]=new int[3];
		n[0][0]=1;
		n[1][1]=2;
		System.out.println(n[0][0]);
		System.out.println(n[1][1]);
		
		System.out.println("java中的++i与i++");
		int i1=3;
		System.out.println(i1++);
		System.out.println(++i1);
		System.out.println(i1);
		int i3=3;
		int count=(i3++)+(i3++)+(i3++); //3+4+5
		int count1=(++i3)+(++i3)+(++i3); //7+8+9
		System.out.println(count);
		System.out.println(i3);
		System.out.println(count1);
		
		System.out.println("java中的语句");
		/*if(false)
		{
		}
		while(true)
		{
		}
		do
		{
		}while(true);
		for(int i2=0;i2<10;i2++)
		{      //i的作用域在大括号里面；
		}*/
	}
}
