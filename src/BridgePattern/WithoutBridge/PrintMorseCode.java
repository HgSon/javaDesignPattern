package BridgePattern.WithoutBridge;

public class PrintMorseCode extends MorseCode{
	public PrintMorseCode g(){
		dash();
		dash();
		dot();
		space();
		return this;
	}
	public PrintMorseCode a(){
		dot();
		dash();
		return this;
	}
}
