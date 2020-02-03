package effect.values;

import effect.ValueList;

public class Voice implements ValueList {

	public String getValue(int i) {
		if (i > 1200)
			return String.format("%d cents", i - 65536);
		else
			return String.format("%d cents", i);
	}

}
