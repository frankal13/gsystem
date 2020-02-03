package effect.values;

import effect.ValueList;

public class ReverbShape implements ValueList {

	private static String[] VALUES = new String[] { "Round", "Curved", "Square" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
