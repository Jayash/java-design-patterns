package behavioral.template;

public abstract class StelingMethod {
	
	protected abstract String getDesc();
	protected abstract String pickTarget();
	protected abstract void  confuseTarget(String target);
	protected abstract void stelItem(String target);
	
	public void steal() {
		String target = pickTarget();
		confuseTarget(target);
		stelItem(target);
	}
}
