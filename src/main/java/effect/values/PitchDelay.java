package effect.values;

import effect.ValueList;

public class PitchDelay implements ValueList {

	public String getValue(int i) {
		return String.format("%d ms", i);
	}

}
