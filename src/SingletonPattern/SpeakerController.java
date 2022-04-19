package SingletonPattern;

public class SpeakerController {
	public void use(){
		Speaker speaker = Speaker.getInstance();
		System.out.println(speaker);
	}
}
