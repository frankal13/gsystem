package effect.values;

import effect.ValueList;

public class VintagePhaserFeedback implements ValueList {
	public String getValue(int i) {
		if (i < 128)
			return String.format("%d%%", i);
		else
			return String.format("%d%%", i - 256);
	}
}
