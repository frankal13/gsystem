package effect.filter;

import effect.ParameterTemplate;
import effect.values.FilterHicut;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Resnce;
import effect.values.Style;

public class ResonanceFilter extends SubEffectFilter {

	@Override
	public String getName() {
		return "Resonance Filter";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Style", 24, new Style()),
				new ParameterTemplate("HiCut", 48, new FilterHicut(), 18), new ParameterTemplate("Resnce", 54, new Resnce()),
				new ParameterTemplate("OutLev", 72, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()) };
	}

}

/*
 * Parameter »Style« Werte: »2nd« oder »4th« Mit dem Parameter »Style« stellen
 * Sie die Flankensteilheit der Filter ein. Filter zweiter Ordnung (Einstellung
 * »2nd«) haben eine Flankensteilheit von 12dB/Oktave, während es bei Filtern
 * vierter Ordnung (Einstellung »4th«) 24 dB/Oktave sind. Die Resonanz (die
 * »Selbstoszillation«) des Filters ist bei Filtern vierter Ordnung stärker.
 * 
 * Parameter »HiCut« Werte: 160 Hz bis 14 kHz Dieser Parameter reduziert den
 * Anteil hoher Frequenzen am erzeugten Effekt. Frequenzen über der hier
 * angegebenen Eckfrequenz werden abgesenkt.
 * 
 * Parameter »Resnce« (Resonanz) Wertebereich: 0 bis 100 % Mit diesem Parameter
 * legen Sie die Resonanz für den Highcutfilter fest.
 * 
 * Parameter »OutLev« (Ausgangspegel) Wertebereich: -100 bis 0dB Mit diesem
 * Parameter legen Sie den gesamten Ausgangspegel für diesen Effekt fest.
 * 
 * Parameter »Enable« Werte: »Off« / »On« Mit diesem Parameter legen Sie den
 * Status des Effekts fest (anoder ausgeschaltet). Alle für diesen Effekt
 * vorgenommenen Einstellungen werden auch dann als Bestandteil des Presets
 * gespeichert, wenn der Effekt abgeschaltet wird.
 * 
 */
