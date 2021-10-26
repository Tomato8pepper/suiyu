package cn.itcast.day06.demo03;
/*
对于基本类型当中的Boolean值，getter方法一定要写成isXxx的形式，而setter方法形式不变
*/
public class Student {
    private String name;
    private int age;
    private boolean male; //是不是男的

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
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
