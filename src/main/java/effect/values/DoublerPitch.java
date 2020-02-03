package effect.values;

import effect.ValueList;

public class DoublerPitch implements ValueList {

	public String getValue(int i) {
		if (i == 0)
			return "0";
		else if (i > 30)
			return String.format("%d", i - 256);
		else
			return String.format("+%d", i);
	}

}
