package effect.delay;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.DelayTime;
import effect.values.Freq20Hz220kHz;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.SingleDelayFeedback;
import effect.values.SingleDelayTempo;
import effect.values.TapeDelayDrive;

public class TapeDelay extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Tape Delay";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Delaytime", 12, 4, new DelayTime()),
				new ParameterTemplate("Tempo", 30, new SingleDelayTempo()),
				new ParameterTemplate("Drive", 72, new TapeDelayDrive()),
				new ParameterTemplate("Feedback", 54, new SingleDelayFeedback()),
				new ParameterTemplate("FB LowCut", 96, new Freq20Hz220kHz()),
				new ParameterTemplate("FB HiCut", 90, new Freq20Hz220kHz()), new ParameterTemplate("Mix", 114),
				new ParameterTemplate("OutLev", 120, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}
/*
 * Parameter »Drive« Wertebereich: 0 bis 24 dB Mit diesem Parameter können Sie
 * die geringfügige Verschlechterung der Signalqualität bei den Wiederholungen
 * simulieren, die – neben den Verlusten im oberen Frequenzbereich – eine
 * charakteristische Eigenschaft historischer Bandechos war. Reverse Delay Das
 * Reverse Delay eignet si
 */
