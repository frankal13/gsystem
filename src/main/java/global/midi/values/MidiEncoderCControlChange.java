package global.midi.values;

import effect.ValueList;

public class MidiEncoderCControlChange implements ValueList {

	public String getValue(int i) {
		return String.format("%d", i);
	}

}
