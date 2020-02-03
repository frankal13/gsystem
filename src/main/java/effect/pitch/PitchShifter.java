package effect.pitch;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Pan;
import effect.values.PitchDelay;
import effect.values.PitchFeedback;
import effect.values.Voice;

public class PitchShifter extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Pitch Shifter";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Voice 1", 12, 4, new Voice()),
				new ParameterTemplate("Voice 2", 18, 4, new Voice()),
				new ParameterTemplate("Level 1", 60, new OutLev()), new ParameterTemplate("Level 2", 66, new OutLev()),
				new ParameterTemplate("Pan 1", 24, new Pan()), new ParameterTemplate("Pan 2", 30, new Pan()),
				new ParameterTemplate("Delay 1", 36, 4, new PitchDelay()),
				new ParameterTemplate("Delay 2", 42, 4, new PitchDelay()),
				new ParameterTemplate("Feedback 1", 48, new PitchFeedback()),
				new ParameterTemplate("Feedback 2", 54, new PitchFeedback()), new ParameterTemplate("Mix", 72),
				new ParameterTemplate("OutLev", 78, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}

/*
 * Pitch Shifter Der Pitch Shifter des G-System kann zwei zus�tzliche,
 * transponierte Stimmen zum Eingangssignal erzeugen, die in einem festen
 * Abstand der Tonh�he des Eingangssignals folgen. Der maximale Umfang f�r
 * diesen Effekt betr�gt eine Oktave unter oder �ber der Originaltonh�he. Die
 * Signalverarbeitung im G-System erfolgt dabei mit so hoher Geschwindigkeit,
 * dass Sie sich niemals �ber h�rbares �Suchen nach der richtigen Tonh�he�
 * �rgern m�ssen, wie es bei �lteren Octaver-Effekten der Fall war. Sie k�nnen
 * zum Beispiel eine der beiden von diesem Effekt erzeugten Stimmen um 1200 Cent
 * nach unten transponieren (100 Cent entsprechen einem Halbton). Bei einer
 * MixEinstellung von 100 % (nur Effekt, kein unbearbeitetes Signal) sollten Sie
 * damit eine recht �berzeugende �Bass-Simulation� erhalten.
 * 
 * Parameter �Voice 1� Wertebereich: -1200 bis 1200 Cent Dieser Parameter
 * definiert die Tonh�he der ersten Stimme � beziehungsweise ihr Intervall im
 * Verh�ltnis zur Originaltonh�he. 100 Cent entsprechen einem Halbton. Sie
 * k�nnen also jedes Intervall zwischen einer Oktave unter und �ber der
 * Originaltonh�he einstellen.
 * 
 * Parameter �Voice 2� Wertebereich: -1200 bis 1200 Cent Dieser Parameter
 * definiert die Tonh�he der zweiten Stimme � beziehungsweise ihr Intervall im
 * Verh�ltnis zur Originaltonh�he. 100 Cent entsprechen einem Halbton. Sie
 * k�nnen also jedes Intervall zwischen einer Oktave unter und �ber der
 * Originaltonh�he einstellen.
 * 
 * Parameter �Pan 1� Wertebereich: -50 bis 50 Mit diesem Parameter legen Sie die
 * Stereoposition der ersten vom Pitch Shifter erzeugten Stimme fest.
 * 
 * Parameter �Pan 2� Wertebereich: -50 bis 50 Mit diesem Parameter legen Sie die
 * Stereoposition der zweiten vom Pitch Shifter erzeugten Stimme fest.
 * 
 * Parameter �Delay 1� Wertebereich: 0 bis 350 ms Mit diesem Parameter legen Sie
 * die Verz�gerung f�r die erste vom Pitch Shifter erzeugte Stimme fest.
 * 
 * Parameter �Delay 2� Wertebereich: 0 bis 350 ms Mit diesem Parameter legen Sie
 * die Verz�gerung f�r die zweite vom Pitch Shifter erzeugte Stimme fest.
 * 
 * Parameter �Fb1� Wertebereich: 0 bis 100 % Mit diesem Parameter geben Sie an,
 * wie oft die erste vom Pitch Shifter erzeugte Stimme vom integrierten Delay
 * wiederholt werden soll.
 * 
 * Parameter �Fb2� Wertebereich: 0 bis 100 % Mit diesem Parameter geben Sie an,
 * wie oft die zweite vom Pitch Shifter erzeugte Stimme vom integrierten Delay
 * wiederholt werden soll.
 * 
 * Parameter �Mix� Wertebereich: 0 bis 100 % Mit diesem Parameter legen Sie das
 * Mischungsverh�ltnis zwischen trockenem (unbearbeitetem) Signal und dem Pegel
 * des Effekts f�r diesen Effektblock fest.
 * 
 * Parameter �OutLev� (Ausgangspegel) Wertebereich: -100 bis 0 dB Mit diesem
 * Parameter legen Sie den gesamten Ausgangspegel f�r diesen Effekt fest.
 * 
 * 
 * Parameter �Enable� Wertebereich: �Off� / �On� Mit diesem Parameter legen Sie
 * den Status des Effekts fest (anoder ausgeschaltet). Alle f�r diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 */