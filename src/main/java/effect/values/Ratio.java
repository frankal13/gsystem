package effect.values;

import effect.ValueList;

public class Ratio implements ValueList {

	private static String[] VALUES = new String[] { "Off", "1.12:1", "1.25:1", "1.40:1", "1.60:1", "1.80:1", "2.0:1",
			"2.5:1", "3.2:1", "4.0:1", "5.6:1", "8.0:1", "16:1", "32:1", "64:1", "Inf:1" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
