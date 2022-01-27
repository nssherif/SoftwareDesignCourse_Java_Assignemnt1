package expr;

/**  
 * Represents an logarithm class which inherits from 
 * the math operation abstract class which 
 * calculates the logarithm of an expression. 
 * 
 * @author Negib Sherif
 *
 **/

public class Ln extends MathOperation implements Expression{
	
	public Ln (Expression a) {
		super(a);
	}

	@Override
	public double value(double x) {
		return this.getValue("Log", x);
	}
	
	@Override
	public String toString() {
		return this.getString("Log");
	}

}
