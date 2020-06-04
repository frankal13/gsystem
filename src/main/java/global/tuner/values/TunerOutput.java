package global.tuner.values;

import effect.ValueList;

public class TunerOutput implements ValueList {

	private static String[] VALUES = new String[] { "MUTE", "ON" };

	public String getValue(int i) {
		if (i >= VALUES.length)
			return "Error TunerOutput:" + i;
		return VALUES[i];
	}

}
