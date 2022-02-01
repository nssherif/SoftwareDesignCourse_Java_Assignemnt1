package expr;

/**  
 * Represents an add class which inherits from 
 * the math operation abstract class which 
 * adds two expressions. 
 * 
 * @author Negib Sherif
 * @studentID 201904422
 * @email nssherif@mun.ca
 * @declaration This file was prepared by me and me alone. 
 *
 **/

public class Add extends MathOperation implements Expression{
	
	/** 
	 * Creates an add expression
	 */
	public Add (Expression a, Expression b) {
		super(a);
		this.getExpressions().add(b);
	}
	
	/** 
	 * Calculates the value of the expression, which
	 * in this case adds two expressions.
	 * 
	 * @param x: the value to be used for computation
	 * @return computed value.
	 */
	@Override
	public double value(double x) {
		return this.getValue("Add", x);
	}
	
	/** 
	 * Overrides the toString method to convert
	 * an add expression into a string
	 * 
	 * @return converted add expression as a string.
	 */
	@Override
	public String toString() {
		return this.getString("Add");
	}

}
