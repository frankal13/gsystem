package global.pedal.values;

import effect.ValueList;

public class GFX1ExpressionPedalType implements ValueList {

	private static String[] VALUES = new String[] { "Off", "Momentary", "Alternating", "Expression", "Volume" };

	public String getValue(int i) {
		if (i >= VALUES.length)
			return "Error GFX1ExpressionPedalType:" + i;
		return VALUES[i];
	}

}
