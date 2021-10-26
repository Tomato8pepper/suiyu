package cn.itcast.day05.demo01;
/*
直接打印数组名称，得到的是数组对应的的，内存地址哈希值。
二进制：01
十进制：0123456789
十六进制：0123456789abcdef

访问数据元素的格式： 数组名称[下标] 下标从零开始；
*/
public class Demo04ArrayUse {
    public static void main(String[] args) {
        int[] array={10,20,30};
        //System.out.println(array);   //[I@50cbc42f   [数组，I int ,十六进制。
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==============");
        //也可以将数组元素交给一个变量；
        int num=array[0];
        System.out.println(num);
    }
}
