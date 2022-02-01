package expr;

/**  
 * Represents an tan class which inherits from 
 * the math operation abstract class which 
 * calculates the tan of an expression. 
 * 
 * @author Negib Sherif
 * @studentID 201904422
 * @email nssherif@mun.ca
 * @declaration This file was prepared by me and me alone.
 *
 **/

public class Tan extends MathOperation implements Expression{
	
	/** 
	 * Creates a tan expression
	 */
	public Tan (Expression a) {
		super(a);
	}
	
	/** 
	 * Calculates the value of the expression, which
	 * in this case get the tan of the expression.
	 * 
	 * @param x: the value to be used for computation
	 * @return computed value.
	 */
	@Override
	public double value(double x) {
		return this.getValue("Tan", x);
	}
	
	/** 
	 * Overrides the toString method to convert
	 * a tan expression into a string
	 * 
	 * @return converted tan expression as a string.
	 */
	@Override
	public String toString() {
		return this.getString("Tan");
	}

}
