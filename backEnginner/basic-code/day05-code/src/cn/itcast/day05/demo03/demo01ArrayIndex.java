package cn.itcast.day05.demo03;
/*
数组的索引从零开始，一直到数组的长度为-1为止
*/
public class demo01ArrayIndex {
    public static void main(String[] args) {
        int[] array={15,25,35};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //并不存在三号元素，所以发生异常。
        System.out.println(array[3]);
    }
}

