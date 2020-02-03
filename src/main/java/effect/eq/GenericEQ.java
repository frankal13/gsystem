package effect.eq;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.EQGain;
import effect.values.EQWidth;
import effect.values.Freq20Hz220kHz;
import effect.values.OffOn;

public class GenericEQ extends SubEffectTemplate {

	public String getName() {
		return "EQ";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Gain 1", 36, new EQGain()),
				new ParameterTemplate("Frequency 1", 42, new Freq20Hz220kHz()),
				new ParameterTemplate("Width 1", 48, new EQWidth()), new ParameterTemplate("Gain 2", 54, new EQGain()),
				new ParameterTemplate("Frequency 2", 60, new Freq20Hz220kHz()),
				new ParameterTemplate("Width 2", 66, new EQWidth()), new ParameterTemplate("Gain 3", 72, new EQGain()),
				new ParameterTemplate("Frequency 3", 78, new Freq20Hz220kHz()),
				new ParameterTemplate("Width 3", 84, new EQWidth()), new ParameterTemplate("Enable", 90, new OffOn()) };
	}
}
