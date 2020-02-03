package effect.values;

import effect.ValueList;

public class BypassMode implements ValueList {

	public String getValue(int i) {
		if (i == 0)
			return "Direct";
		else
			return "Delayed";
	}

}
