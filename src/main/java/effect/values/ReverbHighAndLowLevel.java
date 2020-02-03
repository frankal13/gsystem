package effect.values;

import effect.ValueList;

public class ReverbHighAndLowLevel implements ValueList {

	public String getValue(int i) {
		if (i > 25)
			return String.format("%d", i - 256);
		else
			return String.format("+%d", i);
	}

}
