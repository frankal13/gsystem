package effect.values;

import effect.ValueList;

public class OctaverRange implements ValueList {

	public String getValue(int i) {
		if (i == 0)
			return "1 Octave";
		else
			return "2 Octaves";
	}

}
