package global.midi.values;

import effect.ValueList;

public class MidiEncoderBControlChange implements ValueList {

	public String getValue(int i) {
		return String.format("%d", i);
	}

}
