package Exception;
class CircleException extends Exception {
	double radius;

	CircleException(double r) {
		radius = r;
	}

	public String toString() {
		return "半径r=" + radius + "不是一个正数";

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
		System.out.println("圆面积=" + 3.14 * radius * radius);
	}
}

public class J97半径为负捕获抛出处理 {

	public static void main(String[] args) {
		Circle cir = new Circle();
		try {
			cir.seetRadius(-2.0);
		} catch (CircleException e) {
			System.out.println("自定义异常：" + e.toString() + "");
		}
		cir.show();
	}

}
