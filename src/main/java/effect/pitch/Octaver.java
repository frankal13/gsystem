package effect.pitch;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.Direction;
import effect.values.OctaverRange;
import effect.values.OffOn;
import effect.values.OutLev;

public class Octaver extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Octaver";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Direction", 84, new Direction()),
				new ParameterTemplate("Range", 90, new OctaverRange()), new ParameterTemplate("Mix", 72),
				new ParameterTemplate("OutLev", 78, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}

/*
 * Octaver Der Octaver erzeugt eine zusätzliche Stimme, die in einem
 * festgelegten Abstand von plus oder minus ein oder zwei Oktaven der
 * Originaltonhöhe folgt.
 * 
 * Parameter »Direct« Werte: »Up« oder »Down« Mit diesem Parameter geben Sie an,
 * ob die zusätzliche Stimme ober- oder unterhalb der Originaltonhöhe erklingen
 * sollte.
 * 
 * Parameter »Range« Werte: »1 Octave«/ »2 Octaves« Mit diesem Parameter legen
 * Sie das Intervall für die vom Octaver erzeugte Stimme fest. Mit dem Parameter
 * »Direct« geben Sie an, ob die zusätzliche Stimme ober- oder unterhalb der
 * Originaltonhöhe erklingen sollte.
 * 
 * Parameter »Mix« Werte: 0 bis 100 % Mit diesem Parameter legen Sie das
 * Mischungsverhältnis zwischen trockenem (unbearbeitetem) Signal und dem Pegel
 * des Effekts für diesen Effektblock fest.
 * 
 * Parameter »OutLev« (Ausgangspegel) Werte: -100 bis 0 dB Mit diesem Parameter
 * legen Sie den gesamten Ausgangspegel für diesen Effekt fest.
 * 
 * Parameter »Enable« Werte: »Off« / »On« Mit diesem Parameter legen Sie den
 * Status des Effekts fest (anoder ausgeschaltet). Alle für diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 */
