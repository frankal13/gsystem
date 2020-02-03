package effect.mod;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.Depth;
import effect.values.Feedback;
import effect.values.Freq20Hz220kHz;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Speed;
import effect.values.Tempo;

public class ClassicFlanger extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Classic Flanger";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Speed", 24, new Speed()),
				new ParameterTemplate("Tempo", 18, new Tempo()), new ParameterTemplate("Depth", 30, new Depth()),
				new ParameterTemplate("Hi Cut", 36, new Freq20Hz220kHz()),
				new ParameterTemplate("Feedback", 72, new Feedback()),
				new ParameterTemplate("FB Cut", 78, new Freq20Hz220kHz()), new ParameterTemplate("Mix", 42),
				new ParameterTemplate("OutLev", 48, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}
/*
 * Classic Flanger
 * 
 * Parameter �Speed� Werte: 0,050Hz bis 20 kHz Mit diesem Parameter legen Sie
 * die Geschwindigkeit des Effekts fest.
 * 
 * Parameter �Tempo� Werte: �Ignore�, 1 bis 1/32T Wenn Sie diesen Parameter auf
 * einen Wert zwischen 1 und 1/32T einstellen, wird das globale Tempo des
 * G-System entsprechend dieser Einstellung geteilt. Dieser geteilte Wert wird
 * f�r die Geschwindigkeit des Effekts zugrunde gelegt. Bei der Einstellung
 * �Ignore� wird stattdessen die mit dem Parameter �Speed� angegebene
 * Geschwindigkeit verwendet. Mit dem Parameter �Tap Master� im Utility-Men�
 * geben Sie an, ob bei einem Presetwechsel das globale Tempo oder das mit dem
 * Parameter �Speed� im gew�hlten Preset festgelegte Tempo verwendet werden
 * soll.
 * 
 * Parameter �Depth� Wertebereich: 0 bis 100 % Mit dem Parameter �Depth� legen
 * Sie die Intensit�t des Effekts fest. Der hier angegebene Wert stellt die
 * Amplitude der zur Modulation verwendeten Wellenform dar.
 * 
 * Parameter �HiCut� Wertebereich: 20 Hz bis 20 kHz Mit diesem Parameter k�nnen
 * Sie den Anteil der h�heren Frequenzen am Flangereffekt vermindern. Verwenden
 * Sie diesen Parameter, wenn der Flangereffekt zu dominant wirkt und Sie ihn
 * mit den Parametern �Mix� und �Out Level� nicht auf zufrieden stellende Weise
 * �b�ndigen� k�nnen.
 * 
 * Parameter �FeedB� (FeedBack) Wertebereich: -100 bis 100 Dieser Parameter
 * steuert den Grad der R�ckkopplung (Feedback) des kurzen modulierten Delays,
 * das f�r den typischen Flanger-Effekt verantwortlich ist. Ein zu hoher
 * Feedback-Wert (zwischen 90 % und 95 %) kann zu einem internen Feedback
 * f�hren, das als �jaulendes� Nebenger�usch h�rbar wird und normalerweise nicht
 * erw�nscht ist. Achten Sie auf diesen Nebeneffekt besonders dann, wenn Sie mit
 * hohen Pegeln arbeiten. Wenn Sie f�r diesen Parameter eine negative
 * Einstellung w�hlen, wird die Phase des Signalanteils, der an den Eingang
 * zur�ckgef�hrt wird, umgekehrt.
 * 
 * Parameter �FB Cut� (Feedback Highcut) Wertebereich: 20 Hz bis 20 kHz Mit
 * diesem Parameter k�nnen Sie die oberen Frequenzen der mit dem
 * �Feedback�-Parameter erzeugten Resonanzen abschw�chen.
 * 
 * Parameter �Mix� Wertebereich: 0 bis 100 % Mit diesem Parameter legen Sie das
 * Mischungsverh�ltnis zwischen trockenem (unbearbeitetem) Signal und dem Pegel
 * des Effekts f�r diesen Effektblock fest.
 * 
 * Parameter �OutLev� (Ausgangspegel) Wertebereich: -0 bis 0dB Mit diesem
 * Parameter legen Sie den gesamten Ausgangspegel f�r diesen Effekt fest.
 * 
 * Parameter �Enable� Wertebereich: �Off� / �On� Mit diesem Parameter legen Sie
 * den Status des Effekts fest (anoder ausgeschaltet). Alle f�r diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 */
