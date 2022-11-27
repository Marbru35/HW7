package main;

public class MovingCostCalculator implements Visitor {

	double tempCost;

	@Override
	public void visitGlass(Glass g) {
		if (g.getTickness() == 1) {
			tempCost = 2 * ((double)g.getLenght() / 100);
		} else if (g.getTickness() == 2) {
			tempCost = 1.2 * ((double)g.getLenght() / 100);
		} else {
			tempCost = 0.7 * ((double)g.getLenght() / 100);
		}
		System.out.println("Total cost for " + g.getName() + " is: " + tempCost + " Euros");
	}

	@Override
	public void visitFurniture(Furniture f) {
		tempCost = ((double)f.getWeight() / 20) * 5;
		System.out.println("Total cost for " + f.getName() + " is: " + tempCost + " Euros");
	}

	@Override
	public void visitElectronic(Electronic e) {
		if (e.getFragile()) {
			tempCost = ((double)e.getWeight() / 10) * 5;
		} else {
			tempCost = ((double)e.getWeight() / 15) * 5;
		}
		System.out.println("Total cost for " + e.getName() + " is: " + tempCost + " Euros");
	}
	
	public Double calculateMovingCost(HouseholdItem h) {
		tempCost = 0.0;
		h.accept(this);
		return tempCost;
	}
}
