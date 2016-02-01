package friday;

public class Summator {
	private double a;
	private double b;

	public Summator(double x, double y) {
		setA(x);
		setB(y);
	}

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

	public double getSum() {
		return a + b;
	}
}
