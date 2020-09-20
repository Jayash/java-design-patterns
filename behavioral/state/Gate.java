package behavioral.state;

public class Gate {
	
	private State state;
	
	public Gate() {
		state = new Close(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void payOk() {
		state.payOk();
	}
	
	public void payFailed() {
		state.payFailed();
	}
	
	public void changeState(State state) {
		this.state = state;
	}
	
}
