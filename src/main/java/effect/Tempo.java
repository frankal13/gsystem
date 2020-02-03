package effect;

import effect.values.TempoBPM;
import effect.values.TempoTime;

public class Tempo {
	private static final int BPM_OFFSET = 6;
	private boolean preset;
	private String bpm;
	private String time;

	public void set(byte[] xtra) {

		int bpmValue = BYTES.twoFull(xtra, BPM_OFFSET);
		bpm = new TempoBPM().get(bpmValue);
		time = new TempoTime().get(bpmValue);
	}

	public boolean isPreset() {
		return preset;
	}

	public String getBpm() {
		return bpm;
	}

	public String getTime() {
		return time;
	}

}
