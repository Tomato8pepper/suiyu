package cn.itcast.day06.demo01;

import java.util.Arrays;

/*
面向过程：
面向对象：
*/
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
//        要求打印格式为：[10，20，30，50，40]
//        使用面向过程：
        System.out.print("[");
        for(int i=0;i<array.length;i++){
            if(i==array.length-1)
                System.out.println(array[i]+"]");
            else
                System.out.print(array[i]+", ");

        }
        System.out.println("===================");
//        使用面向对象
        System.out.println(Arrays.toString(array));   //自动导包alt+enter
    }
}
