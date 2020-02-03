package effect.filter;

import effect.ParameterTemplate;
import effect.values.FMax;
import effect.values.FilterHicut;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Resnce;
import effect.values.Speed;
import effect.values.Style;
import effect.values.Tempo;

public class AutoResFilter extends SubEffectFilter {

	@Override
	public String getName() {
		return "Auto Resonance Filter";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Style", 24, new Style()),
				new ParameterTemplate("HiCut", 48, new FilterHicut(), 18), new ParameterTemplate("Resnce", 54, new Resnce()),
				new ParameterTemplate("OutLev", 72, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()),
				new ParameterTemplate("Speed", 60, new Speed()), new ParameterTemplate("Tempo", 18, new Tempo()),
				new ParameterTemplate("Shape", 66), new ParameterTemplate("Fmax", 42, new FMax(), 34) };
	}
}

/*
 * Auto Resonance-Filter – zusätzliche Parameter
 * 
 * Parameter »Speed« Wertebereich: 0,050Hz bis 20 kHz Mit diesem Parameter legen
 * Sie die Geschwindigkeit des Effekts fest.
 * 
 * Parameter »Tempo« Wertebereich: »Ignore«, 1 bis 1/32T Wenn Sie diesen
 * Parameter auf einen Wert zwischen 1 (ganze Note) und 1/32T
 * (Zweiunddreißigsteltriole) einstellen, wird das globale Tempo des G-System
 * entsprechend dieser Einstellung geteilt. Dieser geteilte Wert wird für die
 * Geschwindigkeit des Effekts zugrunde gelegt. Bei der Einstellung »Ignore«
 * wird stattdessen die mit dem Parameter »Speed« angegebene Geschwindigkeit
 * verwendet.
 * 
 * Parameter »Shape« Werte: »Triangle« oder »Sine« Mit diesem Parameter legen
 * Sie die für die Modulation verwendete Wellenform fest. »Triangle« (Dreieck)
 * hat einen sitzen Scheitelpunkt, während »Sine« (Sinuswelle) für eine weichere
 * Modulation sorgt.
 * 
 * Parameter »Fmax« (maximale Frequenz) Wertebereich: 1 kHz bis 10kHz Mit diesem
 * Parameter können Sie den vom Filtersweep durchlaufenen Frequenzbereich
 * begrenzen. Wenn Sie den vollen Frequenzbereich nutzen, wird der Effekt Ihnen
 * vielleicht zu aufdringlich und höhenreich klingen. Mit einer Einstellung
 * zwischen 2 kHz und 4 kHz erzielen Sie in der Regel die besten Ergebnisse.
 */