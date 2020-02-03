package effect.filter;

import effect.ParameterTemplate;
import effect.values.AutoOn;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Range;

public class WahWah extends SubEffectFilter {

	@Override
	public String getName() {
		return "Wah Wah";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Sweep", 48),
				new ParameterTemplate("Range", 54, new Range()), new ParameterTemplate("AutoOn", 66, new AutoOn()),
				new ParameterTemplate("OutLev", 60, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()) };
	}

}

/*
 * Wah Wah Mit diesem Effekt erzielen sie dieselbe Wirkung wie mit einem
 * klassischen Wah-Pedal, bei dem Sie den Effekt manuell steuern. Sie müssen
 * lediglich den »Sweep«-Parameter des Effekts einem Expression-Pedal zuordnen.
 * Wenn Sie ein Werkspreset auswählen, das den Wah Wah-Effekt verwendet, kann
 * ein an die Buchse »Exp.« angeschlossenes Expression-Pedal zur Steuerung des
 * Effekts verwendet werden.
 * 
 * Parameter »Sweep« (Frequenz) Wertebereich: 0 bis 100 % Wenn Sie ein
 * Expression-Pedal zur Steuerung dieses Parameters konfigurieren, haben Sie ein
 * vollständiges WahPedal zu Ihrer Verfügung.
 * 
 * Parameter »Range« Werte: »Low« oder »High« Mit diesem Parameter legen Sie die
 * Frequenzbereiche fest, die der Effekt primär betonen soll.
 * 
 * Parameter »AutoOn« Werte: »On« / »Off« Wenn Sie diesen Parameter auf »On«
 * stellen, schaltet das für die Steuerung des »Sweep«-Parameters konfigurierte
 * Expression-Pedal den Effekt automatisch an, sobald Sie seine Position
 * verändern. Wenn Sie das Expression-Pedal nach Aufruf des Presets nicht
 * bedienen, wird der Wah Wah-Effekt automatisch abgeschaltet.
 * 
 * Parameter »OutLev« (Ausgangspegel) Wertebereich: -100 bis 0dB Mit diesem
 * Parameter legen Sie den gesamten Ausgangspegel für diesen Effekt fest.
 * 
 * Parameter »Enable« Werte: »Off« / »On« Mit diesem Parameter legen Sie den
 * Status des Effekts fest (anoder ausgeschaltet). Alle für diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 */