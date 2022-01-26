package expr;

public class Exp implements Expression {
	
	private Expression exp1;
	
	private double result;
	
	public Exp (Expression a) {
		exp1 = a;
	}

	@Override
	public double value(double x) {
		result = Math.exp(exp1.value(x));
		return result;
	}
	
	@Override
	public String toString() {
		String str1 = exp1.toString();
		return ("exp " + str1);
	}

}
