package effect.values;

import effect.ValueList;

public class Side implements ValueList {

	public String getValue(int i) {
		if (i == 0)
			return "Left";
		else
			return "Right";
	}

}
