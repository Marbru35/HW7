package main;

public interface Visitor {

	public abstract void visitGlass(Glass g);
	
	public abstract void visitFurniture(Furniture f);
	
	public abstract void visitElectronic(Electronic e);
}
