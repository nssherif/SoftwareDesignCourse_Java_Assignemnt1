package expr;

/**  
 * Represents a X class which 
 * is basically a variable in an expression. 
 * 
 * @author Negib Sherif
 * @studentID 201904422
 * @email nssherif@mun.ca
 * @declaration This file was prepared by me and me alone.
 *
 **/
public class X implements Expression {
	
	/**  
	 * Placeholder for the result of X
	 * which is the X itself.
	 **/
	private double x;
	
	/**  
	 * Calculates the value of X which is the
	 * value given by the user. 
	 * 
	 * @param x: the value given by the user
	 * @return this.x: the value given by the user
	 **/
	@Override
	public double value(double x) {
		return this.x = x;
	}
	
	/**  
	 * Returns an x char as a string to represent this class. 
	 * 
	 * @return a char x as a string
	 **/
	@Override
	public String toString() {
		return "x";
	}

}
