package SingletonPattern;

public class Main {
	public static void main(String[] args) {
		SpeakerController controller1 = new SpeakerController();
		controller1.use();
		SpeakerController controller2 = new SpeakerController();
		controller2.use();

		Speaker speaker1 = Speaker.getInstance();
		Speaker speaker2 = Speaker.getInstance();

		//5,5
		speaker1.getVolume();
		speaker2.getVolume();

		speaker1.setVolume(11);
		speaker1.getVolume();
		speaker2.getVolume();

		speaker2.setVolume(2);
		speaker1.getVolume();
		speaker2.getVolume();
	}
}
