package effect.values;

import effect.ValueList;

public class IntelligentPitchShifterVoice implements ValueList {

	private static String[] VALUES = new String[] { "-13", "-12", "-Oct 2", "-10", "-9", "-8", "-7", "-Oct1", "-5",
			"-4", "-3", "-2", "Unison", "+2", "+3", "+4", "+5", "+Oct1", "+7", "+8", "+9", "+10", "+Oct2", "+12",
			"+13" };

	public String getValue(int i) {
		if (i > 13)
			i = 256 - i;
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
