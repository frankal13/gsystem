package effect.mod;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.Depth;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Speed;
import effect.values.Tempo;

public class Panner extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Panner";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Speed", 24, new Speed()),
				new ParameterTemplate("Tempo", 18, new Tempo()), new ParameterTemplate("Depth", 30, new Depth()),
				new ParameterTemplate("OutLev", 60, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()) };

	}
}

/*
 * Panner Einleitung Der Panner bewegt das Signal einfach zwischen dem linken
 * und rechten Kanal im Panorama hin und her. Verwenden Sie diesen Effekt für
 * extreme perspektivische Stereoeffekte.
 * 
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
 * Parameter »Depth« Wertebereich: 0 bis 100 % Wenn Sie diesen Parameter auf
 * »100 %« einstellen, wird das Signal bei einem Durchlauf der modulierenden
 * Wellenform vollständig vom einen zum anderen Kanal bewegt. In der Regel
 * werden Sie jedoch mit etwas niedrigeren Einstellungen bessere Ergebnisse
 * erzielen, die sich auch besser in den Gesamtsound einfügen.
 * 
 * Parameter »OutLev« (Ausgangspegel) Wertebereich: -100 bis 0 dB Mit diesem
 * Parameter legen Sie den gesamten Ausgangspegel für diesen Effekt fest.
 * 
 * Parameter »Enable« Wertebereich: »Off« / »On« Mit diesem Parameter legen Sie
 * den Status des Effekts fest (anoder ausgeschaltet). Alle für diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 * 
 */
