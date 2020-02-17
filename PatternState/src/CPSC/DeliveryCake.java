package CPSC;

public class DeliveryCake {

	private Cake currentState;

	public DeliveryCake() {

		currentState = new Acknowledge();
	}

	public Cake getCurrentState() {
		return currentState;
	}

	public void setCurrentState(Cake currentState) {
		this.currentState = currentState;
	}

	public void update(String state) {

		currentState.updateStatus(this, state);

	}

}
