package effect.values;

import effect.ValueList;

public class Freq20Hz220kHz implements ValueList {

	private static String[] VALUES = new String[] { "20.0 Hz", "22.4 Hz", "25.0 Hz", "28.0 Hz", "31.5 Hz", "35.5 Hz",
			"40.0 Hz", "45.0 Hz", "50.0 Hz", "56.0 Hz", "63.0 Hz", "71.0 Hz", "80.0 Hz", "90.0 Hz", "100 Hz", "112 Hz",
			"125 Hz", "140 Hz", "160 Hz", "180 Hz", "200 Hz", "224 Hz", "250 Hz", "280 Hz", "315 Hz", "355 Hz",
			"400 Hz", "450 Hz", "500 Hz", "560 Hz", "630 Hz", "710 Hz", "800 Hz", "900 Hz", "1.00 kHz", "1.12 kHz",
			"1.25 kHz", "1.40 kHz", "1.60 kHz", "1.80 kHz", "2.00 kHz", "2.24 kHz", "2.50 kHz", "2.80 kHz", "3.15 kHz",
			"3.55 kHz", "4.00 kHz", "4.50 kHz", "5.00 kHz", "5.60 kHz", "6.30 kHz", "7.10 kHz", "8.00 kHz", "9.00 kHz",
			"10.0 kHz", "11.2 kHz", "12.5 kHz", "14.0 kHz", "14.0 kHz", "16.0 kHz", "18.0 kHz", "20.0 kHz" };

	public String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

}
