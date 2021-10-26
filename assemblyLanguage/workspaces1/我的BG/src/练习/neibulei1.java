package Á·Ï°;

public class neibulei1 {
	public IPrint dest() {
		return new IPrint() {
			public void print1() {
				System.out.println("Hello werld!!");
			}

			public void IPrint() {
				System.out.println("print");

			}
		};
	}

	public static void main(String[] args) {
		neibulei1 n = new neibulei1();
		IPrint p = n.dest();
		p.print1();
	}

}
