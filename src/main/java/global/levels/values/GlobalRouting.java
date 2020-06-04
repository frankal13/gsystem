package global.levels.values;

import effect.ValueList;

public class GlobalRouting implements ValueList {

	private static String[] VALUES = new String[] { "Serial", "Parallel", "Semi Parallel", "Serial 2" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
