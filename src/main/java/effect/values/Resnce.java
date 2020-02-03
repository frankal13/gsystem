package effect.values;

import effect.ValueList;

public class Resnce implements ValueList {

	public String getValue(int i) {
		return String.format("%d%%", i);
	}

}
