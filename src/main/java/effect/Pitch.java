package effect;

import effect.pitch.Detune;
import effect.pitch.Doubler;
import effect.pitch.IntelligentPitchShifter;
import effect.pitch.Octaver;
import effect.pitch.PitchShifter;
import effect.pitch.Whammy;

public class Pitch extends EffectTemplate {

	@Override
	public String getEffectName() {
		return "Pitch";
	}

	@Override
	public int getEffectOffset() {
		return 0x138; // 0x150;
	}

	@Override
	public int getSubEffectIdOffset() {
		return 0;
	}

	@Override
	public SubEffectTemplate[] getSubEffects() {
		return new SubEffectTemplate[] { new PitchShifter(), new Octaver(), new Whammy(), new Detune(),
				new IntelligentPitchShifter(), new Doubler() };
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