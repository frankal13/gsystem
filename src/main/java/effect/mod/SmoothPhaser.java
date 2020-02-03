package effect.mod;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.Depth;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Range;
import effect.values.Speed;
import effect.values.Tempo;
import effect.values.VintagePhaserFeedback;

public class SmoothPhaser extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Smooth Phaser";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Speed", 24, new Speed()),
				new ParameterTemplate("Tempo", 18, new Tempo()), new ParameterTemplate("Depth", 30, new Depth()),
				new ParameterTemplate("Feedback", 36, new VintagePhaserFeedback()),
				new ParameterTemplate("Range", 42, new Range()), new ParameterTemplate("Reverse", 48, new OffOn()),
				new ParameterTemplate("Mix", 54), new ParameterTemplate("OutLev", 60, new OutLev()),
				new ParameterTemplate("Enable", 6, new OffOn()) };
	}

}
