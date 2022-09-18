public class index {
    public static void main(String[] args) {
        Threa th = new Threa();
        th.start();
        for (int i = 0; i <20 ; i++) {
            System.out.println("main:"+i);
        }
    }
}
