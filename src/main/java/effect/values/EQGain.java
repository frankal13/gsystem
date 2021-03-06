package effect.values;

import effect.ValueList;

public class EQGain implements ValueList {

	public String getValue(int i) {
		if (i > 0)
			return String.format("+%d dB", i);
		if (i == 0)
			return String.format("%d dB", i);
		return String.format("%d dB", i - 256);
	}

}
