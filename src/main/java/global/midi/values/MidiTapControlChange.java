package global.midi.values;

import effect.ValueList;

public class MidiTapControlChange implements ValueList {

	public String getValue(int i) {
		return String.format("%d", i);
	}

}
