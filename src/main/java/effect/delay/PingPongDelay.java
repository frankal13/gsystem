package effect.delay;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.DelayTime;
import effect.values.Freq20Hz220kHz;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.PingPongDelayWidth;
import effect.values.SingleDelayFeedback;
import effect.values.SingleDelayTempo;

public class PingPongDelay extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Ping Pong Delay";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Delaytime", 12, 4, new DelayTime()),
				new ParameterTemplate("Tempo", 30, new SingleDelayTempo()),
				new ParameterTemplate("Width", 126, new PingPongDelayWidth()),
				new ParameterTemplate("Feedback", 54, new SingleDelayFeedback()),
				new ParameterTemplate("FB LowCut", 96, new Freq20Hz220kHz()),
				new ParameterTemplate("FB HiCut", 90, new Freq20Hz220kHz()), new ParameterTemplate("Mix", 114),
				new ParameterTemplate("OutLev", 120, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}
/*
 * Ping Pong Delay Mit dem PingPong-Delay können Sie die Wiederholungen des
 * Signals abwechselnd auf der linken und rechten Seite des Stereopanoramas
 * erscheinen lassen. So entstehen interessante Stereoeffekte. Verwenden Sie den
 * »Width«-Parameter, um die Intensität des Stereoeffekts zu definieren. Neben
 * den »allgemeinen« Parametern, die in der Einleitung des Abschnitts über den
 * Delayeffekt beschrieben werden, ist dieses Delay außerdem mit den folgenden
 * Parametern ausgestattet:
 * 
 * Parameter » Width« Wertebereich: 0 bis 100% Der »Width«-Parameter legt fest,
 * wie weit entfernt vom Stereozentrum die Delays positioniert werden sollen.
 */
