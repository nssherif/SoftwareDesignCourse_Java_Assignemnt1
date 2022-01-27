package expr;

/**  
 * Represents a divide class which inherits from 
 * the math operation abstract class which 
 * divides two expressions. 
 * 
 * @author Negib Sherif
 *
 **/

public class Divide extends MathOperation implements Expression{
	
	public Divide (Expression a, Expression b) {
		super(a);
		this.getExpressions().add(b);
	}

	@Override
	public double value(double x) {
		return this.getValue("Divide", x);
	}
	
	@Override
	public String toString() {
		return this.getString("Divide");
	}

}
