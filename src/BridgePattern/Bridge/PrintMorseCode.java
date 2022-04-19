package BridgePattern.Bridge;

public class PrintMorseCode extends MorseCode {
	public PrintMorseCode(MorseCodeFunction function) {
		super(function);
	}

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
