package cn.itcast.day06.demo03;

public class Demo01VariableDifference {
    String name;             //成员变量
    public void methodA(){
        int num=20;          //局部变量
        System.out.println(name);
        System.out.println(num);

    }
    public void methodB(int param){    //方法参数就是局部变量,再调用时候必定会被赋值的
        System.out.println(param);
        int age;
//        System.out.println(age);  错误写法没赋值不能直接使用
//        System.out.println(num);  超出作用域方法内
        System.out.println(name);
    }
}
