package cn.itcast.day04.demo03;
/*注意事项：
* return后面的返回值数据，必须和方法的返回值类型对应。
* 对于一个void没有返回值的方法，不能写return后面的返回值，只能写return自己。
* 方法中如果有多个return必须保证只有一个return会被执行。
*
* */
public class Demo04MethodNotice {
    public static void main(String[] args) {

    }
    public static  int method1(){
        return 10;
    }
    public static void method2(){
        return;
    }
    public static void method3(){
        System.out.println("aaa");
        System.out.println("bbb");
        return;
    }
    public static int getMax(int a,int b){
        if(a>b){
            return a;
        }
        else
            return b;
    }
}
