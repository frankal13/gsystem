package effect.pitch;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.IntelligentPitchShifterKey;
import effect.values.IntelligentPitchShifterVoice;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Pan;
import effect.values.PitchDelay;
import effect.values.PitchFeedback;
import effect.values.Scale;

public class IntelligentPitchShifter extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Intelligent Pitch Shifter";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Voice 1", 12, new IntelligentPitchShifterVoice()),
				new ParameterTemplate("Voice 2", 18, new IntelligentPitchShifterVoice()),
				new ParameterTemplate("Key", 48, new IntelligentPitchShifterKey()),
				new ParameterTemplate("Scale", 54, new Scale()), new ParameterTemplate("Level 1", 60, new OutLev()),
				new ParameterTemplate("Level 2", 66, new OutLev()), new ParameterTemplate("Pan 1", 24, new Pan()),
				new ParameterTemplate("Pan 2", 30, new Pan()),
				new ParameterTemplate("Delay 1", 36, 4, new PitchDelay()),
				new ParameterTemplate("Delay 2", 42, 4, new PitchDelay()),
				new ParameterTemplate("Feedback 1", 48, new PitchFeedback()),
				new ParameterTemplate("Feedback 2", 54, new PitchFeedback()), new ParameterTemplate("Mix", 72),
				new ParameterTemplate("OutLev", 78, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}
