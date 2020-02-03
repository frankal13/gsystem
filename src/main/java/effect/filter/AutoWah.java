package effect.filter;

import effect.ParameterTemplate;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Range;
import effect.values.Shape;
import effect.values.Speed;
import effect.values.Tempo;

public class AutoWah extends SubEffectFilter {

	@Override
	public String getName() {
		return "Auto Wah";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Speed", 36, new Speed()),
				new ParameterTemplate("Tempo", 18, new Tempo()), new ParameterTemplate("Range", 54, new Range()),
				new ParameterTemplate("Shape", 42, new Shape()), new ParameterTemplate("OutLev", 60, new OutLev()),
				new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}

/*
 * Auto Wah Der �Wah�-Effekt entsteht, wenn ein Filter f�r die Anhebung eines
 * relativ schmalen Frequenzbereichs eingestellt und dieser Frequenzbereich
 * verschoben wird. Die Verschiebung dieses Frequenzbereichs (der �Sweep�) wird
 * durch einen tieffrequenten Oszillator (LFO) gesteuert.
 * 
 * Parameter �Speed� Wertebereich: 0,050Hz bis 20 kHz Mit diesem Parameter legen
 * Sie die Geschwindigkeit des Effekts fest.
 * 
 * Parameter �Tempo� Werte: �Ignore�, 2 bis 1/32T Wenn Sie diesen Parameter auf
 * einen Wert zwischen 2 und 1/32T einstellen, wird das globale Tempo des
 * G-System entsprechend dieser Einstellung geteilt. Dieser geteilte Wert wird
 * f�r die Geschwindigkeit des Effekts zugrunde gelegt. Bei der Einstellung
 * �Ignore� wird stattdessen die mit dem Parameter �Speed� angegebene
 * Geschwindigkeit verwendet. Parameter �Shape� Werte: �Triangle� oder �Sine�
 * Legt die Wellenform f�r die von diesem Effekt durchgef�hrte Frequenzanhebung
 * fest.
 * 
 * Parameter �Range� Werte: �Low� oder �High� Dieser Parameter bestimmt, ob der
 * Auto Wah-Effekt eher auf tiefe oder hohe Frequenzen ansprechen soll.
 * 
 * Parameter �OutLev� (Ausgangspegel) Wertebereich: -100 bis 0 dB Mit diesem
 * Parameter legen Sie den gesamten Ausgangspegel f�r diesen Effekt fest.
 * 
 * Parameter �Enable� Werte: �Off� / �On� Mit diesem Parameter legen Sie den
 * Status des Effekts fest (anoder ausgeschaltet). Alle f�r diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 */