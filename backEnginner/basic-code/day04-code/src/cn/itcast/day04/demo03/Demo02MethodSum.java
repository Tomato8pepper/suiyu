package cn.itcast.day04.demo03;
//定义一个方法，用来求出1-100之间所有的数字和值。
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println(getSum());
    }
    public static int getSum(){
        int sum=0;
        for (int i = 0; i < 101; i++) {
            sum+=i;
        }
        return sum;
    }
}
