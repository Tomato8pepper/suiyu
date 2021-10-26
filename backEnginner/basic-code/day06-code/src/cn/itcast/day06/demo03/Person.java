package cn.itcast.day06.demo03;
/*定义年龄时无法阻止不合理的数值被设置进来。
可以用private关键字将需要保护的成员变量进行修饰。
一旦使用private进行修饰，在本类可以随意访问，但超出本类就不能直接访问了，
可以间接访问：就是定义一对getter/setter方法,好处是可以写条件。
setXxx有参数，getXxx有返回值；
*/
public class Person {
    String name;
    private int age;

    public void setAge(int num){
        if(num >=100 || num <=0) {
            System.out.println("数值不合理");
            age = 0;
        }
        else {
            age = num;
        }
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println("我叫:"+name+","+"年龄："+age);
    }
}
