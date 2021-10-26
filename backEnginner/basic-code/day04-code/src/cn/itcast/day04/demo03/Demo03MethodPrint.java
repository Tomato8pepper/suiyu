package cn.itcast.day04.demo03;
/*
定义一个方法，用来打印指定次数的HelloWorld.
*/
public class Demo03MethodPrint {
    public static void main(String []args){
        printCount(10);
    }
    /*三要素：
    返回值类型：没有返回值。
    方法名称：printlCount
    参数列表：次数num

    */
    public static void printCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("hello,world!");
        }
    }
}
