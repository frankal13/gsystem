package effect.pitch;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.PitchDelay;
import effect.values.Voice;

public class Detune extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Detune";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Voice 1", 102, 4, new Voice()),
				new ParameterTemplate("Voice 2", 108, 4, new Voice()),
				new ParameterTemplate("Level 1", 60, new OutLev()), new ParameterTemplate("Level 2", 66, new OutLev()),
				new ParameterTemplate("Delay 1", 36, 4, new PitchDelay()),
				new ParameterTemplate("Delay 2", 42, 4, new PitchDelay()), new ParameterTemplate("Mix", 72),
				new ParameterTemplate("OutLev", 78, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}

/*
 * Detune Der Klang des Detune-Effekts ähnelt dem Chorus-Effekt.: Das Signal
 * wird gesplittet, und ein bestimmter Teil des Signals wird um ein
 * einstellbares Intervall verstimmt. Die Einstellung erfolgt in Cent (100 Cent
 * entsprechen einem Halbton). Der Hauptunterschied zwischen dem Detune- und dem
 * ChorusEffekt ist, dass sich beim Detune-Effekt der Grad der Verstimmung nicht
 * ändert die modulierte Tonhöhe wird als fester Abstand zur Originaltonhöhe
 * definiert. Der Detune-Effekt umfasst zwei Stimmen. Wenn Ihr Sound etwas zu
 * direkt und sauber klingt, verstimmen Sie diese beide Stimmen um wenige Cent
 * gegeneinander – beispielsweise Stimme 1 auf +2 Cent und Stimme 2 auf -3 Cent.
 * 
 * Parameter »Voice1« Wertebereich: -100 bis 100 Cent Mit diesem Parameter legen
 * Sie die Tonhöhenverschiebung für die erste Stimme im Detune-Block fest.
 * 
 * Parameter »Voice2« Wertebereich: -100 bis 100 Cent Mit diesem Parameter legen
 * Sie die Tonhöhenverschiebung für die zweite Stimme im Detune-Block fest.
 * 
 * Parameter »Delay 1« Wertebereich: 0 bis 350 ms Mit diesem Parameter legen Sie
 * die Verzögerung für die erste Stimme fest.
 * 
 * Parameter »Delay 2« Wertebereich: 0 bis 350 ms Mit diesem Parameter legen Sie
 * die Verzögerung für die zweite Stimme fest. Parameter »Mix« Wertebereich: 0
 * bis 100 % Mit diesem Parameter legen Sie das Mischungsverhältnis zwischen
 * trockenem (unbearbeitetem) Signal und dem Pegel des Effekts für diesen
 * Effektblock fest.
 * 
 * Parameter »OutLev« (Ausgangspegel) Wertebereich: -100 bis 0 dB Mit diesem
 * Parameter legen Sie den gesamten Ausgangspegel für diesen Effekt fest.
 *
 * Parameter »Enable« Werte: »Off« / »On« Mit diesem Parameter legen Sie den
 * Status des Effekts fest (anoder ausgeschaltet). Alle für diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 */
