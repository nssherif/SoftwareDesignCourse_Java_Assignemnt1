package expr;

public class Parenthesized implements Expression{
	private Expression exp1;
	
	private double x;
	
	public Parenthesized (Expression a) {
		exp1 = a;
	}

	@Override
	public double value(double x) {
		this.x = exp1.value(x);
		return this.x;
	}
	
	@Override
	public String toString() {
		String str1 = exp1.toString();		
		return ("(" + str1 + ")");
	}
}
