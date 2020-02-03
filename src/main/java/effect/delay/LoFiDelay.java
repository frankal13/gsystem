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

public class LoFiDelay extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Lo Fi Delay";
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
 * Lo Fi Delay Das Lo-Fi Delay erzeugt besonders prägnante Delays.
 * Experimentieren Sie mit den Parametern »Clip«, »Feedback LoCut« und »Feedback
 * HiCut«, um den Klang des Lo Fi Delays Ihren Vorstellungen anzupassen. Neben
 * den »allgemeinen« Parametern, die in der Einleitung des Abschnitts über den
 * Delayeffekt beschrieben werden, ist dieses Delay außerdem mit den folgenden
 * Parametern ausgestattet:
 * 
 * Parameter »Drive« Wertebereich: 0 bis 24 dB Je höher Sie den
 * »Drive«-Parameter einstellen, umso stärker werden die von diesem Delay
 * erzeugten Wiederholungen verzerrt. Der mit dem »Drive«-Parameter erzeugte
 * Effekt klingt ausgesprochen »analog«.
 */