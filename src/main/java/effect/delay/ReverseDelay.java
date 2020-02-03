package effect.delay;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.DelayTime;
import effect.values.Freq20Hz220kHz;
import effect.values.Mix;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.SingleDelayFeedback;
import effect.values.SingleDelayTempo;

public class ReverseDelay extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Reverse Delay";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Delaytime", 12, 4, new DelayTime()),
				new ParameterTemplate("Tempo", 30, new SingleDelayTempo()),
				new ParameterTemplate("Feedback", 54, new SingleDelayFeedback()),
				new ParameterTemplate("FB LowCut", 96, new Freq20Hz220kHz()),
				new ParameterTemplate("FB HiCut", 90, new Freq20Hz220kHz()), new ParameterTemplate("Mix", 114, new Mix()),
				new ParameterTemplate("OutLev", 120, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}
/*
 * Reverse Delay Das Reverse Delay eignet sich hervorragender, wenn Sie einen
 * etwas mysteriösen, ungewöhnlichen Effekt benötigen. Verwenden Sie den
 * Parameter »Feedback HiCut«, um den Effekt etwas zu dämpfen.
 */
