package global.tuner.values;

import effect.ValueList;

public class TunerReference implements ValueList {

	public String getValue(int i) {
		return String.format("%d Hz", i + 256);
	}
}
