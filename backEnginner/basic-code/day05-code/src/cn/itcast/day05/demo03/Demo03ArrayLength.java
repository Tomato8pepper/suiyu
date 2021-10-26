package cn.itcast.day05.demo03;
/*
如何获得一个int数字，代表数组的长度。
格式：   数组名称.length
*/
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] array=new int[3];

        int[] arrayB={10,20,6,8,5,24,2,54,2};
        int len=arrayB.length;
        System.out.println("arrayB的数组的长度是："+len);
        System.out.println("==============");

        int[] arrayC=new int[3];
        System.out.println("arrayC.length");
        arrayC=new int[5];
        System.out.println(arrayC.length);
    }
}
