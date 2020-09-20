package structural.decorator;

public class Soy extends AddOnDecorator {
	
	public Soy(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double cost() {
		if(beverage != null)
			return 0 + beverage.cost();
		else return 0;
	}

	@Override
	public String desc() {
		return null;
	}

}
