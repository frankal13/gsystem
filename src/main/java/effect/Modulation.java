package effect;

import effect.mod.AdvancedChorus;
import effect.mod.AdvancedFlanger;
import effect.mod.ClassicChorus;
import effect.mod.ClassicFlanger;
import effect.mod.ModernUniVibe;
import effect.mod.Panner;
import effect.mod.SmoothPhaser;
import effect.mod.Tremolo;
import effect.mod.Vibrato;
import effect.mod.VintagePhaser;
import effect.mod.VintageUniVibe;

public class Modulation extends EffectTemplate {

	@Override
	public String getEffectName() {
		return "Modulation";
	}

	@Override
	public int getEffectOffset() {
		return 0xde; // 0xf6;
	}

	@Override
	public int getSubEffectIdOffset() {
		return 0;
	}

	@Override
	public SubEffectTemplate[] getSubEffects() {
		return new SubEffectTemplate[] { new ClassicChorus(), new AdvancedChorus(), new ClassicFlanger(),
				new AdvancedFlanger(), new Vibrato(), new VintagePhaser(), new SmoothPhaser(), new Tremolo(),
				new Panner(), new VintageUniVibe(), new ModernUniVibe() };
	}
}

//1. Länge 
//00D8: Checksum 2 byte
//2AD2 (FILTER-Resonance) 51:03, 50:$0302, 49:01, 100:$0604 --> 2 Byte für 
//
//2A9C (FILTER)
//
//Filter:
//Type: Resonance Filter, Touch Res Filter, Auto Res Filter, Wah Wah, Touch Wah, Auto Wah, Formant, Touch Formant, Auto Formant
//Style