package cn.itcast.day04.demo02;
public class Demo01Method {
    public static void main(String[] args) {
      printMehtod();
    }
    public static void printMehtod(){
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
