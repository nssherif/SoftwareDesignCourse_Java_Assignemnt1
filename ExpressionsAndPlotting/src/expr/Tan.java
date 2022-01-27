package expr;

/**  
 * Represents an tan class which inherits from 
 * the math operation abstract class which 
 * calculates the tan of an expression. 
 * 
 * @author Negib Sherif
 *
 **/

public class Tan extends MathOperation implements Expression{
	
	
	public Tan (Expression a) {
		super(a);
	}

	@Override
	public double value(double x) {
		return this.getValue("Tan", x);
	}
	
	@Override
	public String toString() {
		return this.getString("Tan");
	}

}
