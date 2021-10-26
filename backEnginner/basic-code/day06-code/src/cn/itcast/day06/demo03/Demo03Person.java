package cn.itcast.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person per=new Person();
        per.show();

        per.setAge(20);
        per.name="赵丽颖";
        per.show();
    }
}
