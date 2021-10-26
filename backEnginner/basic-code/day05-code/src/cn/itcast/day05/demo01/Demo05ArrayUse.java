package cn.itcast.day05.demo01;
/*
使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值，规则如下：
int         默认0
float       默认0.0
char        默认'\u0000'
boolean     默认false
引用类型     默认null

注意：
静态初始化也有默认值，只不过系统自动立马将默认值换掉了。
*/
public class Demo05ArrayUse {
    public static void main(String[] args) {
        //动态初始化一个数组
        int[] array=new int[3];
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("=============");

        //将1号元素换掉
        array[1]=123;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
