package cn.itcast.day04.demo04;
/*对于功能类似的方法来说，因为参数列表不一样，方法的重载（overlode），
多个方法的名称一样，但是参数列表不一样。
方法重载与下列因素相关：
1.参数个数不同
2.参数类型不同
3.参数的多类型顺序不同
方法重载与下列因素无关：
1.与参数名称无关。
2.与方法的返回值类型无关
*/
public class Demo01MethodOverlode {
    public static void main(String[] args) {
        System.out.println(sum(19,39));
        System.out.println(sum(1,2,3));
    }
    public static int sum(double a,double b){
        System.out.println("有两个参数的方法被执行");
        return (int) (a+b);
    }
//    public  static double sum(double a,double b){
//        return a+b;
//    }
    public static int sum(int a,int b,int c){
        System.out.println("有三个参数的方法被执行");
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
}
