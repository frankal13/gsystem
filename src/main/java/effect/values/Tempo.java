package effect.values;

import effect.ValueList;

public class Tempo implements ValueList {

	private static String[] VALUES = new String[] { "Ignore", "2 Measures", "1 Measure", "1/2 Dotted", "1/2",
			"1/2 Triplet", "1/4 Dotted", "1/4", "1/4 Triplet", "1/8 Dotted", "1/8", "1/8 Triplet", "1/16 Dotted",
			"1/16", "1/16 Triplet", "1/32 Dotted", "1/32 Triplet" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
