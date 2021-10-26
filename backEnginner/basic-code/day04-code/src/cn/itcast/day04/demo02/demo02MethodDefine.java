package cn.itcast.day04.demo02;
/*
方法好比一个工厂如钢铁工厂（原料：铁，煤炭等，产出物：钢铁建材）
  参数：原料。
  返回值：产出物。
  格式：   修饰符  返回值类型   方法名称 （参数类型  参数名称，...）{
                    方法体
                     return 返回值；
           }
注意：方法名称：小驼峰式
      参数类型：进入方法的数据是什么类型
      参数名称：进入方法的数据对应的变量名称
      return：两个作用，第一停止当前方法，第二将后面的返回值还给调用处
          返回值和方法前面的返回值类型保持对应。
      方法的三种调用格式：
        （1）单独调用。 方法名称（参数）
        （2）打印调用。 system.out.println（方法名称（参数））
        （3）赋值调用。
         返回值类型为void的只能用单独调用。
*/
//定义两int数字相加

public class demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(10,20);
        System.out.println("================");
        //打印调用
        System.out.println(sum(33,20));
        System.out.println("===============");
        //赋值调用
        int m=sum(30,29);
        System.out.println(m);
    }
    public static int sum(int a,int b){
        System.out.println("方法执行了");
        int result=a+b;
        return result;
    }
}
