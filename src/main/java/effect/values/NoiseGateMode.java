package effect.values;

import effect.ValueList;

public class NoiseGateMode implements ValueList {

	public String getValue(int i) {
		if (i == 0)
			return "soft";
		else
			return "hard";
	}

}
