package minijava.ast;

import minijava.visitor.Visitor;

public class ArrayLookup extends Expression {

	public final Expression array;
	public final Expression index;
	
	public ArrayLookup(Expression array, Expression index) {
		super();
		super.setType(IntegerType.instance);//all arrays contain integers
		this.array = array;
		this.index = index;
	}

	@Override
	public <R> R accept(Visitor<R> v) {
		return v.visit(this);
	}

}
