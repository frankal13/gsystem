package global.pedal.values;

import effect.ValueList;

public class MasterVolumeControlAssignment implements ValueList {

	private static String[] VALUES = new String[] { "NONE", "Vol. Pedal", "Exp. Pedal", "Encoder A", "Encoder B",
			"Encoder C" };

	public String getValue(int i) {
		if (i >= VALUES.length)
			return "Error TunerMode:" + i;
		return VALUES[i];
	}

}
