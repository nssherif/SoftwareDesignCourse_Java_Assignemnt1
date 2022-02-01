package expr;

import util.Assert;

/**  
 * Represents a chart Data object which has 
 * information about the chart. 
 * 
 * @author Negib Sherif
 * @studentID 201904422
 * @email nssherif@mun.ca
 * @declaration This file was prepared by me and me alone. 
 *
 **/

public class ChartData implements ChartDataI{
	
	/** 
	 * PlaceHolder for an expression
	 */
	private Expression expr;
	
	/** 
	 * PlaceHolder for a x Min value
	 */
	private double xMin;
	
	/** 
	 * PlaceHolder for a x Max value
	 */
	private double xMax;
	
	/** 
	 * PlaceHolder for a y Min value
	 */
	private double yMin;
	
	/** 
	 * PlaceHolder for a y Max value
	 */
	private double yMax;
	
	/** 
	 * Constructs a new chartData which declares static
	 * values for xMin, xMax, yMin, and yMax.
	 */
	public ChartData (){
		expr = new X();
		xMin = -1.0;
		xMax = 1.0;
		yMin = -10;
		yMax = 10;
		check();
	}
	
	/** 
	 * Given an expression, sets an expression to be used for 
	 * later computation. Checks that all checks are valid. 
	 * Precondition: Expression a is not null
	 * 
	 * @param an expression to be set
	 */
	public void setExpression( Expression a ) {
		Assert.check( a != null, "Expression is null" ) ;
		expr = a;
		check();
	}
	
	/** 
	 * Gets the expression stored in the private variable
	 * of this class.
	 * 
	 * @return the expression
	 */
	public Expression getExpression() {
		return expr;
	}
	
	/** 
	 * Given the xMin and xMax, sets the Xrange.
	 * Precondition: xMin is greater than xMax. And xMin is 
	 * greater than negative infinity. And xMax is less than 
	 * positive infinity. Also checks that all checks are valid. 
	 * 
	 * @param xMin and xMax
	 * 
	 * @return the x Range.
	 */
	public void setXRange( double xMin, double xMax ) {
		Assert.check( xMin < xMax, "xMin is not less than xMax" ) ;
		Assert.check( Double.NEGATIVE_INFINITY < xMin, "xMin is not greater than negative infinity" ) ;
		Assert.check( Double.POSITIVE_INFINITY > xMax, "xMax is not less than infinity" ) ;
		this.xMin = xMin;
		this.xMax = xMax;
		check();
	}
	
	/** 
	 * Gets the value of xMin.
	 * 
	 * @return the xMin.
	 */
	public double getXMin() {
		return xMin;
	}
	
	/** 
	 * Gets the value of xMax.
	 * 
	 * @return the x Max.
	 */
	public double getXMax() {
		return xMax;
	}
	
	/** 
	 * Given the yMin and yMax, sets the Y range.
	 * Precondition: yMin is greater than yMax. And yMin is 
	 * greater than negative infinity. And yMax is less than 
	 * positive infinity. Also checks that all checks are valid. 
	 * 
	 * @param yMin and yMax
	 * 
	 * @return the Y range.
	 */
	public void setYRange( double yMin, double yMax ) {
		Assert.check( yMin < yMax, "yMin is not less than yMax" );
		Assert.check( Double.NEGATIVE_INFINITY < yMin, "yMin is not greater than negative infinity" ) ;
		Assert.check( Double.POSITIVE_INFINITY > yMax, "yMax is not less than infinity" ) ;
		this.yMin = yMin;
		this.yMax = yMax;
		check();
	}
	
	/** 
	 * Gets the value of yMin.
	 * 
	 * @return the y Min.
	 */
	public double getYMin() {
		return yMin;
	}
	
	/** 
	 * Gets the value of yMax.
	 * 
	 * @return the y Max.
	 */
	public double getYMax() {
		return yMax;
	}
	
	/** 
	 * Logical assertion checks that validate the rules
	 * of the graph.
	 * 
	 */
	private void check() {
		Assert.check( expr != null, "Expression is null" ) ;
		Assert.check( xMin < xMax, "xMin is not less than xMax" ) ;
		Assert.check( Double.NEGATIVE_INFINITY < xMin, "xMin is not greater than negative infinity" ) ;
		Assert.check( Double.POSITIVE_INFINITY > xMax, "xMax is not less than infinity" ) ;
		Assert.check( yMin < yMax, "yMin is not less than yMax" );
		Assert.check( Double.NEGATIVE_INFINITY < yMin, "yMin is not greater than negative infinity" ) ;
		Assert.check( Double.POSITIVE_INFINITY > yMax, "yMax is not less than infinity" ) ;
	}
	

}
