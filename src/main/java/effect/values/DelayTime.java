package effect.values;

import effect.ValueList;

public class DelayTime implements ValueList {

	public String getValue(int i) {
		return String.format("%d ms", i);
	}

}
