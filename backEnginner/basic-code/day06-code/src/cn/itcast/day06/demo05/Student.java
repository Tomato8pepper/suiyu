package cn.itcast.day06.demo05;
/*
一个标准的类通常要有以下四个组成部分：
    1.所有成员变量都要使用private关键字来修饰
    2.为每一个成员变量编写一对getter/setter方法
    3.编写一个无参构造
    4.编写一个全残的构造方法

这样标准的类也叫做Java Bean
*/
public class Student {
    private String name; //姓名
    private int age;     //年龄

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
