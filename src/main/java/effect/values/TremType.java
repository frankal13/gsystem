package effect.values;

import effect.ValueList;

public class TremType implements ValueList {

	public String getValue(int i) {
		if (i == 0)
			return "Soft";
		else
			return "Hard";
	}

}
