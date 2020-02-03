package effect.values;

import effect.ValueList;

public class OffOn implements ValueList {

	private static String[] VALUES = new String[] { "Off", "On" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
