package com.bridgelabz.designPatternProgram.behaviourDessignPattern.VisitorPattern;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);

}
