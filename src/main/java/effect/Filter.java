package effect;

import effect.filter.AutoFormant;
import effect.filter.AutoResFilter;
import effect.filter.AutoWah;
import effect.filter.Formant;
import effect.filter.ResonanceFilter;
import effect.filter.TouchFormant;
import effect.filter.TouchResFilter;
import effect.filter.TouchWah;
import effect.filter.WahWah;

public class Filter extends EffectTemplate {

	@Override
	public String getEffectName() {
		return "Filter";
	}

	@Override
	public int getEffectOffset() {
		return 0x7e; // 96; --> 0x18
	}

	@Override
	public int getSubEffectIdOffset() {
		return 0;
	}

	@Override
	public SubEffectTemplate[] getSubEffects() {
		return new SubEffectTemplate[] { new ResonanceFilter(), new TouchResFilter(), new AutoResFilter(), new WahWah(),
				new TouchWah(), new AutoWah(), new Formant(), new TouchFormant(), new AutoFormant() };
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