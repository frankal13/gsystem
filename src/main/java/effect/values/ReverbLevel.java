package effect.values;

import effect.ValueList;

public class ReverbLevel implements ValueList {

	public String getValue(int i) {
		if (i == 256)
			i = 0;
		return String.format("%d dB", i - 256);
	}

}
