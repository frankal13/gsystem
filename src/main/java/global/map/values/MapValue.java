package global.map.values;

import effect.ValueList;

public class MapValue implements ValueList {

	public String getValue(int i) {
		if (i == 255)
			return "None";
		if (i < 200)
			return String.format("%d", i + 1);
		return "MapValue error";
	}

}
