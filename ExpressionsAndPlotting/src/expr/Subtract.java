package expr;

/**  
 * Represents a subtract class which inherits from 
 * the math operation abstract class which 
 * subtracts two expressions. 
 * 
 * @author Negib Sherif
 * @studentID 201904422
 * @email nssherif@mun.ca
 * @declaration This file was prepared by me and me alone.
 *
 **/

public class Subtract extends MathOperation implements Expression{
	
	/** 
	 * Creates a subtract expression
	 */
	public Subtract (Expression a, Expression b) {
		super(a);
		this.getExpressions().add(b);
	}
	
	/** 
	 * Calculates the value of the expression, which
	 * in this case subtracts two expressions.
	 * 
	 * @param x: the value to be used for computation
	 * @return computed value.
	 */
	@Override
	public double value(double x) {
		return this.getValue("Subtract", x);
	}
	
	/** 
	 * Overrides the toString method to convert
	 * a subtract expression into a string
	 * 
	 * @return converted subtract expression as a string.
	 */
	@Override
	public String toString() {
		return this.getString("Subtract");
	}

}
