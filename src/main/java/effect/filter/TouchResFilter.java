package effect.filter;

import effect.ParameterTemplate;
import effect.values.FMax;
import effect.values.FilterHicut;
import effect.values.OffOn;
import effect.values.OutLev;
import effect.values.Resnce;
import effect.values.Response;
import effect.values.Style;

public class TouchResFilter extends SubEffectFilter {

	@Override
	public String getName() {
		return "Touch Resonance Filter";
	}

	@Override
	public ParameterTemplate[] getParameterTemplates() {
		return new ParameterTemplate[] { new ParameterTemplate("Style", 24, new Style()),
				new ParameterTemplate("HiCut", 48, new FilterHicut(), 18), new ParameterTemplate("Resnce", 54, new Resnce()),
				new ParameterTemplate("OutLev", 72, new OutLev()), new ParameterTemplate("Enable", 6, new OffOn()),
				new ParameterTemplate("Sense", 30), new ParameterTemplate("Response", 36, new Response()),
				new ParameterTemplate("Fmax", 42, new FMax(), 34) };
	}
}

/*
 * Der Touch Resonance Filter erzeugt einen Effekt, der einem Touch Wah-Effekt
 * ähnelt. Er erzeugt einen Filter-Sweep, der von der Dynamik des
 * Eingangssignals gesteuert wird.
 * 
 * Parameter »Sense « (Empfindlichkeit) Wertebereich: 0 bis 10 Dieser Parameter
 * sollte an den Eingangspegel des Filterblocks angepasst werden. Je niedriger
 * Sie diesen Parameter einstellen, um so lauter muss der Effekt angespielt
 * werden, um den »Whack«-Effekt zu erzeugen.
 * 
 * Parameter »Response« Werte: »Slow« / »Fast« Mit diesem Parameter stellen Sie
 * die Ansprechzeit ein – also die Zeit, die zwischen dem Anschlagen der Saiten
 * und dem charakteristischen »Whack«-Effekt vergeht. Parameter »Fmax« (maximale
 * Frequenz) Wertebereich: 1 kHz bis 10 kHz Mit diesem Parameter können Sie den
 * vom Filtersweep durchlaufenen Frequenzbereich begrenzen. Wenn Sie den vollen
 * Frequenzbereich nutzen, wird der Effekt Ihnen vielleicht zu aufdringlich und
 * höhenreich klingen. Mit einer Einstellung zwischen 2 kHz und 4 kHz erzielen
 * Sie in der Regel die besten Ergebnisse.
 */
