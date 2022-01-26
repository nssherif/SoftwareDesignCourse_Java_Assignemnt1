package expr;

public class Constant implements Expression {
	private double result;
	
	public Constant (double value) {
		result = value;	
	}

	@Override
	public double value(double x) {
		return result;
	}
	
	@Override
	public String toString() {
		return Double.toString(result);
	}


}
