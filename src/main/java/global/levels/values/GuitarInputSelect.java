package global.levels.values;

import effect.ValueList;

public class GuitarInputSelect implements ValueList {

	private static String[] VALUES = new String[] { "REAR", "FRONT" };

	public String getValue(int i) {
		if (i >= VALUES.length)
			return "Error GuitarInputSelect:" + i;
		return VALUES[i];
	}

}
