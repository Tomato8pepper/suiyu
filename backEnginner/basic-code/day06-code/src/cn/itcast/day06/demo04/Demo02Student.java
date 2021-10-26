package cn.itcast.day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {

        //无参构造
        Student stu1 = new Student(); //Student()就是构造方法名。
        //全参构造
        Student stu2 = new Student("赵丽颖", 20);

        System.out.println("姓名："+stu2.getName()+"，年龄："+stu2.getAge());
        //如果需要改变对象当中的成员变量的值，还是需要setter方法。
    }
}
