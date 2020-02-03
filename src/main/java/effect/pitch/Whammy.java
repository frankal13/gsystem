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
 * Whammy Der Whammy-Effekt erzeugt eine zusätzliche Stimme, deren Tonhöhe Sie
 * mit einem Expression-Pedal steuern können. Wenn Sie ein Werkspreset
 * auswählen, das den Whammy-Effekt verwendet, kann ein an die Buchse »Exp.«
 * angeschlossenes Expression-Pedal zur Steuerung des »Pitch«-Parameters für
 * diesen Effekt verwendet werden – d.h., es dient als WhammyPedal.
 * 
 * Parameter »Pitch« (Tonhöhe) Wertebereich: 0 bis 100 % Mit diesem Parameter
 * legen Sie das Mischungsverhältnis zwischen trockenem (unbearbeitetem) Signal
 * und bearbeitetem Signal fest. Wenn sie ihn auf »100 %« einstellen, ist die
 * unbearbeitete Gitarre nicht hörbar, sondern nur das bearbeitete
 * (»transponierte«) Signal (dies gilt nur für den seriellen Modus und den
 * halb-parallelen Modus).
 * 
 * Parameter »Dir« (Richtung) Werte: »Up« / »Down« Mit diesem Parameter geben
 * Sie an, ob das angeschlossene Expression-Pedal die Tonhöhe beim Betätigen des
 * Pedals nach oben oder unten ändern soll. Die Standardeinstellung (»Up«)
 * erhöht die Tonhöhe, wenn das Pedal nach vorne gedrückt wird. Parameter
 * »Range« Werte: »1-Oct« / »2-Oct« Mit diesem Parameter legen Sie den Umfang
 * der Tonhöhenänderung fest. Verwenden Sie »2-Oct« für einen extremen und
 * »1-Oct« für den üblichen, subtileren WhammyEffekt.
 * 
 * Parameter »OutLev« (Ausgangspegel) Wertebereich: -100 bis 0 dB Mit diesem
 * Parameter legen Sie den gesamten Ausgangspegel für diesen Effekt fest.
 * 
 * Parameter »Enable« Wertebereich: »Off« / »On« Mit diesem Parameter legen Sie
 * den Status des Effekts fest (anoder ausgeschaltet). Alle für diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 */
