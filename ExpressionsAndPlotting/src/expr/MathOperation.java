package expr;

import java.util.ArrayList;
import java.util.List;

/**  
 * Represents an abstract class for math operations 
 * such as (Add, Subtract, Multiply, Divide, 
 * Sin, Cos, Tan, Log, exponential function, constants, variable x, and
 * parenthesized) 
 * 
 * @author Negib Sherif
 * @studentID 201904422
 * @email nssherif@mun.ca
 * @declaration This file was prepared by me and me alone. 
 *
 **/
public abstract class MathOperation implements Expression {
	
	/** 
	 * Placeholder for expressions to be used for later computation
	 */
	private List<Expression> expressions = new ArrayList<Expression>() ;
	
	/** 
	 * Placeholder for the results that will be returned after computation
	 */
	private double result;
	
	/** 
	 * Placeholder for the converted string after computation.
	 */
	private String convertedStr;
	
	/** 
	 * Constructs a math operation
	 */
	MathOperation (Expression a) {
		expressions.add(a);
	}
	
	/** 
	 * Value function that returns the value based on the math function type
	 * 
	 * @param x: which will be the number used for the computation
	 * @return value of the math function operation
	 */
	@Override
	public abstract double value(double x);
	
	/** 
	 * Overrides toString method from javalang.object class
	 * and converts expressions to strings.
	 * 
	 * @return converted string
	 */
	@Override
	public abstract String toString();
	
	/** 
	 * Gets the list of expressions 
	 * 
	 * @return list of expressions
	 */
	public List<Expression> getExpressions (){
		return this.expressions;
	}
	
	/** 
	 * Gets value of expression
	 * 
	 * @param operation: the type of math function operation
	 * @param x: the number used for computation
	 * @return result of computation
	 */
	public double getValue (String operation, Double x) {
		switch (operation) {
			case "Add":
				result = expressions.get(0).value(x) + expressions.get(1).value(x);
				return result;
			case "Subtract":
				result = expressions.get(0).value(x) - expressions.get(1).value(x);
				return result;
			case "Multiply":
				result = expressions.get(0).value(x) * expressions.get(1).value(x);
				return result;
			case "Divide":
				result = expressions.get(0).value(x) / expressions.get(1).value(x);
				return result;
			case "Sin":
				result = Math.sin(expressions.get(0).value(x));
				return result;
			case "Cos":
				result =  Math.cos(expressions.get(0).value(x));
				return result;
			case "Tan":
				result =  Math.tan(expressions.get(0).value(x));
				return result;
			case "Log":
				result =  Math.log(expressions.get(0).value(x));
				return result;
			case "e":
				result =  Math.exp(expressions.get(0).value(x));
				return result;
			case "Parenthesized":
				result =  expressions.get(0).value(x);
				return result;
		}
		return result;
	}
	
	/** 
	 * Converts expression to string and returns the result. 
	 * 
	 * @param operation: the type of math function operation
	 * @return converted string
	 */
	public String getString (String operation) {
		String str1 = expressions.get(0).toString();
		switch (operation) {
			case "Add":
				convertedStr = str1 + " + " + expressions.get(1).toString();
				return convertedStr;
			case "Subtract":
				convertedStr = str1 + " - " + expressions.get(1).toString();
				return convertedStr;
			case "Multiply":
				convertedStr = str1 + " * " + expressions.get(1).toString();
				return convertedStr;
			case "Divide":
				convertedStr = str1 + " / " + expressions.get(1).toString();
				return convertedStr;
			case "Sin":
				convertedStr = "sin " + str1;
				return convertedStr;
			case "Cos":
				convertedStr = "cos " + str1;
				return convertedStr;
			case "Tan":
				convertedStr = "tan " + str1;
				return convertedStr;
			case "Log":
				convertedStr = "ln " + str1;
				return convertedStr;
			case "e":
				convertedStr = "exp " + str1;
				return convertedStr;
			case "Parenthesized":
				convertedStr = "(" + str1 + ")";
				return convertedStr;
		}
		return convertedStr;
	}

}
