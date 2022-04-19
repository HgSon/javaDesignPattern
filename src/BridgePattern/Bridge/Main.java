package BridgePattern.Bridge;

import BridgePattern.Bridge.PrintMorseCode;

public class Main {
	public static void main(String[] args) {
		PrintMorseCode code = new PrintMorseCode(new SoundMCF());
		code.g().a();
	}
}
