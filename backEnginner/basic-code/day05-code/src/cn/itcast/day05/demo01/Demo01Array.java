package cn.itcast.day05.demo01;
/*数组是一种容器，可以同时存放多个数据值。
数组的特点：
1.数组是一种引用类型
2.数组当中的多个数据，类型必须统一
3.数组的长度在程序运行期间不可改变

数组的初始化：在内存当中创建一个数组，并且向其中赋予一些默认值。

两种常见的初始化方式：
1.动态初始化（指定长度）
2.静态初始化（指定内容）

格式：  数据类型【】 数组名称=new 数据类型【数组长度】；
*/
public class Demo01Array {
    public static void main(String[] args) {
        /*int score1=100;
        int score2=98;
        int score3=99;
        System.out.println(score3);
        score3=100;
        System.out.println(score3);*/
        int[] arrayA=new int[300];
        double[] arrayB=new double[10];
        String[] arrayC=new String[5];
    }
}
