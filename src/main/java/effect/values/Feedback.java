package effect.values;

import effect.ValueList;

public class Feedback implements ValueList {
	public String getValue(int i) {
		if (i == 0)
			return String.format("%d%%", i);
		else
			return String.format("%d%%", i - 256);
	}
}
