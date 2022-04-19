package BridgePattern.WithoutBridge;

public class Main {
	public static void main(String[] args) {
		PrintMorseCode code = new PrintMorseCode();
		code.g();
		code.a();
		code.g().a();
	}
}
