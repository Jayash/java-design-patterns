package structural.decorator;

public class Soy extends AddOnDecorator {
	
	public Soy() {}
	
	public Soy(Beverage beverage) {
		super(beverage);
	}

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
