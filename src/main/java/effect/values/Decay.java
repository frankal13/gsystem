package effect.values;

import effect.ValueList;

public class Decay implements ValueList {

	public String getValue(int i) {
		return String.format("%.1f s", i / 10.0);
	}

}
