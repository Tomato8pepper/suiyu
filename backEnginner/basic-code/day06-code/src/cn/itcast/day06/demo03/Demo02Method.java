package cn.itcast.day06.demo03;
//数组作为方法参数使用
public class Demo02Method {
    public static void main(String[] args) {
        int[] array={5,10,15,20,100};
        int max=getMax(array);
        System.out.println("最大值是："+max);


    }
    public static int getMax(int[] array){
        int max=array[0];
        for (int i = 1; i <5 ; i++) {
            if(array[0]<array[i])
                max=array[i];

        }
        return max;
    }
}
