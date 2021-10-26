package cn.itcast.day05.demo03;
/*
所有的引用类型变量，都可以赋值为一个null值，但是代表其中什么都没有
将会发生空指针异常：NullPointerException
解决：补上new;
*/
public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] array;
        array=new int[3];
        System.out.println(array[0]);

    }
}
