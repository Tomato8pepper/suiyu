package Exception;
class CircleException extends Exception {
	double radius;

	CircleException(double r) {
		radius = r;
	}

	public String toString() {
		return "�뾶r=" + radius + "����һ������";

	}
}

class Circle {
	private double radius;

	public void seetRadius(double r) throws CircleException {
		if (r < 0)
			throw new CircleException(r);
		else
			radius = r;

	}

	public void show() {
		System.out.println("Բ���=" + 3.14 * radius * radius);
	}
}

public class J97�뾶Ϊ�������׳����� {

	public static void main(String[] args) {
		Circle cir = new Circle();
		try {
			cir.seetRadius(-2.0);
		} catch (CircleException e) {
			System.out.println("�Զ����쳣��" + e.toString() + "");
		}
		cir.show();
	}

}
