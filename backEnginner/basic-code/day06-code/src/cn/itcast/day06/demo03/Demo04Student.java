package cn.itcast.day06.demo03;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("鹿晗");
        stu.setAge(10);
        stu.setMale(true);

        System.out.println("姓名是："+stu.getName());
        System.out.println("年龄是："+stu.getAge());
        System.out.println("是不是男的"+stu.isMale());

    }
}
