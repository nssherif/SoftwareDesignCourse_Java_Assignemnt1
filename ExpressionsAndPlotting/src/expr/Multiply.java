package expr;

/**  
 * Represents a Multiply class which inherits from 
 * the math operation abstract class which 
 * multiplies two expressions. 
 * 
 * @author Negib Sherif
 *
 **/

public class Multiply extends MathOperation implements Expression{
	
	public Multiply (Expression a, Expression b) {
		super(a);
		this.getExpressions().add(b);
	}

	@Override
	public double value(double x) {
		return this.getValue("Multiply", x);
	}
	
	@Override
	public String toString() {
		return this.getString("Multiply");
	}
}
