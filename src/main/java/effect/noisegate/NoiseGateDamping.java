package effect.noisegate;

import effect.ValueList;

public class NoiseGateDamping implements ValueList {

	public String getValue(int i) {
		return String.format("%d dB", i);
	}

}
