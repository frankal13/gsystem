package effect;

import effect.compressor.AdvancedCompressor;
import effect.compressor.PercusiveCompressor;
import effect.compressor.SustainCompressor;

public class Compressor extends EffectTemplate {

	@Override
	public String getEffectName() {
		return "Compressor";
	}

	@Override
	public int getEffectOffset() {
		return 0x42; // 0x05a;
	}

	@Override
	public int getSubEffectIdOffset() {
		return 0;
	}

	@Override
	public SubEffectTemplate[] getSubEffects() {
		return new SubEffectTemplate[] { new AdvancedCompressor(), new SustainCompressor(), new PercusiveCompressor() };
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