package expr;

/**  
 * Represents an sin class which inherits from 
 * the math operation abstract class which 
 * calculates the sin of an expression. 
 * 
 * @author Negib Sherif
 *
 **/

public class Sin extends MathOperation implements Expression {
	
	public Sin (Expression a) {
		super(a);
	}

	@Override
	public double value(double x) {
		return this.getValue("Sin", x);
	}
	
	@Override
	public String toString() {
		return this.getString("Sin");
	}

}
