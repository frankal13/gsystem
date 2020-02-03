package effect.values;

import effect.ValueList;

public class Sense implements ValueList {

	public String getValue(int i) {
		return String.format("%d dB", i - 256);
	}

}
