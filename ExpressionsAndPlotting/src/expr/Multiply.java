package expr;

/**  
 * Represents a Multiply class which inherits from 
 * the math operation abstract class which 
 * multiplies two expressions. 
 * 
 * @author Negib Sherif
 * @studentID 201904422
 * @email nssherif@mun.ca
 * @declaration This file was prepared by me and me alone. 
 *
 **/

public class Multiply extends MathOperation implements Expression{
	
	/** 
	 * Creates a multiply expression
	 */
	public Multiply (Expression a, Expression b) {
		super(a);
		this.getExpressions().add(b);
	}
	
	/** 
	 * Calculates the value of the expression, which
	 * in this case multiplies two expressions.
	 * 
	 * @param x: the value to be used for computation
	 * @return computed value.
	 */
	@Override
	public double value(double x) {
		return this.getValue("Multiply", x);
	}
	
	/** 
	 * Overrides the toString method to convert
	 * a multiply expression into a string
	 * 
	 * @return converted multiply expression as a string.
	 */
	@Override
	public String toString() {
		return this.getString("Multiply");
	}
}
