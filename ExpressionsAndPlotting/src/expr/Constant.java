package expr;

/**  
 * Represents a constant class which 
 * is basically a constant in an expression. 
 * 
 * @author Negib Sherif
 * @studentID 201904422
 * @email nssherif@mun.ca
 * @declaration This file was prepared by me and me alone. 
 *
 **/

public class Constant implements Expression {
	
	/**  
	 * Placeholder for the result of a constant
	 * which is the constant itself.
	 **/
	private double result;
	
	/**  
	 * Constructs a constant object which is 
	 * just a constant in an expression. 
	 **/
	public Constant (double value) {
		result = value;	
	}
	
	/**  
	 * Calculates the values of the constant
	 * which is just the constant itself.
	 * 
	 * @param x: number which is going to be the constant
	 * @return result of constant
	 **/
	@Override
	public double value(double x) {
		return result;
	}
	
	/**  
	 * Converts constant into string
	 * 
	 * @return converted string constant
	 **/
	@Override
	public String toString() {
		return Double.toString(result);
	}


}
