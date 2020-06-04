package global.midi.values;

import effect.ValueList;

public class MidiEncoderAControlChange implements ValueList {

	public String getValue(int i) {
		return String.format("%d", i);
	}

}
