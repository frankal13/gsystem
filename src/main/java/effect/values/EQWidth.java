package effect.values;

import effect.ValueList;

public class EQWidth implements ValueList {

	public String getValue(int i) {
		return String.format("%.1f", (i + 1) / 10.0);
	}

}
