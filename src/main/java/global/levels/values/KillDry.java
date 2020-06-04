package global.levels.values;

import effect.ValueList;

public class KillDry implements ValueList {

	private static String[] VALUES = new String[] { "OFF", "ON" };

	public String getValue(int i) {
		if (i >= VALUES.length)
			return "Error KillDry:" + i;
		return VALUES[i];
	}

}
