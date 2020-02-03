package effect.values;

import effect.ValueList;

public class Direction implements ValueList {

	public String getValue(int i) {
		if (i == 0)
			return "down";
		else
			return "up";
	}

}
