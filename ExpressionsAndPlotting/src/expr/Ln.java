package expr;

public class Ln implements Expression{
	private Expression exp1;
	
	private double result;
	
	public Ln (Expression a) {
		exp1 = a;
	}

	@Override
	public double value(double x) {
		result = Math.log(exp1.value(x));
		return result;
	}
	
	@Override
	public String toString() {
		String str1 = exp1.toString();
		return ("ln " + str1);
	}

}
