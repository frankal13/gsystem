package effect.mod;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.Depth;
import effect.values.Freq20Hz220kHz;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Speed;
import effect.values.Tempo;

public class ClassicChorus extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Classic Chorus";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Speed", 24, new Speed()),
				new ParameterTemplate("Tempo", 18, new Tempo()), new ParameterTemplate("Depth", 30, new Depth()),
				new ParameterTemplate("Hi Cut", 36, new Freq20Hz220kHz()), new ParameterTemplate("Mix", 42),
				new ParameterTemplate("OutLev", 48, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}
/*
 * Parameter »Speed« Wertebereich: 0,050Hz bis 20 kHz Mit diesem Parameter legen
 * Sie die Geschwindigkeit des Effekts fest.
 * 
 * Parameter »Tempo« Werte: »Ignore«, 1 bis 1/32T Wenn Sie diesen Parameter auf
 * einen Wert zwischen 1 und 1/32T einstellen, wird das globale Tempo des
 * G-System entsprechend dieser Einstellung geteilt. Dieser geteilte Wert wird
 * für die Geschwindigkeit des Effekts zugrunde gelegt. Bei der Einstellung
 * »Ignore« wird stattdessen die mit dem Parameter »Speed« angegebene
 * Geschwindigkeit verwendet. Mit dem Parameter »Tap Master« im Utility-Menü
 * geben Sie an, ob bei einem Presetwechsel das globale Tempo oder das mit dem
 * Parameter »Speed« im gewählten Preset festgelegte Tempo verwendet werden
 * soll.
 * 
 * Parameter »Depth« Wertebereich: 0 bis 100 % Mit dem Parameter »Depth« legen
 * Sie die Intensität des Effekts fest. Der hier angegebene Wert stellt die
 * Amplitude der zur Modulation verwendeten Wellenform dar.
 * 
 * Parameter »HiCut« Wertebereich: 20 Hz bis 20 kHz Mit diesem Parameter legen
 * Sie den Anteil der höheren Frequenzen am Choruseffekt fest. Verwenden Sie
 * diesen Parameter, wenn der Choruseffekt zu dominant wirkt und Sie ihn mit den
 * Parametern »Mix« und »Out Level« nicht auf zufrieden stellende Weise
 * »bändigen« können.
 * 
 * Parameter »Mix« Wertebereich: 0 bis 100 % Mit diesem Parameter legen Sie das
 * Mischungsverhältnis zwischen trockenem (unbearbeitetem) Signal und dem Pegel
 * des Effekts für diesen Effektblock fest.
 * 
 * Parameter »OutLev« (Ausgangspegel) Wertebereich: -100 bis 0 dB Mit diesem
 * Parameter legen Sie den gesamten Ausgangspegel für diesen Effekt fest.
 * 
 * Parameter »Enable« Wertebereich: »Off« / »On« Mit diesem Parameter legen Sie
 * den Status des Effekts fest (anoder ausgeschaltet). Alle für diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 */