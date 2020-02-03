package effect;

public class Relay {
	// 0000 C000 OCOO CC00 0000 COCO OCCO CCC0 000C COOC OCOC CCOC 00CC COCC OCCC
	// CCCC

	private String[] VALUES = { "0000", "C000", "OCOO", "CC00", "0000", "COCO", "OCCO", "CCC0", "000C", "COOC", "OCOC",
			"CCOC", "00CC", "COCC", "OCCC", "CCCC" };

	private static final int RELAY_OFFSET = 0x2e;
	private String ra;
	private String rb;

	public void set(byte[] body) {
		ra = getValue(body[RELAY_OFFSET]);
		rb = getValue(body[RELAY_OFFSET + 1]);
	}

	private String getValue(int i) {
		if ((i < 0) || (i >= VALUES.length))
			return "error";
		return VALUES[i];
	}

	public String getRelayA() {
		return String.format("%s", ra);
	}

	public String getRelayB() {
		return String.format("%s", rb);
	}

	public String getRelay() {
		return String.format("%s; %s", ra, rb);
	}

}
