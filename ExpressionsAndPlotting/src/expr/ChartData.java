package expr;

import util.Assert;

public class ChartData implements ChartDataI{
	
	private Expression expr;
	
	private double xMin;
	
	private double xMax;
	
	private double yMin;
	
	private double yMax;
	
	private double xRange;
	
	private double yRange;
	
	public void setExpression( Expression a ) {
		expr = a;
	}
	public Expression getExpression() {
		Assert.check( expr != null, "Expression is null" ) ;
		return expr;
	}
	public void setXRange( double xMin, double xMax ) {
		Assert.check( xMin < xMax, "xMin is not less than xMax" ) ;
		this.xMin = xMin;
		this.xMax = xMax;
		xRange = xMax - xMin;
	}
	public double getXMin() {
		Assert.check( Double.NEGATIVE_INFINITY < xMin, "xMin is not greater than negative infinity" ) ;
		return xMin;
	}
	public double getXMax() {
		Assert.check( Double.POSITIVE_INFINITY > xMax, "xMax is not less than infinity" ) ;
		return xMax;
	}
	public void setYRange( double yMin, double yMax ) {
		Assert.check( xMin < xMax, "yMin is not less than yMax" );
		this.yMin = yMin;
		this.yMax = yMax;
		yRange = yMax - yMin;
	}
	public double getYMin() {
		Assert.check( Double.NEGATIVE_INFINITY < yMin, "yMin is not greater than negative infinity" ) ;
		return yMin;
	}
	public double getYMax() {
		Assert.check( Double.POSITIVE_INFINITY > yMax, "yMax is not less than infinity" ) ;
		return yMax;
	}
	

}
