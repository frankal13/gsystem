package global.levels.values;

import effect.ValueList;

public class LoopHeadroom implements ValueList {

	public String getValue(int i) {
		return String.format("%d dB", i);
	}

}
