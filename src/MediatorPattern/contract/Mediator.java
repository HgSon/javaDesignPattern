package MediatorPattern.contract;

import java.util.List;

abstract public class Mediator {
	protected List<Colleague> colleagues;

	public boolean addColleague(Colleague colleague) {
		if (colleagues != null) {
			return colleagues.add(colleague);
		}
		return false;
	}

	abstract public void mediate(String data);
}
