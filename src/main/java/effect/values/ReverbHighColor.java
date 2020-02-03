package effect.values;

import effect.ValueList;

public class ReverbHighColor implements ValueList {

	private static String[] VALUES = new String[] { "Wool", "Warm", "Real", "Clear", "Bright", "Crisp", "Glass" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
