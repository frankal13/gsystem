package effect.values;

import effect.ValueList;

public class IntelligentPitchShifterKey implements ValueList {

	private static String[] VALUES = new String[] { "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "G" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
