package effect.values;

import effect.ValueList;

public class AutoOn implements ValueList {

	private static String[] VALUES = new String[] { "Off", "0.3s", "0.5s", "1s", "3s", "5s", "10s", "Infinity" };

	public String getValue(int i) {
		if (i == 255)
			i = 0;
		else
			i = i + 1;
		if (i >= VALUES.length)
			return "Error AutoOn:" + i;
		return VALUES[i];
	}

}
