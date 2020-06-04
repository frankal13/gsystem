package global.levels.values;

import effect.ValueList;

public class GuitarInputSensitivity implements ValueList {

	public String getValue(int i) {
		if (i > 0)
			return String.format("+%d dB", i);
		if (i == 0)
			return String.format("%d dB", i);
		return String.format("%d dB", i - 256);
	}

}
