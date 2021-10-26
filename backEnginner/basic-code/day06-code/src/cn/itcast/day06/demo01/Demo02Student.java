package cn.itcast.day06.demo01;
/*
通常情况下，一个类并不能直接使用要创建一个对象
    1.导包 import cn.itcast.day06.demol01.Student;
    对于和当前类同一个包时，可以省略导报语句
    2.创建格式
    类名称 对象名=new 类名称（）；
    Student stu=new Student（）；
    3.两种使用情况
     对象名.成员变量名；
     对象名.成员方法名（参数）；

*/
public class Demo02Student {
    public static void main(String[] args) {
//        1.导包省略
//        2.创建对象
        Student stu=new Student();
//        3.使用
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("======");

//        改变对象当中的变量的值
        stu.name="胡歌";
        stu.age=30;
        System.out.println(stu.name);
        System.out.println(stu.age);
//        使用方法
        System.out.println("=========");
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
