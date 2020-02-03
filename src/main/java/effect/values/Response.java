package effect.values;

import effect.ValueList;

public class Response implements ValueList {

	private static String[] VALUES = new String[] { "Slow", "Fast" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
