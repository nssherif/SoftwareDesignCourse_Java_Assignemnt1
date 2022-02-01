package expr;

/**  
 * Represents a parenthesized class which inherits from 
 * the math operation abstract class which parenthesizes
 * an expression.
 * 
 * @author Negib Sherif
 * @studentID 201904422
 * @email nssherif@mun.ca
 * @declaration This file was prepared by me and me alone. 
 *
 **/

public class Parenthesized extends MathOperation implements Expression{
	
	/** 
	 * Creates a parenthesized expression
	 */
	public Parenthesized (Expression a) {
		super(a);
	}
	
	/** 
	 * Calculates the value of the expression, which
	 * in this case just returns the experession
	 * 
	 * @param x: the value to be used for computation
	 * @return computed value.
	 */
	@Override
	public double value(double x) {
		return this.getValue("Parenthesized", x);
	}
	
	/** 
	 * Overrides the toString method to convert
	 * the parenthesized expression into a string
	 * 
	 * @return converted parenthesized expression as a string.
	 */
	@Override
	public String toString() {
		return this.getString("Parenthesized");
	}
}
