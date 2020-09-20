package behavioral.strategy;

public class MountainBird implements Bird {
	
	private BirdFlyingBehaviour flyingStrategy;
	private BirdQuackBehaviour quackStrategy;
	
	public void setFlyingStrategy(BirdFlyingBehaviour flyingStrategy) {
		this.flyingStrategy = flyingStrategy;
	}
	public void setQuackStrategy(BirdQuackBehaviour quackStrategy) {
		this.quackStrategy = quackStrategy;
	}
	
	@Override
	public void fly() {
		flyingStrategy.fly();
	}
	@Override
	public void quack() {
		quackStrategy.quack();
	}
	
}
