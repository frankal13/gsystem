package effect;

public class Boost {
	private static final int BOOST_OFFSET = 0x2a;
	private String boost;

	public void set(byte[] body) {
		int b = body[BOOST_OFFSET];
		boost = String.format("%d dB", b);
	}

	public String getBoost() {
		return boost;
	}
}
