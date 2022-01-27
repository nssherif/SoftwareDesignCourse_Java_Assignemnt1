package expr;

/**  
 * Represents an Cos class which inherits from 
 * the math operation abstract class which 
 * calculates the Cos of an expression. 
 * 
 * @author Negib Sherif
 *
 **/

public class Cos extends MathOperation implements Expression {
	
	public Cos (Expression a) {
		super(a);
	}

	@Override
	public double value(double x) {
		return this.getValue("Cos", x);
	}
	
	@Override
	public String toString() {
		return this.getString("Cos");
	}

}
