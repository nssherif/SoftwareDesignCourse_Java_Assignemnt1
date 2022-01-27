package expr;

/**  
 * Represents an exponential function class which inherits from 
 * the math operation abstract class which 
 * calculates the exponent of a function. 
 * 
 * @author Negib Sherif
 *
 **/

public class Exp extends MathOperation implements Expression {
	
	public Exp (Expression a) {
		super(a);
	}

	@Override
	public double value(double x) {
		return this.getValue("e", x);
	}
	
	@Override
	public String toString() {
		return this.getString("e");
	}

}
