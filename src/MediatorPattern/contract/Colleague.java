package MediatorPattern.contract;

abstract public class Colleague {
	protected Mediator mediator;

	public void join(Mediator mediator) {
		this.mediator = mediator;
		mediator.addColleague(this);
	}

	public void sendData(String data) {
		mediator.mediate(data);
	}

	abstract public void handle(String data);

}
