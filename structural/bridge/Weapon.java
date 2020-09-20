package structural.bridge;

public abstract class Weapon {
		
	protected Enchantment enchantment;
	
	public Weapon(Enchantment enchantment) {
		this.enchantment = enchantment;
	}
	
	protected abstract String getDesc();
	protected abstract void attack();
	protected abstract void wield();
}
