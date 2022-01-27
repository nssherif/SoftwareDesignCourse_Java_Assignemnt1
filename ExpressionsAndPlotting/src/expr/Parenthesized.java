package expr;

/**  
 * Represents a parenthesized class which inherits from 
 * the math operation abstract class which parenthesizes
 * an expression.
 * 
 * @author Negib Sherif
 *
 **/

public class Parenthesized extends MathOperation implements Expression{
	
	public Parenthesized (Expression a) {
		super(a);
	}

	@Override
	public double value(double x) {
		return this.getValue("Parenthesized", x);
	}
	
	@Override
	public String toString() {
		return this.getString("Parenthesized");
	}
}
