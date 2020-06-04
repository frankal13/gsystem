package global.levels.values;

import effect.ValueList;

public class VolumePlacement implements ValueList {

	private static String[] VALUES = new String[] { "INPUT", "OUTPUT" };

	public String getValue(int i) {
		if (i >= VALUES.length)
			return "Error VolumePlacement:" + i;
		return VALUES[i];
	}

}
