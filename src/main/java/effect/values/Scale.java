package effect.values;

import effect.ValueList;

public class Scale implements ValueList {

	private static String[] VALUES = new String[] { "Ionian", "Dorian", "Phrgian", "Lydian", "Mixolydian", "Aeolian",
			"Locrian", "Pentatonic Minor", "Pentatonic Major", "Blues", "Dim Halftone", "Dim Wholetone", "Wholetone",
			"Melodic Minor", "Harmonic Minor", "Super Locrian", "Lydian Flat 7th", "Phyrgian Major" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
