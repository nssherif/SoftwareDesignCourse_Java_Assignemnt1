package expr;

/**  
 * Represents a Cos class which inherits from 
 * the math operation abstract class which 
 * calculates the Cos of an expression. 
 * 
 * @author Negib Sherif
 * @studentID 201904422
 * @email nssherif@mun.ca
 * @declaration This file was prepared by me and me alone.
 *
 **/

public class Cos extends MathOperation implements Expression {
	
	/** 
	 * Creates a cos expression
	 */
	public Cos (Expression a) {
		super(a);
	}
	
	/** 
	 * Calculates the value of the expression, which
	 * in this case gets the cos of an expression.
	 * 
	 * @param x: the value to be used for computation
	 * @return computed value.
	 */
	@Override
	public double value(double x) {
		return this.getValue("Cos", x);
	}
	
	/** 
	 * Overrides the toString method to convert
	 * a cos expression into a string
	 * 
	 * @return converted cos expression as a string.
	 */
	@Override
	public String toString() {
		return this.getString("Cos");
	}

}
