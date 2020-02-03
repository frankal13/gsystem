package effect.mod;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.BypassMode;
import effect.values.Depth;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Speed;
import effect.values.Tempo;
import effect.values.VintageUnivibeAttackAndRelease;
import effect.values.VintageUnivibeSpeed;

public class ModernUniVibe extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Modern UniVibe";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Speed1", 36, new Speed()),
				new ParameterTemplate("Speed2", 42, new Speed()), new ParameterTemplate("Depth", 30, new Depth()),
				new ParameterTemplate("Tempo1", 18, new Tempo()), new ParameterTemplate("Tempo2", 24, new Tempo()),
				new ParameterTemplate("Attack", 48, 4, new VintageUnivibeAttackAndRelease()),
				new ParameterTemplate("Release", 54, 4, new VintageUnivibeAttackAndRelease()),
				new ParameterTemplate("Speed Select", 60, new VintageUnivibeSpeed()),
				new ParameterTemplate("Bypass Mode", 12, new BypassMode()),
				new ParameterTemplate("Phase Reverse", 66, new OffOn()), new ParameterTemplate("Mix", 72),
				new ParameterTemplate("OutLev", 78, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}
