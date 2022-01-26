package expr;

public class X implements Expression {
	
	private double x;

	@Override
	public double value(double x) {
		return this.x = x;
	}
	
	@Override
	public String toString() {
		return "x";
	}

}
