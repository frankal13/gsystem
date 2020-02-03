package effect.values;

import effect.ValueList;

public class Range implements ValueList {

	private static String[] VALUES = new String[] { "Low", "High" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
