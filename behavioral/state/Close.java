package behavioral.state;

public class Close implements State {
	
	private Gate gate;
	
	public Close(Gate gate) {
		this.gate = gate;
	}

	@Override
	public void payOk() {
		this.gate.changeState(new Open(this.gate));
	}

	@Override
	public void payFailed() {}

}
