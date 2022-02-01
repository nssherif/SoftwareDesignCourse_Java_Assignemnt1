package expr;

/**  
 * Represents an sin class which inherits from 
 * the math operation abstract class which 
 * calculates the sin of an expression. 
 * 
 * @author Negib Sherif
 * @studentID 201904422
 * @email nssherif@mun.ca
 * @declaration This file was prepared by me and me alone. 
 *
 **/

public class Sin extends MathOperation implements Expression {
	
	/** 
	 * Creates a sin expression
	 */
	public Sin (Expression a) {
		super(a);
	}
	
	/** 
	 * Calculates the value of the expression, which
	 * in this case calculates the sin of the expression.
	 * 
	 * @param x: the value to be used for computation
	 * @return computed value.
	 */
	@Override
	public double value(double x) {
		return this.getValue("Sin", x);
	}
	
	/** 
	 * Overrides the toString method to convert
	 * a sin expression into a string
	 * 
	 * @return converted sin expression as a string.
	 */
	@Override
	public String toString() {
		return this.getString("Sin");
	}

}
