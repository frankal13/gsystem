package effect.values;

import effect.ValueList;

public class OutLev implements ValueList {

	public String getValue(int i) {
		if (i == 0)
			i = 256;
		return String.format("%ddB", i - 256);
	}

}
