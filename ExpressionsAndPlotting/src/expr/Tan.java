package expr;

public class Tan implements Expression{
	
	private Expression exp1;
	
	private double result;
	
	public Tan (Expression a) {
		exp1 = a;
	}

	@Override
	public double value(double x) {
		result = Math.tan(exp1.value(x));
		return result;
	}
	
	@Override
	public String toString() {
		String str1 = exp1.toString();
		return ("tan " + str1);
	}

}
