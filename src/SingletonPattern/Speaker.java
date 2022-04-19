package SingletonPattern;

import java.util.Date;

public class Speaker {
	private static Speaker instance;
	private int volume;

	private Speaker(){
		volume = 5;
	}
	public static Speaker getInstance(){
		if (instance == null) {
			instance = new Speaker();
			System.out.println("생성");
		} else {
			System.out.println("호출");
		}
		System.out.println("[get speaker] [time]" + new Date() + " [instance] " + instance);
		return instance;
	}

	public int getVolume() {
		System.out.println(volume);
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
