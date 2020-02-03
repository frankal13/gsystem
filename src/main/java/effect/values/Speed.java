package effect.values;

import effect.ValueList;

public class Speed implements ValueList {

	private static String[] VALUES = new String[] { "50.0mHz", "51.5mHz", "53.0mHz", "54.5mHz", "56.0mHz", "58.0mHz",
			"60.0mHz", "61.5mHz", "63.0mHz", "65.0mHz", "67.0mHz", "69.0mHz", "71.0mHz", "73.0mHz", "75.0mHz",
			"77.5mHz", "80.0mHz", "82.5mHz", "85.0mHz", "87.5mHz", "90.0mHz", "92.5mHz", "95.0mHz", "97.5mHz", "100mHz",
			"103mHz", "106mHz", "109mHz", "112mHz", "115mHz", "118mHz", "122mHz", "125mHz", "128mHz", "132mHz",
			"136mHz", "140mHz", "145mHz", "150mHz", "155mHz", "160mHz", "165mHz", "170mHz", "175mHz", "180mHz",
			"185mHz", "190mHz", "195mHz", "200mHz", "206mHz", "212mHz", "218mHz", "224mHz", "230mHz", "236mHz",
			"243mHz", "250mHz", "258mHz", "265mHz", "272mHz", "280mHz", "290mHz", "300mHz", "307mHz", "315mHz",
			"325mHz", "335mHz", "345mHz", "355mHz", "365mHz", "375mHz", "387mHz", "400mHz", "412mHz", "425mHz",
			"437mHz", "450mHz", "462mHz", "475mHz", "487mHz", "500mHz", "515mHz", "530mHz", "545mHz", "560mHz",
			"580mHz", "600mHz", "615mHz", "630mHz", "650mHz", "670mHz", "690mHz", "710mHz", "730mHz", "750mHz",
			"775mHz", "800mHz", "825mHz", "850mHz", "875mHz", "900mHz", "925mHz", "950mHz", "975mHz", "1.00Hz",
			"1.03Hz", "1.06Hz", "1.09Hz", "1.12Hz", "1.15Hz", "1.18Hz", "1.22Hz", "1.25Hz", "1.28Hz", "1.32Hz",
			"1.36Hz", "1.40Hz", "1.45Hz", "1.50Hz", "1.55Hz", "1.60Hz", "1.65Hz", "1.70Hz", "1.75Hz", "1.80Hz",
			"1.85Hz", "1.90Hz", "1.95Hz", "2.00Hz", "2.06Hz", "2.12Hz", "2.18Hz", "2.24Hz", "2.30Hz", "2.36Hz",
			"2.43Hz", "2.50Hz", "2.58Hz", "2.65Hz", "2.72Hz", "2.80Hz", "2.90Hz", "3.00Hz", "3.07Hz", "3.15Hz",
			"3.25Hz", "3.35Hz", "3.45Hz", "3.55Hz", "3.65Hz", "3.75Hz", "3.87Hz", "4.00Hz", "4.12Hz", "4.25Hz",
			"4.37Hz", "4.50Hz", "4.62Hz", "4.75Hz", "4.87Hz", "5.00Hz", "5.15Hz", "5.30Hz", "5.45Hz", "5.60Hz",
			"5.80Hz", "6.00Hz", "6.15Hz", "6.30Hz", "6.50Hz", "6.70Hz", "6.90Hz", "7.10Hz", "7.30Hz", "7.50Hz",
			"7.75Hz", "8.00Hz", "8.25Hz", "8.50Hz", "8.75Hz", "9.00Hz", "9.25Hz", "9.50Hz", "9.75Hz", "10.0Hz",
			"10.3Hz", "10.6Hz", "10.9Hz", "11.2Hz", "11.5Hz", "11.8Hz", "12.2Hz", "12.5Hz", "12.8Hz", "13.2Hz",
			"13.6Hz", "14.0Hz", "14.5Hz", "15.0Hz", "15.5Hz", "16.0Hz", "16.5Hz", "17.0Hz", "17.5Hz", "18.0Hz",
			"18.5Hz", "19.0Hz", "19.5Hz", "20.0Hz" };

	public String getValue(int i) {
		return VALUES[i];
	}

}
