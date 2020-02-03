package effect.values;

import effect.ValueList;

public class Shape implements ValueList {

	private static String[] VALUES = new String[] { "Triangle", "Sine" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
