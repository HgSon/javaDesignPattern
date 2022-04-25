package MediatorPattern;

import MediatorPattern.contract.Colleague;
import MediatorPattern.contract.Mediator;

import java.util.ArrayList;

public class ChatMediator extends Mediator {

	public ChatMediator() {
		this.colleagues = new ArrayList<>();
	}

	@Override
	public void mediate(String data) {
		// 중재 로직 생략
		for (Colleague colleague : colleagues) {
			colleague.handle(data);
		}
	}
}
