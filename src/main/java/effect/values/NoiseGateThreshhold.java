package effect.values;

import effect.ValueList;

public class NoiseGateThreshhold implements ValueList {

	public String getValue(int i) {
		if (i == 0)
			i = 256;
		return String.format("%d dB", i - 256);
	}

}
