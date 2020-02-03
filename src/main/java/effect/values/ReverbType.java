package effect.values;

import effect.ValueList;

public class ReverbType implements ValueList {

	private static String[] VALUES = new String[] { "Spring", "Hall", "Room", "Plate" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
