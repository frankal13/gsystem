package effect.filter;

import effect.ParameterTemplate;
import effect.values.LMH;
import effect.values.OffOn;
import effect.values.OutLev;

public class Formant extends SubEffectFilter {

	@Override
	public String getName() {
		return "Formant";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Low", 24, new LMH()),
				new ParameterTemplate("Mid", 30, new LMH()), new ParameterTemplate("High", 36, new LMH()),
				new ParameterTemplate("Sweep", 42), new ParameterTemplate("Bright", 48),
				new ParameterTemplate("Resonance", 54), new ParameterTemplate("OutLev", 84, new OutLev()),
				new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}

/*
 * Formant-Parameter �
 * 
 * Allgemein Parameter �Low� / �Mid� / �High� Werte: �Heat� / �Hit� / �Head� /
 * �Had� / �But� / �Father� / �All� / �Boot� / �Foot� und �Bird�. Wir haben die
 * Einstellungen f�r diesen Parameter mit W�rtern benannt, die (im Englischen)
 * phonetisch dem Klang des entsprechenden Formantfilters entsprechen.
 * 
 * Parameter �Sweep� (Frequenz) Wertebereich: 0 bis 100 % Wenn Sie dem
 * �Sweep�-Parameter ein Expression-Pedal zuweisen, k�nnen Sie die vom
 * Formantfilter nachgebildeten Vokale in Echtzeit steuern.
 * 
 * Parameter �Bright� Wertebereich: 0 bis 100 % Je nach Einstellung der
 * Parameter �Low�, �Mid� und �High� m�ssen Sie gegebenenfalls mit diesem
 * Parameter den oberen Frequenzbereich des Effekts mit diesem Parameter
 * justieren.
 * 
 * Parameter �Resonance� Wertebereich: 0 bis 100 % Verwenden Sie diesen
 * Parameter, um die Anhebung durch den Filter zu steuern. Seien Sie dabei
 * vorsichtig, da sehr hohe Werte in Verbindung mit bestimmten Formanten
 * unangenehm klingen k�nnen.
 * 
 * Parameter �OutLev� (Ausgangspegel) Wertebereich: -100 bis 0dB Mit diesem
 * Parameter legen Sie den gesamten Ausgangspegel f�r diesen Effekt fest.
 * 
 * Parameter �Enable� Wertebereich: �Off� / �On� Mit diesem Parameter legen Sie
 * den Status des Effekts fest (anoder ausgeschaltet). Alle f�r diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird
 */
