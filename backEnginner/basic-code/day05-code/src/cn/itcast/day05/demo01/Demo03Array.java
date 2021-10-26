package cn.itcast.day05.demo01;
/*
静态省略格式：
数据类型【】 数组名称={元素1...};
int
注意：
1.静态初始化标准格式可以拆分为两个步骤。
2.动态初始化也可以拆分为两个步骤。
3.静态初始化一旦使用省略模式，就不能拆分为两个步骤

使用建议：根据是否确定数组中的内容。
*/
public class Demo03Array {
    public static void main(String[] args) {
//        静态拆分
        int[] arrayA;
        arrayA=new int[]{5,10,15};
//        动态拆分
        int[] arrayB;
        arrayB=new int[3];
    }
}
