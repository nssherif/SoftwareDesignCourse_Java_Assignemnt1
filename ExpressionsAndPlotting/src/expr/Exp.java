package expr;

/**  
 * Represents an exponential function class which inherits from 
 * the math operation abstract class which 
 * calculates the exponent of a function. 
 * 
 * @author Negib Sherif
 * @studentID 201904422
 * @email nssherif@mun.ca
 * @declaration This file was prepared by me and me alone.
 *
 **/

public class Exp extends MathOperation implements Expression {
	
	/** 
	 * Creates an exponential expression (e).
	 */
	public Exp (Expression a) {
		super(a);
	}
	
	/** 
	 * Calculates the value of the expression, which
	 * in this case gets the exponential of the expression.
	 * 
	 * @param x: the value to be used for computation
	 * @return computed value.
	 */
	@Override
	public double value(double x) {
		return this.getValue("e", x);
	}
	
	/** 
	 * Overrides the toString method to convert
	 * an exponential expression into a string
	 * 
	 * @return converted exponential expression as a string.
	 */
	@Override
	public String toString() {
		return this.getString("e");
	}

}
