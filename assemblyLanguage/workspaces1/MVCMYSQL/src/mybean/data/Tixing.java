package mybean.data;

public class Tixing {
	double a=1,b=1,h=2,area=1;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}
    public void setB(double b) {
		this.b = b;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double getArea() {
		area=(a+b)*h/2.0;
		return area;
	}
	

}
