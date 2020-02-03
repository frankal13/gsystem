package effect.values;

import effect.ValueList;

public class LMH implements ValueList {

	private static String[] VALUES = new String[] { "Heat", "Hit", "Head", "Had", "But", "Father", "All", "Boot",
			"Foot", "Bird" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
