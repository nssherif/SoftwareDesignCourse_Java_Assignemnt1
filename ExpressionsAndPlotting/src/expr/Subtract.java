package expr;

/**  
 * Represents a subtract class which inherits from 
 * the math operation abstract class which 
 * subtracts two expressions. 
 * 
 * @author Negib Sherif
 *
 **/

public class Subtract extends MathOperation implements Expression{
	
	public Subtract (Expression a, Expression b) {
		super(a);
		this.getExpressions().add(b);
	}

	@Override
	public double value(double x) {
		return this.getValue("Subtract", x);
	}
	
	@Override
	public String toString() {
		return this.getString("Subtract");
	}

}
