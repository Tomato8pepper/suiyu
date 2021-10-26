package cn.itcast.day04.demo02;
/*
有参：当一个方法中需要一些数据条件，才能完成任务的时候。
无参：例如打印十次“你好”。
 */
public class demo03MethodParam {
    public static void main(String[] args) {
        method1(10,2);
        method2();
    }
    public static void method1(int a,int b){
        int result=a*b;
        System.out.println("结果是："+result);
    }
    public static void method2(){
        for (int i = 0; i < 3; i++) {
            System.out.println("你好，世界！" + i);
        }
    }
}
