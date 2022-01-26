package expr;

public class Multiply implements Expression{
	private Expression exp1;
	
	private Expression exp2;
	
	private double x;
	
	private double y;
	
	private double result;
	
	public Multiply (Expression a, Expression b) {
		exp1 = a;
		exp2 = b;
	}

	@Override
	public double value(double x) {
		this.x = exp1.value(x);
		y = exp2.value(x);
		result = this.x * y;
		return result;
	}
	
	@Override
	public String toString() {
		String str1 = exp1.toString();
		String str2 = exp2.toString();
		return (str1 + " * " + str2);
	}
}
