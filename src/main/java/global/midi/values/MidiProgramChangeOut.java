package global.midi.values;

import effect.ValueList;

public class MidiProgramChangeOut implements ValueList {

	private static String[] VALUES = new String[] { "OFF", "ON", "On Map" };

	public String getValue(int i) {
		if (i >= VALUES.length)
			return "Error MidiProgramChangeOut:" + i;
		return VALUES[i];
	}

}
