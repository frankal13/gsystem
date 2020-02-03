package effect.values;

import effect.ValueList;

public class NoiseGateSpeed implements ValueList {

	public String getValue(int i) {
		return String.format("%d dB/s", i);
	}

}
