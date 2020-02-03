package effect.values;

import effect.ValueList;

public class Style implements ValueList {

	private static String[] STYLE = new String[] { "2nd", "4th" };

	public String getValue(int i) {
		return STYLE[i];
	}

}
