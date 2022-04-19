package AdapterPattern;

public class AdapterImpl implements Adapter {
	@Override
	public Float twoTimeOf(Float f) {
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		Float result =  (float) Math.half(f.doubleValue());
		System.out.println("result = " + result);
		return result;
	}
}
