package global.midi.values;

import effect.ValueList;

public class MidiProgramChangeIn implements ValueList {

	private static String[] VALUES = new String[] { "OFF", "ON" };

	public String getValue(int i) {
		if (i >= VALUES.length)
			return "Error MidiProgramChangeIn:" + i;
		return VALUES[i];
	}
}
