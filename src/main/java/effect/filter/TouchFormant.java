package effect.filter;

import effect.ParameterTemplate;
import effect.values.LMH;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Response;

public class TouchFormant extends SubEffectFilter {

	@Override
	public String getName() {
		return "Touch Formant";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Low", 24, new LMH()),
				new ParameterTemplate("Mid", 30, new LMH()), new ParameterTemplate("High", 36, new LMH()),
				new ParameterTemplate("Sweep", 42), new ParameterTemplate("Bright", 48),
				new ParameterTemplate("Sense", 60), new ParameterTemplate("Response", 66, new Response()),
				new ParameterTemplate("Resonance", 54), new ParameterTemplate("OutLev", 84, new OutLev()),
				new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}

/*
 * Der Touch Formant-Effekt wird – vergleichbar mit dem Touch Wah – durch die
 * Dynamik des Signals am Eingang gesteuert.
 * 
 * Parameter »Sensitivity« Wertebereich: 0 bis 10 Passen Sie mit diesem
 * Parameter die Empfindlichkeit des Effekts der Basislautstärke des Presets an,
 * in dem Sie ihn verwenden.
 * 
 * Parameter »Response« Werte: »Slow« / »Fast« Mit diesem Parameter legen Sie
 * die Geschwindigkeit des Sweep-Effekts fest.
 */