package cn.itcast.day06.demo02;

public class Demo02PhoneTwo {
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
        System.out.println("=========");

        Phone two=new Phone();
//        3.使用成员
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("=========");

        two.brand="三星";
        two.price=45.3;
        two.color="蓝色";
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("=========");

        two.call("欧巴");
        two.sendMessage();
    }
}
