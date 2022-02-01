package expr;

/**  
 * Represents a divide class which inherits from 
 * the math operation abstract class which 
 * divides two expressions. 
 * 
 * @author Negib Sherif
 * @studentID 201904422
 * @email nssherif@mun.ca
 * @declaration This file was prepared by me and me alone. 
 *
 **/

public class Divide extends MathOperation implements Expression{
	
	/** 
	 * Creates a divide expression
	 */
	public Divide (Expression a, Expression b) {
		super(a);
		this.getExpressions().add(b);
	}

	/** 
	 * Calculates the value of the expression, which
	 * in this case divides two expressions.
	 * 
	 * @param x: the value to be used for computation
	 * @return computed value.
	 */
	@Override
	public double value(double x) {
		return this.getValue("Divide", x);
	}
	
	/** 
	 * Overrides the toString method to convert
	 * a divide expression into a string
	 * 
	 * @return converted divide expression as a string.
	 */
	@Override
	public String toString() {
		return this.getString("Divide");
	}

}
