package effect.values;

import effect.ValueList;

public class Gain implements ValueList {

	public String getValue(int i) {
		if (i < 128)
			return String.format("%ddB", i);
		return String.format("%ddB", i - 256);
	}

}
