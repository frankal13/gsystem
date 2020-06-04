package global.factorybank.values;

import effect.ValueList;

public class SelectLockout implements ValueList {

	private static String[] VALUES = new String[] { "ON", "OFF" };

	public String getValue(int i) {
		if (i >= VALUES.length)
			return "Error SelectLockout:" + i;
		return VALUES[i];
	}
}
