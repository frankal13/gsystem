package global.lock.values;

import effect.ValueList;

public class Lock implements ValueList {

	public String getValue(int i) {
		if (i == 1)
			return "Lock";
		if (i == 0)
			return "Unlock";
		return "Error Lock";
	}

}
