package expr;

/**  
 * Represents an logarithm class which inherits from 
 * the math operation abstract class which 
 * calculates the logarithm of an expression. 
 * 
 * @author Negib Sherif
 * @studentID 201904422
 * @email nssherif@mun.ca
 * @declaration This file was prepared by me and me alone. 
 *
 **/

public class Ln extends MathOperation implements Expression{
	
	/** 
	 * Creates a logarithmic expression
	 */
	public Ln (Expression a) {
		super(a);
	}
	
	/** 
	 * Calculates the value of the expression, which
	 * in this case is the logarithm of an expression.
	 * 
	 * @param x: the value to be used for computation
	 * @return computed value.
	 */
	@Override
	public double value(double x) {
		return this.getValue("Log", x);
	}
	
	/** 
	 * Overrides the toString method to convert
	 * a logarithm expression into a string
	 * 
	 * @return converted logarithm expression as a string.
	 */
	@Override
	public String toString() {
		return this.getString("Log");
	}

}
