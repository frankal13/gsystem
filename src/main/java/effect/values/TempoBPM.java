package effect.values;

public class TempoBPM {

	public String get(int bpmValue) {
		int timeInMs = bpmValue - 0x6987;
		int bpm = 60000 / timeInMs;
		return String.format("%d BPM", bpm);
	}

}
