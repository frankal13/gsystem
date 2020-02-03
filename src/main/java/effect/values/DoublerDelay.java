package effect.values;

import effect.ValueList;

public class DoublerDelay implements ValueList {

	public String getValue(int i) {
		return String.format("%d ms", i);
	}

}
