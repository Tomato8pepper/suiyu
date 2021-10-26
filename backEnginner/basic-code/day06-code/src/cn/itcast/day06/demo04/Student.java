package cn.itcast.day06.demo04;
/*
构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法
格式：public 类名（参数）{}
注意： 1.构造方法名称必须和类名称完全一样
      2.构造方法没有返回值类型，void也没有。
      3.构造方法不能return一个具体的返回值
      4.如果没有编写任何构造方法，那么编译器会默认赠送一个构造方法，没有参数，方法体
        public Student（）{}
      5.一旦编写了至少一个构造方法，那么编译器不会有默认的。
      6.构造方法也是可以重载的
*/
public class Student {
    //成员变量
    private String name;
    private int age;

    //无参构造
    public Student(){
        System.out.println("无参构造方法被执行了");
    }
    //全参构造
    public Student(String name,int age){
        System.out.println("全参的构造方法被执行了");
        this.name=name;
        this.age=age;
    }

    //setter/getter
    public String getName(){
        return this.name;
    }
    public  void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
