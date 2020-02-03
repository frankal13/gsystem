package effect.values;

import effect.ValueList;

public class ReverbSize implements ValueList {
	private static String[] VALUES = new String[] { "Box", "Tiny", "Small", "Medium", "Large", "XL", "Grand", "Huge" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
