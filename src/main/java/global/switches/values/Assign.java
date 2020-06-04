package global.switches.values;

import effect.ValueList;

public class Assign implements ValueList {

	private static String[] ASSIGN_VALUES = new String[] { "NONE", "FILTER", "COMP", "LOOP1", "LOOP2", "LOOP3", "LOOP4",
			"INSERT", "RELAY", "GATE", "BOOST", "MOD", "PITCH", "DELAY", "REVERB", "EQ", "PRESET", "TEMPO", "TUNER",
			"MIDICC" };

	private static String[] PRESET_VALUES = new String[] { "--", "A0", "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8",
			"A9", "B0", "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "00", "01", "02", "03", "04", "05", "06",
			"07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
			"25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39" };

	private static String[] TOOGLE_VALUES = new String[] { "Toogle", "Hold" };

	public String getValue(int i) {
		// Assign
		int assignId = i % 256;
		if (assignId > ASSIGN_VALUES.length)
			return "Switch error: Assign error";
		String assign = ASSIGN_VALUES[assignId];
		int p1Id = (i / 65536);
		// Toggle / Hold
		int p2Value = (i % 65536) / 256;

//		if (p2Id > P2_VALUES.length)
//			return "Switch error: Parameter 2";

		if (assign.equals("NONE") || assign.equals("TEMPO"))
			return assign;

		if (assign.equals("PRESET")) {
			if (p1Id > PRESET_VALUES.length)
				return "Switch error: Preset Values";
			String p1 = PRESET_VALUES[p1Id];
			String p2 = String.format("%d", p2Value + 1);
			return String.format("%s %s %s", assign, p1, p2);
		}
		if (p1Id % 2 > TOOGLE_VALUES.length)
			return "Switch error: Toogle Values";
		String p1 = TOOGLE_VALUES[p1Id % 2];
		if (assign.equals("MIDICC")) {
			String p2 = String.format("%d", p2Value);
			return String.format("%s %s %s", assign, p1, p2);
		}
		return String.format("%s %s", assign, p1);
	}
// 4097 - Tempo
	// 1 - Filter
	// 13 - Delay
	// 4096 : 16
}
