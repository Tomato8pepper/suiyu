package cn.itcast.day06.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
//        1.导包,位于同一包下,省略导包语句
//        2.创建对象
        Phone one=new Phone();
//        3.使用成员
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("=========");

        one.brand="华为";
        one.price=123.3;
        one.color="红色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("=========");

        one.call("张三");
        one.sendMessage();
    }
}
