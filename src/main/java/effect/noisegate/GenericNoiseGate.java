package effect.noisegate;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.NoiseGateMode;
import effect.values.NoiseGateSpeed;
import effect.values.NoiseGateThreshhold;
import effect.values.OffOn;

public class GenericNoiseGate extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Noise Gate";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Mode", 102, new NoiseGateMode()),
				new ParameterTemplate("Threshhold", 108, new NoiseGateThreshhold()),
				new ParameterTemplate("Damping", 114, new NoiseGateDamping()),
				new ParameterTemplate("Speed", 120, new NoiseGateSpeed()),
				new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}
