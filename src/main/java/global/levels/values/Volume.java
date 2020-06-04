package global.levels.values;

import effect.ValueList;

public class Volume implements ValueList {

	public String getValue(int i) {
		if (i < 32768)
			return String.format("+%d dB", i);
		if (i == 0)
			return String.format("%d dB", i);
		return String.format("%d dB", i - 65536);
	}

}
