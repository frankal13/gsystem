package effect.mod;

import effect.ParameterTemplate;
import effect.SubEffectTemplate;
import effect.values.Depth;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Range;
import effect.values.Speed;
import effect.values.Tempo;
import effect.values.VintagePhaserFeedback;

public class VintagePhaser extends SubEffectTemplate {
	@Override
	public String getName() {
		return "Vintage Phaser";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Speed", 24, new Speed()),
				new ParameterTemplate("Tempo", 18, new Tempo()), new ParameterTemplate("Depth", 30, new Depth()),
				new ParameterTemplate("Feedback", 36, new VintagePhaserFeedback()),
				new ParameterTemplate("Range", 52, new Range()), new ParameterTemplate("Reverse", 48, new OffOn()),
				new ParameterTemplate("Mix", 54), new ParameterTemplate("OutLev", 60, new OutLev()),
				new ParameterTemplate("Enable", 6, new OffOn()) };
	}
}

// new ParameterTemplate("Hi Cut", 36, new ModHicut()),

/*
 * Phasermodells bildet.
 * 
 * Parameter »Speed« Werte: 0,050Hz bis 20 kHz Mit diesem Parameter legen Sie
 * die Geschwindigkeit des Effekts fest.
 * 
 * Parameter »Tempo« Werte: »Ignore«, 2 bis 1/32T Wenn Sie diesen Parameter auf
 * einen Wert zwischen 2 und 1/32T einstellen, wird das globale Tempo des
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
 * Parameter »FeedB« (FeedBack) Wertebereich: -100 bis +100 % Dieser Parameter
 * steuert den Grad der Rückkopplung (Feedback) im Phaser. Wenn Sie für diesen
 * Parameter eine negative Einstellung wählen, wird die Phase des Signalanteils,
 * der an den Eingang zurückgeführt wird, umgekehrt.
 * 
 * Parameter »Range« Wertebereich: »Low« bis »High« Mit diesem Parameter geben
 * Sie an, ob der Phasereffekt vorrangig auf den unteren (»Low«) oder oberen
 * (»High«) Frequenzbereich wirken soll.
 * 
 * Parameter »Rev« (Reverse) Werte: »On« / »Off« Wenn Sie diesen Parameter
 * aktivieren (»On«), wird die Phase in einem Kanal umgekehrt. Das Ergebnis ist
 * ein wesentlich räumlicher klingender Effekt.
 * 
 * Parameter »Mix« Werte: 0 bis 100 % Mit diesem Parameter legen Sie das
 * Mischungsverhältnis zwischen trockenem (unbearbeitetem) Signal und dem Pegel
 * des Effekts für diesen Effektblock fest.
 * 
 * Parameter »OutLev« (Ausgangspegel) Werte: -100 bis 0 dB Mit diesem Parameter
 * legen Sie den gesamten Ausgangspegel für diesen Effekt fest.
 * 
 * Parameter »Enable« Werte: »Off« / »On« Mit diesem Parameter legen Sie den
 * Status des Effekts fest (anoder ausgeschaltet). Alle für diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 */