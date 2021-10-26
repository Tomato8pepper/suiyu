package Á·Ï°;

public class neibulei {
	public void action(ISwim s) {
		s.swim();
	}

	public static void mian(String[] args) {
		neibulei n = new neibulei();
		n.action(new ISwim() {
			public void swim() {
				System.out.println("Óã¶ùÔÚÓÎÓ¾");
			}
		});
	}

}
