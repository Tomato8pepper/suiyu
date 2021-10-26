package mybean.data;

public class Equation {
	double a,b,c;
	String rootOne,rootTwo;
	boolean squareEquation;
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
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public String getRootOne() {
		return rootOne;
	}
	public void setRootOne(String root) {
		this.rootOne = root;
	}
	public String getRootTwo() {
		return rootTwo;
	}
	public void setRootTwo(String root) {
		this.rootTwo = root;
	}
	public boolean isSquareEquation() {
		return squareEquation;
	}
	public void setSquareEquation(boolean b) {
		this.squareEquation =b;
	}

}
