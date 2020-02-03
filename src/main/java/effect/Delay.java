package effect;

import effect.delay.DualDelay;
import effect.delay.DynamicDelay;
import effect.delay.LoFiDelay;
import effect.delay.PingPongDelay;
import effect.delay.ReverseDelay;
import effect.delay.SingleDelay;
import effect.delay.TapeDelay;

public class Delay extends EffectTemplate {

	@Override
	public String getEffectName() {
		return "Delay";
	}

	@Override
	public int getEffectOffset() {
		return 0x234; // 0x24c;
	}

	@Override
	public int getSubEffectIdOffset() {
		return 0;
	}

	@Override
	public SubEffectTemplate[] getSubEffects() {
		return new SubEffectTemplate[] { new SingleDelay(), new TapeDelay(), new ReverseDelay(), new LoFiDelay(),
				new PingPongDelay(), new DynamicDelay(), new DualDelay() };
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