package global.pedal.values;

import effect.ValueList;

public class VolumeMaster implements ValueList {

	private static String[] VALUES = new String[] { "PRESET", "GLOBAL" };

	public String getValue(int i) {
		if (i >= VALUES.length)
			return "Error VolumeMaster:" + i;
		return VALUES[i];
	}

}
