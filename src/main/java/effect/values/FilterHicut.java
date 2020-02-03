package effect.values;

import effect.ValueList;

public class FilterHicut implements ValueList {

	private static String[] VALUES = new String[] { "160 Hz", "180 Hz", "200 Hz", "224 Hz", "250 Hz", "280 Hz",
			"315 Hz", "355 Hz", "400 Hz", "450 Hz", "500 Hz", "560 Hz", "630 Hz", "710 Hz", "800 Hz", "900 Hz",
			"1.00 kHz", "1.12 kHz", "1.25 kHz", "1.40 kHz", "1.60 kHz", "1.80 kHz", "2.00 kHz", "2.24 kHz", "2.50 kHz",
			"2.80 kHz", "3.15 kHz", "3.55 kHz", "4.00 kHz", "4.50 kHz", "5.00 kHz", "5.60 kHz", "6.30 kHz", "7.10 kHz",
			"8.00 kHz", "9.00 kHz", "10.0 kHz", "11.2 kHz", "12.5 kHz", "14.0 kHz" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
