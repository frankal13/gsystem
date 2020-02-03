package effect.values;

import effect.ValueList;

public class Attack implements ValueList {

	private static String[] VALUES = new String[] { "1.0ms", "1.4ms", "2.0ms", "3.0ms", "5.0ms", "7.0ms", "10ms",
			"14ms", "20ms", "30ms", "50ms", "70ms", "100ms", "140ms" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
