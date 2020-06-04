package global.pedal.values;

import effect.ValueList;

public class GFX1VolumePedalType implements ValueList {

	private static String[] VALUES = new String[] { "Off", "Momentary", "Alternating", "Expression", "Volume" };

	public String getValue(int i) {
		if (i >= VALUES.length)
			return "Error GFX1VolumePedalType:" + i;
		return VALUES[i];
	}

}
