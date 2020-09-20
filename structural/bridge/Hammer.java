package structural.bridge;

public class Hammer extends Weapon {

	private Enchantment enchantment;
	
	public Hammer(Enchantment enchantment) {
		super(enchantment);
	}

	@Override
	public String getDesc() {
		return null;
	}

	@Override
	public void attack() {
		enchantment.apply();
	}

	@Override
	public void wield() {
		enchantment.onActivate();
	}
	
	

}
