package effect.values;

import effect.ValueList;

public class VintageUnivibeSpeed implements ValueList {

	public String getValue(int i) {
		if (i == 0)
			return "Speed 1";
		else
			return "Speed 2";
	}

}
