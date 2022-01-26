package expr;

public class Cos implements Expression {
	
	private Expression exp1;
	
	private double result;
	
	public Cos (Expression a) {
		exp1 = a;
	}

	@Override
	public double value(double x) {
		result = Math.cos(exp1.value(x));
		return result;
	}
	
	@Override
	public String toString() {
		String str1 = exp1.toString();
		return ("cos " + str1);
	}

}
