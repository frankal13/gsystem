package effect.values;

import effect.ValueList;

public class Release implements ValueList {

	private static String[] VALUES = new String[] { "50ms", "70ms", "100ms", "140ms", "200ms", "300ms", "500ms",
			"700ms", "1.0s", "1.4s", "2.0s" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error:" + i;
		return VALUES[i];
	}

}
