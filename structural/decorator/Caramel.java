package structural.decorator;

public class Caramel extends AddOnDecorator {

	public Caramel(Beverage beverage) {
		super(beverage);
	}
	
	public Caramel() {}

	@Override
	public double cost() {
		if(getBeverage() != null)
			return 0 + getBeverage().cost();
		else return 0;
	}

	@Override
	public String desc() {
		return null;
	}

}
