package StatePattern;

public class Light {
	protected LightState lightState;

	public Light() {
		this.lightState = offState;
	}

	public void on() {
		lightState.on();
	}

	public void off() {
		lightState.off();
	}

	private LightState onState = new LightState() {
		@Override
		public void on() {
			System.out.println("Nothing");
		}

		@Override
		public void off() {
			System.out.println("Light OFF");
			lightState = offState;
		}
	};

	private LightState offState = new LightState() {
		@Override
		public void on() {
			System.out.println("Light ON");
			lightState = onState;
		}

		@Override
		public void off() {
			System.out.println("Nothing");
		}
	};
}

interface LightState {
	void on();
	void off();
}
