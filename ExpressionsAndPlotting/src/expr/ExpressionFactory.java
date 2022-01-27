package expr;

/**  
 * Represents an expression factory which 
 * generation multiple math expressions. 
 * 
 * @author Negib Sherif
 *
 **/

public class ExpressionFactory implements ExpressionFactoryI{
	
	public Expression add(Expression a, Expression b) {
		return new Add(a,b);
	};

	public Expression subtract(Expression a, Expression b) {
		return new Subtract(a,b);
	}

	public Expression multiply(Expression a, Expression b) {
		return new Multiply(a,b);
	}

	public Expression divide(Expression a, Expression b) {
		return new Divide(a,b);
	}

	public Expression constant(double value) {
		return new Constant(value);
	}

	public Expression x() {
		return new X();
	}

	public Expression sin(Expression a) {
		return new Sin(a);
	}

	public Expression cos(Expression a) {
		return new Cos(a);
	}

	public Expression tan(Expression a) {
		return new Tan(a);
	}

	public Expression ln(Expression a) {
		return new Ln(a);
	}

	public Expression exp(Expression a) {
		return new Exp(a);
	}

	public Expression parenthesized(Expression a) {
		return new Parenthesized(a);
	}

}
