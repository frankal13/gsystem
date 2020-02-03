package effect.delay;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.DelayTime;
import effect.values.Freq20Hz220kHz;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Pan;
import effect.values.SingleDelayFeedback;
import effect.values.SingleDelayTempo;

public class DualDelay extends SubEffectTemplate {

	@Override
	public String getName() {
		return "Dual Delay";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Delay 1", 12, 4, new DelayTime()),
				new ParameterTemplate("Delay 2", 24, 4, new DelayTime()),
				new ParameterTemplate("Tempo 1", 30, new SingleDelayTempo()),
				new ParameterTemplate("Tempo 2", 42, new SingleDelayTempo()),
				new ParameterTemplate("Feedback 1", 54, new SingleDelayFeedback()),
				new ParameterTemplate("Feedback 2", 66, new SingleDelayFeedback()),
				new ParameterTemplate("FB LowCut", 96, new Freq20Hz220kHz()),
				new ParameterTemplate("FB HiCut", 90, new Freq20Hz220kHz()),
				new ParameterTemplate("Pan 1", 102, new Pan()), new ParameterTemplate("Pan 2", 108, new Pan()),
				new ParameterTemplate("Mix", 114), new ParameterTemplate("OutLev", 120, new OutLev()),
				new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}

/*
 * Dual Delay Dieses echte Dual Delay bietet zwei Verzögerungsleitungen, von
 * denen jede ihren eigenen Tempoparameter, einen Lowcutund einen Highcutfilter
 * sowie einen Panoramaregler hat. Neben den »allgemeinen« Parametern, die in
 * der Einleitung des Abschnitts über den Delayeffekt beschrieben werden, ist
 * dieses Delay außerdem mit den folgenden Parametern ausgestattet:
 * 
 * Parameter »Pan1« und »Pan2« Wertebereich: 50L bis 50R Mit diesen beiden
 * Parametern legen Sie die Position der Delays 1 und 2 im Stereopanorama fest.
 */