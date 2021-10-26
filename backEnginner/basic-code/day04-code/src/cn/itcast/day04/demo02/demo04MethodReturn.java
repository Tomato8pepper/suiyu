package cn.itcast.day04.demo02;
//注意：对于有返回值的方法单独，打印，赋值都可以用；对于没有返回值的方法只能用单独调用。
public class demo04MethodReturn {
    public static void main(String[] args) {
        int num=getSum(10,20);
        System.out.println(getSum(3,4));
        //无返回值的方法
        printSum(3,5);
        //System.out.println(printSum(3,6));错误写法
    }
    //有返回值的方法。
    public static int getSum(int a,int b){
        int result=a+b;
        return result;
    }
    //没有返回值的方法。
    public static void printSum(int a,int b){
        int result=a+b;
        System.out.println("结果是："+result);
    }
}
