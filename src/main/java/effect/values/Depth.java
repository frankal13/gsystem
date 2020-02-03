package effect.values;

import effect.ValueList;

public class Depth implements ValueList {
	public String getValue(int i) {
		return String.format("%d%%", i);
	}
}
