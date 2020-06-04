package global.levels.values;

import effect.ValueList;

public class BoostMaxVolume implements ValueList {

	public String getValue(int i) {
		return String.format("%d dB", i);
	}
}
