package effect.filter;

import effect.ParameterTemplate;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Range;
import effect.values.Response;

public class TouchWah extends SubEffectFilter {

	@Override
	public String getName() {
		return "Touch Wah";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("OutLev", 60, new OutLev()),
				new ParameterTemplate("Enable", 6, new OffOn()), new ParameterTemplate("Sense", 24),
				new ParameterTemplate("Response", 30, new Response()),
				new ParameterTemplate("Range", 54, new Range()) };
	}
}
/*
 * Touch Wah Der »Wah«-Effekt entsteht, wenn ein Filter für die Anhebung eines
 * relativ schmalen Frequenzbereichs eingestellt und dieser Frequenzbereich
 * verschoben wird. Dieser »Sweep« wird durch Dynamik des Signals am Eingang des
 * Effekts gesteuert. Das bedeutet: Je stärker Sie die Saiten anschlagen, umso
 * höher der angehobene Frequenzbereich.
 * 
 * Parameter »Sense « (Empfindlichkeit) Wertebereich: 0 bis 10 Mit diesem
 * Parameter stellen Sie fest, wie empfindlich der Effekt auf den Pegel am
 * Eingang reagiert. Wenn Effekte, die sich im Signalweg vor dem Touch
 * Wah-Effekt befinden, den Pegel des Signals ändern, müssen Sie mit dem
 * Parameter »Sense« gegebenenfalls die Eingangsempfindlichkeit nachregeln.
 * 
 * Parameter »Resp« Werte: »Slow« / »Fast« Mit diesem Parameter legen Sie die
 * Geschwindigkeit des Sweep-Effekts fest.
 * 
 * Parameter »Range« Werte: »Low« oder »High« Dieser Parameter bestimmt, ob der
 * Touch Wah-Effekt eher auf tiefe oder hohe Frequenzen ansprechen soll.
 *
 * Parameter »OutLev« (Ausgangspegel) Wertebereich: -100 bis 0 dB Mit diesem
 * Parameter legen Sie den gesamten Ausgangspegel für diesen Effekt fest.
 * 
 * Parameter »Enable« Werte: »Off« / »On« Mit diesem Parameter legen Sie den
 * Status des Effekts fest (anoder ausgeschaltet). Alle für diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 */