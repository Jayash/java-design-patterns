package behavioral.state;

public class Open implements State {
	
	private Gate gate;
	
	public Open(Gate gate) {
		this.gate = gate;
	}

	@Override
	public void payOk() {}

	@Override
	public void payFailed() {
		this.gate.changeState(new Close(this.gate));
	}

}
