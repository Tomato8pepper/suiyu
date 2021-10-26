package cn.itcast.day06.demo02;
//对象作为方法参数来传递
public class Demo04PhonePram {
    public static void main(String[] args) {
        Phone one=new Phone();
        one.brand="苹果";
        one.price=8388.0;
        one.color="红色";
        method(one);

    }
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);

    }
}
