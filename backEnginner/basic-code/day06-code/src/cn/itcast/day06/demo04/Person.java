package cn.itcast.day06.demo04;
//当方法的局部变量和成员变量同名时，根据就近原则优先使用局部变量。
//通过谁调用的方法，this就是谁。
public class Person {
    String name;
    public void sayHello(String name){
        System.out.println(name+"你好，我是："+this.name);
        System.out.println(this);//打印地址
    }
}
