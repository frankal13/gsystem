package effect.reverb;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.Decay;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.PreDelay;
import effect.values.ReverbDiffusion;
import effect.values.ReverbHighAndLowLevel;
import effect.values.ReverbHighColor;
import effect.values.ReverbLevel;
import effect.values.ReverbLowColor;
import effect.values.ReverbShape;
import effect.values.ReverbSize;

public class GenericReverb extends SubEffectTemplate {

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Decay", 12, new Decay()),
				new ParameterTemplate("PreDelay", 18, new PreDelay()),
				new ParameterTemplate("Shape", 24, new ReverbShape()),
				new ParameterTemplate("Size", 30, new ReverbSize()),
				new ParameterTemplate("High Color", 36, new ReverbHighColor()),
				new ParameterTemplate("High Level", 42, new ReverbHighAndLowLevel()),
				new ParameterTemplate("Low Color", 48, new ReverbLowColor()),
				new ParameterTemplate("Low Level", 54, new ReverbHighAndLowLevel()),
				new ParameterTemplate("Early", 102), new ParameterTemplate("Rev Level", 66, new ReverbLevel()),
				new ParameterTemplate("Diffusion", 72, new ReverbDiffusion()), new ParameterTemplate("Mix", 78),
				new ParameterTemplate("OutLev", 84, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}
