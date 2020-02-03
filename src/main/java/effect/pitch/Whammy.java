package effect.pitch;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.Direction;
import effect.values.OctaverRange;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.WhammyPitch;

public class Whammy extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Whammy";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Pitch", 96, new WhammyPitch()),
				new ParameterTemplate("Direction", 84, new Direction()),
				new ParameterTemplate("Range", 90, new OctaverRange()), new ParameterTemplate("Mix", 72),
				new ParameterTemplate("OutLev", 78, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}

/*
 * Whammy Der Whammy-Effekt erzeugt eine zus�tzliche Stimme, deren Tonh�he Sie
 * mit einem Expression-Pedal steuern k�nnen. Wenn Sie ein Werkspreset
 * ausw�hlen, das den Whammy-Effekt verwendet, kann ein an die Buchse �Exp.�
 * angeschlossenes Expression-Pedal zur Steuerung des �Pitch�-Parameters f�r
 * diesen Effekt verwendet werden � d.h., es dient als WhammyPedal.
 * 
 * Parameter �Pitch� (Tonh�he) Wertebereich: 0 bis 100 % Mit diesem Parameter
 * legen Sie das Mischungsverh�ltnis zwischen trockenem (unbearbeitetem) Signal
 * und bearbeitetem Signal fest. Wenn sie ihn auf �100 %� einstellen, ist die
 * unbearbeitete Gitarre nicht h�rbar, sondern nur das bearbeitete
 * (�transponierte�) Signal (dies gilt nur f�r den seriellen Modus und den
 * halb-parallelen Modus).
 * 
 * Parameter �Dir� (Richtung) Werte: �Up� / �Down� Mit diesem Parameter geben
 * Sie an, ob das angeschlossene Expression-Pedal die Tonh�he beim Bet�tigen des
 * Pedals nach oben oder unten �ndern soll. Die Standardeinstellung (�Up�)
 * erh�ht die Tonh�he, wenn das Pedal nach vorne gedr�ckt wird. Parameter
 * �Range� Werte: �1-Oct� / �2-Oct� Mit diesem Parameter legen Sie den Umfang
 * der Tonh�hen�nderung fest. Verwenden Sie �2-Oct� f�r einen extremen und
 * �1-Oct� f�r den �blichen, subtileren WhammyEffekt.
 * 
 * Parameter �OutLev� (Ausgangspegel) Wertebereich: -100 bis 0 dB Mit diesem
 * Parameter legen Sie den gesamten Ausgangspegel f�r diesen Effekt fest.
 * 
 * Parameter �Enable� Wertebereich: �Off� / �On� Mit diesem Parameter legen Sie
 * den Status des Effekts fest (anoder ausgeschaltet). Alle f�r diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 */
