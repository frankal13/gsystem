package effect.values;

import effect.ValueList;

public class ReverbLowColor implements ValueList {

	private static String[] VALUES = new String[] { "Thick", "Round", "Real", "Light", "Tight", "Thin", "NoBass" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
