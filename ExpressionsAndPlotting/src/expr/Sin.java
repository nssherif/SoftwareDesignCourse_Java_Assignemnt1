package expr;

public class Sin implements Expression {
	
	private Expression exp1;
	
	private double result;
	
	public Sin (Expression a) {
		exp1 = a;
	}

	@Override
	public double value(double x) {
		result = Math.sin(exp1.value(x));
		return result;
	}
	
	@Override
	public String toString() {
		String str1 = exp1.toString();
		return ("sin " + str1);
	}

}
