package cn.itcast.day06.demo02;
//对象作为返回值
public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two=getPhone();
        System.out.println(two.price);
        System.out.println(two.brand);
        System.out.println(two.color);

    }
    public static Phone getPhone(){
        Phone one=new Phone();
        one.color="玫瑰金";
        one.price=8388.0;
        one.brand="苹果";
        return one;
    }
}
