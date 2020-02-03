package effect.values;

import effect.ValueList;

public class Pan implements ValueList {

	public String getValue(int i) {
		if (i > 50)
			return String.format("%d", i - 256);
		else
			return String.format("%d", i);
	}
}
