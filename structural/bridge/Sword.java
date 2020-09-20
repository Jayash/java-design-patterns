package structural.bridge;

public class Sword extends Weapon {

	public Sword(Enchantment enchantment) {
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
