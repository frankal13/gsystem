package effect.values;

public class TempoTime {

	public String get(int bpmValue) {
		int timeInMs = (bpmValue - 0x6987);
		return String.format("%d", timeInMs);
	}

}
