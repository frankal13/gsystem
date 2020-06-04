package global.pedal.values;

import effect.ValueList;

public class ExpressionMaster implements ValueList {

	private static String[] VALUES = new String[] { "PRESET", "GLOBAL" };

	public String getValue(int i) {
		if (i >= VALUES.length)
			return "Error ExpressionMaster:" + i;
		return VALUES[i];
	}

}
