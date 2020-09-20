package structural.decorator;

public abstract class AddOnDecorator implements Beverage {

	private Beverage beverage;
	
	public AddOnDecorator() {}
	
	public AddOnDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	public Beverage getBeverage() {
		return beverage;
	}

	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
	
}
