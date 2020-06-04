package global.tuner.values;

import effect.ValueList;

public class TunerMode implements ValueList {

	private static String[] VALUES = new String[] { "BAR", "STROBE" };

	public String getValue(int i) {
		if (i >= VALUES.length)
			return "Error TunerMode:" + i;
		return VALUES[i];
	}

}
