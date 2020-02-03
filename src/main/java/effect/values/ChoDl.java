package effect.values;

import effect.ValueList;

public class ChoDl implements ValueList {

	public String getValue(int i) {
		return String.format("%.1fms", i / 10.0);
	}
}
