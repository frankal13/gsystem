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
 * Octaver Der Octaver erzeugt eine zus�tzliche Stimme, die in einem
 * festgelegten Abstand von plus oder minus ein oder zwei Oktaven der
 * Originaltonh�he folgt.
 * 
 * Parameter �Direct� Werte: �Up� oder �Down� Mit diesem Parameter geben Sie an,
 * ob die zus�tzliche Stimme ober- oder unterhalb der Originaltonh�he erklingen
 * sollte.
 * 
 * Parameter �Range� Werte: �1 Octave�/ �2 Octaves� Mit diesem Parameter legen
 * Sie das Intervall f�r die vom Octaver erzeugte Stimme fest. Mit dem Parameter
 * �Direct� geben Sie an, ob die zus�tzliche Stimme ober- oder unterhalb der
 * Originaltonh�he erklingen sollte.
 * 
 * Parameter �Mix� Werte: 0 bis 100 % Mit diesem Parameter legen Sie das
 * Mischungsverh�ltnis zwischen trockenem (unbearbeitetem) Signal und dem Pegel
 * des Effekts f�r diesen Effektblock fest.
 * 
 * Parameter �OutLev� (Ausgangspegel) Werte: -100 bis 0 dB Mit diesem Parameter
 * legen Sie den gesamten Ausgangspegel f�r diesen Effekt fest.
 * 
 * Parameter �Enable� Werte: �Off� / �On� Mit diesem Parameter legen Sie den
 * Status des Effekts fest (anoder ausgeschaltet). Alle f�r diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 */
