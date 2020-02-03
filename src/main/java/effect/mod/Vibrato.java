package effect.mod;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.Depth;
import effect.values.Freq20Hz220kHz;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Speed;
import effect.values.Tempo;

public class Vibrato extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Vibrato";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Speed", 24, new Speed()),
				new ParameterTemplate("Tempo", 18, new Tempo()), new ParameterTemplate("Depth", 30, new Depth()),
				new ParameterTemplate("Hi Cut", 36, new Freq20Hz220kHz()), new ParameterTemplate("OutLev", 48, new OutLev()),
				new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}
/*
 * Parameter »Speed« Werte: 0.050Hz bis 20 kHz Mit diesem Parameter legen Sie
 * die Geschwindigkeit des Effekts fest.
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
 * Parameter »Depth« Werte: 0 bis 100 % Mit dem Parameter »Depth« legen Sie die
 * Intensität des Effekts fest. Der hier angegebene Wert stellt die Amplitude
 * der zur Modulation verwendeten Wellenform dar.
 * 
 * Parameter »HiCut« Werte: 20 Hz bis 20 kHz Mit diesem Parameter legen Sie den
 * Anteil der höheren Frequenzen am Vibratoeffekt fest. Verwenden Sie diesen
 * Parameter, wenn der Effekt zu dominant wirkt.
 * 
 * Parameter »OutLev« (Ausgangspegel) Werte: -100 bis 0 dB Mit diesem Parameter
 * legen Sie den gesamten Ausgangspegel für diesen Effekt fest.
 * 
 * Parameter »Enable« Werte: »Off« / »On« Mit diesem Parameter legen Sie den
 * Status des Effekts fest (anoder ausgeschaltet). Alle für diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 */
