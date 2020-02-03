package effect.values;

import effect.ValueList;

public class TapeDelayDrive implements ValueList {

	public String getValue(int i) {
		return String.format("%d dB", i);
	}

}
