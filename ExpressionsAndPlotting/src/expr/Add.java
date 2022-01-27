package expr;

/**  
 * Represents an add class which inherits from 
 * the math operation abstract class which 
 * adds two expressions. 
 * 
 * @author Negib Sherif
 *
 **/

public class Add extends MathOperation implements Expression{
	
	public Add (Expression a, Expression b) {
		super(a);
		this.getExpressions().add(b);
	}

	@Override
	public double value(double x) {
		return this.getValue("Add", x);
	}
	
	@Override
	public String toString() {
		return this.getString("Add");
	}

}
